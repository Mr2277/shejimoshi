package com.shejimoshi.iterator;

public interface Iterator<T> {
    /**
     * 是否还有下一个元素
     * @return  true 表示有，false 表示没有
     * */
    boolean hashNext();
    T next();
}
