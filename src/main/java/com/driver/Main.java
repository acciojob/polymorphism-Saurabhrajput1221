package com.driver;

public class Main {
   public class Product{
   
   
   public int product(int x, int y) {
   return (x*y);
   }
   
   public int product(int x, int y, int z) {
   return (x*y*z);
   }
   
   public double product(double x, double y) {
   return (x*y);
   }
   }
  public static void main(String[] args){
  Product P = new Product();
    P.product(4,4);
    P.product(4,4, 5);
    P.product(4.4, 5.6);
  }
}
