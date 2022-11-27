package com.Algorithm;

import java.util.Stack;

public class New {

    public static void main(String[] args) {

//        Integer a=new Integer(10);
//        increase(a);
//        System.out.println(a);
        Stack<Integer>  s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s);
       reverse(s);
        System.out.println(s);
    }

    private static void increase(Integer a) {
        a++;
        return ;
    }

    private static void reverse(Stack<Integer> s)
    {
        if(s.isEmpty())
            return;

        int remove=s.pop();
        reverse(s);
        s.add(0,remove);
    }
}
