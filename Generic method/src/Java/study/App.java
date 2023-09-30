package Java.study;

import java.util.ArrayList;
import java.util.List;

class Data {
    public <E> void printListData(List<E> list){
          for(E element: list){
              System.out.println(element);
          }
    }
    public <E> void printArrayData(E[] arrayData){
        for(E element: arrayData) {
            System.out.println(element);
        }
    }
}

public class App {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Data data = new Data();
        System.out.println("Printing integer list");
        data.printListData(list);

        List<String> list2 = new ArrayList<>();
        list2.add("One");
        list2.add("Two");
        list2.add("Three");
        list2.add("Four");
        list2.add("Five");
        System.out.println("Printing String list");
        data.printListData(list2);




        String[] stringArray = {"One", "Two", "Three"};
        Integer[] integerArray = {1,2,3};
        System.out.println("Printing String list");
        data.printArrayData(stringArray);
        System.out.println("Printing integer list");
        data.printArrayData(integerArray);
    }
}