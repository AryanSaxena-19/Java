
public class Nestedloop {

	public static void main(String[] args) {
		
	/*for(int i=1; i<=10;i++) {
		for(int j=1; j<=10; j++) {
			System.out.println("Value of i:"+i+"and value of j:"+j);
		}
		System.out.println("************************");
	}*/
		/*
		int rows = 6, i = 1, j= 1;
		
		while(i<= rows)
		{
			while(j <= i)
			{
				System.out.print("@");
				j++;
			}
			System.out.print("\n");
			i++;
			j=1;
	  	}
		*/
		

		for(int i=1; i<=5; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print('@');
			}
			System.out.println();
		}
	}

}
