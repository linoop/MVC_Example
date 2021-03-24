package com.example.mvc;

import java.util.Observable;

public class Model extends Observable {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
        setChanged();
        notifyObservers();
    }
}
