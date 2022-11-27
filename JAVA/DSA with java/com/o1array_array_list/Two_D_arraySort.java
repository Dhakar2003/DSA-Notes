package com.o1array_array_list;

import java.util.Arrays;

public class Two_D_arraySort {

    public static void main(String[] args) {
        int[][] a={{1,3},{9,6},{8,10},{15,18}};
        Arrays.sort(a,(ar1,ar2)->Integer.compare(ar1[0],ar2[0]));

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.println(a[i][j]);
            }
        }
        int[] b=a[0];
        System.out.println(Arrays.toString(a[0]));
    }
}
