package modul5;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
	public static void main(String[] args) {
	int i;
    int j;
    int numb = 0; 
    int count_repeat = 0; 
    int max_repeat = 0; 
    
     Random rnd = new Random();
     	int arr[] = new int[25];
     	for (i = 0; i < arr.length; i++) {
        arr[i] = (rnd.nextInt(20) - 9);
    }
    System.out.println(Arrays.toString(arr));
    
    for (i = 0; i < arr.length; i++) { 
        count_repeat = 1;       
        
        for (j = i+1; j < arr.length; j++) { 
            numb = arr[i]; 

            if (arr[i] == arr[j] && (j != i)) { 
                count_repeat++; 
            }           
        }                       
        if((max_repeat <= count_repeat) && (count_repeat != 1)){
            max_repeat = count_repeat; 
            System.out.println( numb + " - "  + max_repeat + " раз"); 
            }
      
    }
    if(max_repeat == 0){ 
        System.out.println("Числа в массиве НЕ повторяются "); 
    }
}
}


// подсмотрела в интернете


