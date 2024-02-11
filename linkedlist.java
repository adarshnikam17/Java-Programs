package com.company;

import java.util.*;
public class linkedlist {
    public static void main(String[] args)
    {
        LinkedList<Integer> l1 =new LinkedList<>();
        LinkedList<Integer> l2 =new LinkedList<>();

        l2.add(111);
        l2.add(278);
        l2.add(345);

        l1.add(7);
        l1.add(13);
        l1.add(18);
        l1.add(31);
        l1.add(48);

        l1.addFirst(600);
        l1.addLast(500);

        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(7));
        System.out.println(l1.lastIndexOf(7));

        for(int i=0; i<l1.size(); i++)
        {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
