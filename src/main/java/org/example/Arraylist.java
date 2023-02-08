package org.example;

import java.util.Scanner;
import java.util.*;
import java.util.logging.Logger;

public class Arraylist {
    private static final Logger logger = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        Scanner sc= new Scanner(System.in);
        int o=1;
        while(o==1) {
            logger.info("1.add 2.remove 3.print");
            int c = sc.nextInt();
            if(c==1)
            {
                logger.info("Enter the element:");
                int el= sc.nextInt();
                num.add(el);
            }
            else if(c==2)
            {
                logger.info("Enter the element to be removed");
                int ex=sc.nextInt();
                for(int i=0;i<num.size();i+=1)
                {
                    if(num.get(i)==ex)
                    {
                        num.remove(i);
                    }
                }
            }
            else if(c==3)
            {
                String z=" "+num;
                logger.info(z);
            }
        }
    }

}
