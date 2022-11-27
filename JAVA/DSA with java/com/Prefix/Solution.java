package com.Prefix;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {

        HashMap<String, Integer> map
                = new HashMap<>();
        map.put("a", 100);
//        map.put("b", 300);
        map.put("c", 300); 
        map.put("d", 400);

        // print map details
        System.out.println("HashMap: "
                + map.toString());

        // provide key whose value has to be obtained
        // and default value for the key. Store the
        // return value in k
        int k = map.getOrDefault("b", 500);

        // print the value of k returned by
        // getOrDefault(Object key, V defaultValue) method
        System.out.println("Returned Value: " + k);

    }

        static  public int subarraySum(int[] nums, int k) {
            //  through this i can get a prefix sum
            if(nums.length==1 && nums[0]==k)
                return 1;
            else if(nums.length==1 && nums[0]!=k)
                return 0;
            for(int i=1;i<nums.length;i++)
            {
                nums[i]+=nums[i-1];
            }
            // now we can check all possible outcomes
            int count=0;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==k )
                {
                    count++;
                }
                for(int j=0;j<i;j++)
                {
                    if((nums[i]-nums[j])==k)
                        count++;
                }
            }
            return count;
        }
    }
