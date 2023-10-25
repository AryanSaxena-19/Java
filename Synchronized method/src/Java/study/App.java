package Java.study;
    class Brakets{
        public void generate(){
            for(int i=1; i<=10;i++){
                if(i<=5){
                    System.out.print("[");
                }else{
                    System.out.print("]");
                }
            }
            System.out.println();
        }
    }
    public class App{
    public static void main(String[] args) {
Brakets braket = new Brakets();
        braket.generate();
    }
}