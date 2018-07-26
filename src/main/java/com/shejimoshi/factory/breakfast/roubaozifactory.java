package com.shejimoshi.factory.breakfast;

public class roubaozifactory implements factory {
    @Override
    public product get() {
        return new roubaozi();
    }
}
