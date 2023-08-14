package com.hyfedu;

/**
 * @Author: EzioHe
 * @Date: 2023/8/12 22:39
 */
public class Car {
    public String brand="宝马";
    public int price=500000;
    public String color="白色";

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
