package org.example;
import java.util.logging.Logger;


public class List {
    Node head = null;
    Node current = null;
    Node prev = null;
    int size=0;
    int count=0;
    private static final Logger logger = Logger.getLogger("InfoLogging");

    void insert(int data) {
        Node newnode = new Node(data);
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
        Node newnode = new Node(data);
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
            logger.info("The list  empty");
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
            logger.info("The list  empty");
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
