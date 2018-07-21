package com.shejimoshi.iterator;

import java.util.List;

public class ConcreateIterator implements Iterator{
     private List list = null;
     private int index;
     public ConcreateIterator(List list){
         this.list=list;
         this.index=list.size();
     }
    @Override
    public boolean hasNext() {
         if(index<=list.size()){
             return true;
         }
         else{
             return false;
         }
    }

    @Override
    public Object next() {
        Object object = list.get(index);
                index++;
                return object;
    }
}
