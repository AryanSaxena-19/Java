package Java.study;

import java.util.Stack;

public class App1 {
    public static void main(String[]args){
        Stack<Integer> demo = new Stack<>();
        demo.push(0);
        demo.push(1);
        demo.push(2);
        demo.push(3);
        demo.push(4);
        demo.push(5);
        demo.pop();

        System.out.println(demo.peek());

        for(Integer temp: demo){
            System.out.println(temp);
        }
    }
}
