package com.hyfstu.pkg;

import java.util.Arrays;

//import java.util.Scanner;
//只引入java.util 包下的 Scanner类
//import java.util.*;
//将 java.util 包下的所有类都引入
public class import01 {
    public static void main(String[] args) {
        int[]arr={-1,20,2,13,3};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
