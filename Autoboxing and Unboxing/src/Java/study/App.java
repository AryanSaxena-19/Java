package Java.study;

import java.util.ArrayList;

class intWrapper{
    public int intValue;

    public intWrapper(int intValue) {
        this.intValue = intValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }
}

public class App {
    public static void main(String[]args){
        /*ArrayList<Integer> studentNames = new ArrayList<>();
        studentNames.add(25);
        System.out.println(studentNames.get(0));//unboxing


        ArrayList<intWrapper> studentNumbers = new ArrayList<>();
        studentNumbers.add(new intWrapper(33)); //boxing
        System.out.println(studentNumbers.get(0).getIntValue()); //unboxing
        */


        ArrayList<Double> demoList = new ArrayList<>();
        //demolist.add(25.5);
        demoList.add(new Double(25.2));
        demoList.add(Double.valueOf(10.0));//This is done while Autoboxing
        System.out.println(demoList.get(0));


    }
}
