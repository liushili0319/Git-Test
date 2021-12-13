package com.liu.Git;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Stream;

public class Git {
    public static void main(String[] args) {
        System.out.println("Hello GIt!");
        System.out.println("Hello GIt2!");
        System.out.println("Hello GIt3!");
        System.out.println("Hello GIt4!");
        System.out.println("master test");
        System.out.println("new-fix test");
        System.out.println("push test");
        Integer[] arr={1,5,3,2};
        Arrays.sort(arr, (o1, o2) -> Integer.compare(o1,o2)); // lambda 表达式
    }
}
