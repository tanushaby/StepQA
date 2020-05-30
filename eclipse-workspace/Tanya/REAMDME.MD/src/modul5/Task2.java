package modul5;

import java.util.Random;

public class Task2 {
	public static void main(String[] args) {
		int []a = new int [30];
		int n1 = -70;
		int n2 = 50;
		int min; 
		Random rand = new Random(); 
			for(int i=0; i< a.length; i++)
		a[i]= n1 + rand.nextInt(n2 - n1 + 1);
			for(int i=0; i<a.length; i++)
		System.out.print(a[i]+"  ");
		System.out.println();
		min=a[0];
			for(int i=1; i<a.length; i++)
		{ 
				if(a[i] < min){
		min=a[i];
		}
		
		}
		
		System.out.println("Наименьший элемент массива : "+min );
		
	}  	
		
}


