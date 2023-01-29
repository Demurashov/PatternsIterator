package org.example;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    int outRnd;
    private Random random;
    private int offNum;
    private int min;
    private int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        random = new Random();
    }

    public int getRnd() {
        return new Random().nextInt((max - min) + 1) + min;
    }

    public void setOffNum(int offNum) {
        this.offNum = offNum;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new rndIterator();
    }

    private class rndIterator implements Iterator {
        @Override
        public boolean hasNext() {
            return (int) next() != offNum;
        }

        @Override
        public Object next() {
            return new Randoms(min, max).getRnd();
        }


    }

}
