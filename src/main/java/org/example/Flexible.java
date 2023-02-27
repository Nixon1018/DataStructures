package org.example;


import java.util.logging.Logger;

 public class Flexible {
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
