package com.shejimoshi.factory.breakfast;

public class simpleFactory {
    public product getinstance(String type){
        if(type.equals("roubaozi")){
            return new roubaozi();
        }
        else{
            return new subaozi();
        }
    }
}
