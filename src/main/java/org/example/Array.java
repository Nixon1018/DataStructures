package org.example;

import java.util.Scanner;
import java.util.logging.Logger;
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
