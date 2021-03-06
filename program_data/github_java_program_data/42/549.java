/*********************************************************************

 Description : perform Selection sort in an array			   
 Author		 : Amandeep Singh
 Website	 : http://kodevelop.com/
 Email		 : aman.adsm@gmail.com
 github		 : https://github.com/aman-devy

 **********************************************************************/

package DataStructures_Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array_sort_SelectionSort {
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		int array[]=new int[size];
		for(int i=0;i<size;i++) 	array[i]=Integer.parseInt(br.readLine());
		for(int i=0;i<size;i++)		System.out.print(array[i]+" ");
		
	// logic for selection sort	
		int temp=0,i=0,j=0;
		for(i=size-1;i>0;i--){
			int loc=0;
			for(j=0;j<=i;j++){   //locate smallest element between positions 1 and i.
				if(array[j]<array[loc])         
					loc=j;
				temp=array[loc];   //swap smallest found with element in position i.
				array[loc]=array[i];
				array[i] = temp; 
			}           
		}

		for(i=0;i<size;i++)		System.out.print("\n"+array[i]+" ");
	}
}