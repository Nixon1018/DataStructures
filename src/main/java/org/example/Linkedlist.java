package org.example;
import java.util.*;
import java.util.logging.Logger;

public class Linkedlist {
    private static final Logger logger = Logger.getLogger("InfoLogging");

    public  void linkedlist() {
        List l = new List();
        Scanner sc= new Scanner(System.in);
        int check = 1;

        while (check == 1) {
            logger.info("1.add 2.remove 3.print 4.exit");
            int enter=sc.nextInt();
            if(enter==1) {
                logger.info("1.insert at end 2.insert at middle");
                int in = sc.nextInt();
                logger.info("Enter the data");
                int dat= sc.nextInt();
                if(in==1) {
                    l.insert(dat);
                }
                else if(in==2)
                {
                    logger.info("Enter the index");
                    sc.nextLine();
                    int index=sc.nextInt();
                    sc.nextLine();
                    l.insertat(dat,index);

                }
            }
            else if(enter==2) {
                logger.info("1.remove the element at end 2. remove the element at index ");
                int out = sc.nextInt();
                if(out==1) {
                    l.remove();
                }
                else if(out==2)
                {
                    logger.info("Enter the index");
                    int indexx=sc.nextInt();
                    l.removeat(indexx);
                }
            }
            else if(enter==3)
            {
                l.print();
            }
            else if(enter==4)
            {
                check=0;
            }

        }
    }
}
