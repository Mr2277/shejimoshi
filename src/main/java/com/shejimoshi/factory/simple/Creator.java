package com.shejimoshi.factory.simple;

import com.shejimoshi.factory.simple.imp.IProduct;
import com.shejimoshi.factory.simple.impl.ProductA;
import com.shejimoshi.factory.simple.impl.ProductB;

public class Creator {
    private Creator(){}

    public static IProduct createProduct(String productName){
        if (productName == null) {
            return null;
        }
        if (productName.equals("A")) {
            return new ProductA();
        }else if (productName.equals("B")) {
            return new ProductB();
        }else {
            return null;
        }
    }

}
