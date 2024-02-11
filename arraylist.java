package com.company;

import java.util.*;
public class arraylist {
    public static void main(String[] args)
    {
        ArrayList<Integer> l1 =new ArrayList<>();

        l1.add(7);
        l1.add(13);
        l1.add(18);
        l1.add(31);
        l1.add(48);

        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(7));
        System.out.println(l1.lastIndexOf(4));

        l1.set(2,200);
        for(int i=0; i<l1.size(); i++)
        {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
