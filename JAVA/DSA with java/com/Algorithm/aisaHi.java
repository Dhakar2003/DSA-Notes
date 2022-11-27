package com.Algorithm;

import java.util.*;

public class aisaHi {

    public static void main(String[] args) {
        HashMap<int[],Integer> set=new HashMap<>();
        int[] a={1,2,3};
        int[] b={1,2,3};

       set.put(a, set.getOrDefault(a,0)+1);
        set.put(b, set.getOrDefault(b,0)+1);
        System.out.println(set);
    }

    static public void ans(List<List<Integer>> ans,List<Integer> list,int val,int val2)
    {
        if(val==0)
        {
            ans.add(list);
            return;
        }
        if(val2==0)
        {
            ans.add(list);
            return;
        }

        list.add(val2);

            list.add(val);
        ans(ans,list,val,val2-1);

    }
}
