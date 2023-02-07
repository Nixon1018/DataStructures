package org.example;
import java.util.*;
import java.util.logging.Logger;

class node
{
    int data;
    node nextnode;
    node(int data)
    {
        this.data=data;
    }

}
class list {
    node head = null;
    node current = null;
    node prev = null;
    int size=0;
    int count=0;
    private static final Logger logger = Logger.getLogger("InfoLogging");

    void insert(int data) {
        node newnode = new node(data);
        if (this.head == null) {
            this.head = newnode;
        } else {
            this.current = head;
            while (this.current.nextnode != null) {
                this.current = current.nextnode;
            }
            this.current.nextnode = newnode;
        }
        this.size++;
    }
    void insertat(int data,int index)
    {
        node newnode = new node(data);
        if(index==0) {
            if (this.head == null) {
                this.head = newnode;
            }
            else{
                newnode.nextnode = this.head;
                this.head = newnode;
            }
        }
        else{
            this.current=head;
            while(this.count!=index)
            {
                if(current.nextnode!=null) {
                    this.prev=current;
                    this.current = current.nextnode;
                    count+=1;
                }
            }
            prev.nextnode=newnode;
            newnode.nextnode=current;

        }
    }

    void remove() {
        if (this.head == null) {
            logger.info("The list is empty");
        } else {
            this.current = head;
            while (this.current.nextnode != null) {
                this.prev = current;
                this.current = current.nextnode;
            }
            this.prev.nextnode = null;
        }
       this.size--;
    }
    void removeat(int index)
    {

        if (this.head == null) {
            logger.info("The list is empty");
        }else{
            this.current=head;
            while(this.count!=index)
            {
                if(current.nextnode!=null) {
                    prev=current;
                    this.current = current.nextnode;
                    count+=1;
                }

            }
            prev.nextnode=current.nextnode;

        }
    }
    void removedata(int data)
    {

        if (this.head == null) {
            logger.info("The list is empty");
        }else{
            this.current=head;
            while(this.current.data!=data)
            {
                if(current.nextnode!=null) {
                    prev=current;
                    this.current = current.nextnode;
                }
            }
            prev.nextnode=current.nextnode;

        }
    }
    void print()
    {
        this.current=head;
        while(this.current!=null)
        {
            String z=" "+current.data;
            logger.info(z);
            this.current=current.nextnode;
        }
    }
}
public class Main {
    private static final Logger logger = Logger.getLogger("InfoLogging");

    public static void main(String[] args) {
        list l = new list();
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
            if(enter==2) {
                logger.info("1.remove the element at end 2. remove the element at index 3.remove the same  element");
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
                else if(out==3)
                {
                    logger.info("Enter the data");
                    int dataa=sc.nextInt();
                    l.removedata(dataa);
                }
            }
            if(enter==3)
            {
                l.print();
            }
            if(enter==4)
            {
                check=0;
            }

        }
    }
}