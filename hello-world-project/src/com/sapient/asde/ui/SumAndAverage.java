package com.sapient.asde.ui;

/**
 * @author manrasal
 * Java has 8 primitive types
 *      byte(1 byte), short(2), int(4), long(8), float(4), double(8),
 *      char (2), boolean (1 bit valid values: true or false)
 *
 *      Every primitive type has a corresponding wrapper class
 *      Byte, Short, Integer, Long, Float, Double, Character,
 *      Boolean (valid values: true/false/null)
 *
 *      There are two types:
 *      1. primitive types
 *      2. reference type: they hold references(addresses to the memory blocks placed in the heap)
 *          Three types of references:
 *              a. Class name
 *              b. Interface name
 *              c. Array name
 *
 *              String greet = "Hi, Welcome";
 */

public class SumAndAverage {
    public static void main(String[] args) {
        int sum = 0;
        try {
            if(args.length==0){
                throw new IllegalArgumentException("Enter Commandline arguments");
            }
            for(int i=0;i<args.length;i++){
                sum+=Integer.parseInt(args[i]);
            }
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }

        try {
            double average=(double)sum/args.length;
            System.out.println(average);
        }catch (NumberFormatException e){
            e.printStackTrace();
        }

    }
}
