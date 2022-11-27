package com.o7BitManipulation;

import java.util.ArrayList;

class Solution {

    public static void main(String[] args) {
        System.out.println(kthFactor(4,4));
    }
    static  public int kthFactor(int n, int k) {
       ArrayList<Integer> l=new ArrayList<>();
        int j=0;
        for(int i=1;i<=n;i++)
        {
            if((n%i)==0)
            {
                l.add(j,i);
                j++;
            }
        }
        if(l.size()>=k){
        int ans=l.get(k-1);
        return ans;}
    return -1;
    }
}