package com.shejimoshi.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteIterator<T>implements Iterator {
    private List<T> list = new ArrayList<>();
    private int cursor = 0;

    @Override
    public boolean hashNext() {
        return cursor != list.size();

    }

    @Override
    public Object next() {
        T obj = null;
        if(this.hasNext()){
            obj = this.list.get(cursor++);
        }
        return obj;
    }

}
