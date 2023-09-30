package Java.study;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Aoo {

    public static void main(String[]args) {
        Queue<Integer> queue = new ArrayBlockingQueue<>(6);
        try {
            queue.remove();
        }catch(NoSuchElementException e1){
            System.out.println("Queue is empty");
        }
       try{
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
    }catch(IllegalStateException e) {
           System.out.println("Queue is full");
       }
        for(Integer element:queue){
            System.out.println(element);
        }

    }
}
