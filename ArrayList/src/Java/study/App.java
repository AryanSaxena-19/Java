package Java.study;

import java.util.ArrayList;

public class App {

	static ArrayList<String> ListNames = new ArrayList<>();
	
	public static void main(String[] args) {
		ListNames.add("Aryan");
		ListNames.add("Uchiha");
		ListNames.add("Sasuke");
		ListNames.add("Minato");
		ListNames.add("Hashirama");
		ListNames.add("Itachi");
		ListNames.add("Madara");
		App app =new App();
		app.displayList(ListNames);
		/* app.removeNameByPosition(0);
		System.out.println("*****************");
		app.displayList(ListNames);
		
		System.out.println("***********");
		System.out.println(ListNames.get(0));
         System.out.println("****************");
		 app.removeNameByString("Uchiha");
		 app.displayList(ListNames);*/




		System.out.println("******************");
		/*app.modifyName(3,"Tobirama");
		app.displayList(ListNames);*/
		int position = app.search("Hashirama");
		if(position != -1 ){
			app.modifyName(position, "Minato");
			app.displayList(ListNames);
		}else{
			System.out.println("Invalid Entry");
		}
	}
	void displayList(ArrayList<String> names) {
		for(String name: names) {
			System.out.println(name);
		}
		
	}
	void removeNameByPosition(int position) {
		ListNames.remove(position);
	}
	void removeNameByString(String name) {
		ListNames.remove(name);
	}

	 void modifyName(int position, String newNames){
		ListNames.set(position, newNames);
	 }
	 int search(String name ){
		return ListNames.indexOf(name);
	 }
}
