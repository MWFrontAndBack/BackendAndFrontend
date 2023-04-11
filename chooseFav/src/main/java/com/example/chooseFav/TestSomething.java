package com.example.chooseFav;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class TestSomething {
    public static void main(String[] args) {
        List<String> np = Arrays.asList("tak","nie","ale");
        Stack<String> napisy = new Stack<>();
        napisy.addAll(np);
        System.out.println(napisy);
    }
}
