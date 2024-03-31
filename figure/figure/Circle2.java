package figure;

import java.util.Scanner;

public class Circle2 {

	public static void main(String[] args) {
		
		char wc = '○'; 
		char bc = '●';
		
		
		Scanner scan = new Scanner(System.in);
		int size = 2*scan.nextInt();
		
		
		for(int i =size/2+1; i<=size; i++) {
				
			
			for (int j=size-i; j>=0; j--) {
		
				for(int k=size-i; k>=0; k--) {
				System.out.print(1);
				
				}
				System.out.print(2);
			}
			System.out.println();
			
			for (int j=size-i; j>=0; j--) {
				
				for(int k=size-i; k>=0; k--) {
					System.out.print(3);
					
				}
			
			}
			
			System.out.println();
			}
		System.out.println();
			
		for(int i=1; i<=size/2; i++) {
			
		for( int j=1; j<=i; j++) {
			
			for(int k=1; k<=i; k++) {
				
				System.out.print(3);
				
			}
		
			
		}
		
		System.out.println();
		for( int j=1; j<=i; j++) {
			
			for(int k=1; k<=i; k++) {
				
				System.out.print(1);
				
			}
			System.out.print(2);
		
			
		}
		System.out.println();
		}
			
	
			
		}
		
	}


