package com.company;

import java.util.ArrayDeque;

public class arraydeque {
    public static void main(String[] args)
    {
        ArrayDeque<Integer> ad1= new ArrayDeque<>();
        ad1.add(7);
        ad1.add(13);
        ad1.add(18);
        ad1.addFirst(5);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());

    }
}
