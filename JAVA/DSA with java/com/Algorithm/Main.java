package com.Algorithm;

// driver function
class Main{
  public static void main (String [] arguments)
  {
    int number = 1;
    // printing before update.
    System.out.println("number = " + number);
    // update function returns a value.
    number = update(number);
    // printing after update.
    System.out.println("number = " + number);
  } 
  // update function
    public static int update( int num ){
    // increments number.       
     num++;
     return num;
    }
}