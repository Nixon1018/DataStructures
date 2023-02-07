package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

class Flexible {
    int[] arr;
    int size = 0;
    private static final Logger logger = Logger.getLogger("InfoLogging");

    void increase() {
        if (size == 0) {

            arr = new int[1];
            size += 1;
        } else {
            int[] temp = new int[size + 1];
            for (int i = 0; i < size; i += 1) {
                temp[i] = arr[i];

            }
            arr = temp;
            size += 1;
        }
    }

    void decrease() {
        int[] temp = new int[size - 1];
        for (int i = 0; i < size-1; i += 1) {
            temp[i] = arr[i];
        }
        arr = temp;

        size--;
    }

    void add(int data) {
        increase();
        arr[size - 1] = data;
    }

    void remove()
    {
        if(size==0)
        {
            logger.info("The array is empty");
        }
        else {
            decrease();
        }
    }
    void print()
    {
        for(int i=0;i<size;i+=1)
        {
            String z=" "+arr[i];
            logger.info(z);
        }
    }
}
public class Array {
    private static final Logger logger = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
     int check=1;
     Scanner sc= new Scanner(System.in);
     Flexible f=new Flexible();
     while(check==1) {
         logger.info("1.add 2.remove 3.print 4.exit");
         int chose=sc.nextInt();
         if(chose==1) {
             logger.info("Enter the element:");
             int x=sc.nextInt();
             f.add(x);
         }
         else if(chose==2) {
             f.remove();
         }
         else if(chose==3) {
             f.print();
         }
         else
         {
             check=0;
         }
     }
    }
}