package com.shejimoshi.factory.breakfast;

public class subaozifactory implements factory{
    @Override
    public product get() {
        return new subaozi();
    }
}
