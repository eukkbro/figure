package figure;
import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {

		//사이즈 입력을 받는 부분
		System.out.println("사이즈를 입력하시오.");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
				
		char wr = '◇';  //white rhombus 하얀 마름모
		char br = '◆';  //black rhombus 검정 마름모
		
for(int i=1; i<=size; i++) {
			

			for(int j=1; j<=size; j++) {
				System.out.print(1);
				System.out.print(wr);
				System.out.print(wr);
				System.out.print(wr);
				System.out.print(wr);
				System.out.print(wr);
				System.out.print(wr);
				System.out.print(wr);
			}
	
			for(int j=size-i; j>0; j--) {
				System.out.print(2);
				System.out.print(wr);
				System.out.print(wr);
				System.out.print(wr);
			}
			
			for(int j=1; j<=i; j++) {
				System.out.print(br);
				System.out.print(br);
				System.out.print(br);
				System.out.print(br);
			}
			
			for(int j=1; j<=2*size; j++) {
				System.out.print(br);
			}
			for(int j=1; j<=i; j++) {
				System.out.print(br);
				System.out.print(br);
				System.out.print(br);
				System.out.print(br);
			}
			for(int j=size-i; j>0; j--) {
				System.out.print(wr);
				System.out.print(wr);
				System.out.print(wr);
				System.out.print(wr);
			}
			
			for (int j =1; j<=size; j++) {
				System.out.print(wr);
				System.out.print(wr);
				System.out.print(wr);
				System.out.print(wr);
				System.out.print(wr);
				System.out.print(wr);
				System.out.print(wr);
				System.out.print(wr);
			}
			
			System.out.println("");
		}
	
		
	for(int i=1; i<=size; i++) {
			
			for(int j=1; j<=size; j++) {
			System.out.print(wr);
			System.out.print(wr);
			System.out.print(wr);
			System.out.print(wr);
			System.out.print(wr);
			}	
		
			for(int j=size-i; j>0; j--) {
				System.out.print(wr);
				System.out.print(wr);
				System.out.print(wr);
			}
			
			for(int j=1; j<=i; j++) {
				System.out.print(br);
				System.out.print(br);
				System.out.print(br);
			}
			
			for(int j=1; j<=10*size; j++) {
				System.out.print(br);
			}
			for(int j=1; j<=i; j++) {
				System.out.print(br);
				System.out.print(br);
				System.out.print(br);
			}
			for(int j=size-i; j>0; j--) {
				System.out.print(wr);
				System.out.print(wr);
				System.out.print(wr);
			}
			for(int j=1; j<=size; j++) {
				System.out.print(wr);
				System.out.print(wr);
				System.out.print(wr);
				System.out.print(wr);
				System.out.print(wr);
				}	
			System.out.println("");
		}
		
	for(int i=1; i<=size; i++) {
		
			for(int j=1; j<=size; j++) {
			System.out.print(wr);
			System.out.print(wr);
			System.out.print(wr);
			}	
			for(int j=size-i; j>0; j--) {
				System.out.print(wr);
			
			}
			for(int j=size-i; j>=0; j--) {
				System.out.print(wr);
			
			}
			for(int j=1; j<=i; j++) {
				System.out.print(br);
				System.out.print(br);
			}
			for(int j=1; j<=16*size; j++) {
				System.out.print(br);
			}
			for(int j=1; j<=i; j++) {
				System.out.print(br);
				System.out.print(br);
			}
			for(int j=size-i; j>0; j--) {
				System.out.print(wr);
				System.out.print(wr);
			}
			for(int j=1; j<=size; j++) {
				System.out.print(wr);
				System.out.print(wr);
				System.out.print(wr);
				}	
			
			
			System.out.println("");
		}
	
		
		
		
		for(int i=1; i<=2*size; i++) {
			
			
			for(int j=1; j<=size; j++) {
				System.out.print(wr);
			}
			
			for(int j=2*size-i; j>=0; j--) {
				System.out.print(wr);
			}
			for(int j=1; j<=i; j++) {
				System.out.print(br);
			}
			for(int j=1; j<=20*size; j++) {
				System.out.print(br);
			}
			for(int j=1; j<=i; j++) {
				System.out.print(br);
			}
			for(int j=2*size-i; j>=0; j--) {
				System.out.print(wr);
			}
			for(int j=1; j<=size; j++) {
				System.out.print(wr);
			}
			
			System.out.println();
		}
		
		for(int i=1; i<=2*size; i++) {
			
			for(int j=1; j<=size; j++) {
				System.out.print(wr);
			}
	
			for (int j =0; j<=24*size; j++) {
				
				System.out.print(br);
			}
			for(int j=1; j<=size; j++) {
				System.out.print(wr);
			}
			
			System.out.println("");
		}
		
		
		for(int i=1; i<=2*size; i++) {
			
			for(int j=1; j<=size; j++) {
				System.out.print(wr);
			}
			for(int j=1; j<=i; j++) {
				System.out.print(wr);
			}
			for(int j=2*size-i; j>=0; j--) {
				System.out.print(br);
			}
			for(int j=1; j<=20*size; j++) {
				System.out.print(br);
			}
			for(int j=2*size-i; j>=0; j--) {
				System.out.print(br);
			}
			for(int j=1; j<=i; j++) {
				System.out.print(wr);
			}
			for(int j=1; j<=size; j++) {
				System.out.print(wr);
			}
			
			System.out.println();
		}

	
		
		for(int i=1; i<=size; i++) {
			
			for(int j=1; j<=size; j++) {
				System.out.print(wr);
				System.out.print(wr);
				System.out.print(wr);
			}	
				for(int j=1; j<=i; j++) {
					System.out.print(wr);
				}
				for(int j=1; j<i; j++) {
					System.out.print(wr);
				}
				for(int j=size-i; j>0; j--) {
					System.out.print(br);
					System.out.print(br);
				}
				for(int j=1; j<=17*size; j++) {
					System.out.print(br);
				}
				for(int j=size-i; j>0; j--) {
					System.out.print(br);
					System.out.print(br);
				}
				for(int j=1; j<=i; j++) {
					System.out.print(wr);
				}
				for(int j=1; j<i; j++) {
					System.out.print(wr);
				}
				for(int j=1; j<=size; j++) {
					System.out.print(wr);
					System.out.print(wr);
					System.out.print(wr);
				}	
				
				
				System.out.println("");
			}
		
			
			for(int i=1; i<=size; i++) {
				
				
				for (int j =1; j<=size; j++) {
						System.out.print(wr);
						System.out.print(wr);
						System.out.print(wr);
						System.out.print(wr);
						System.out.print(wr);
						
					}
				
					for(int j=1; j<i; j++) {
						System.out.print(wr);
						System.out.print(wr);
						System.out.print(wr);
					}
					
					for(int j=size-i; j>0; j--) {
						System.out.print(br);
						System.out.print(br);
						System.out.print(br);
					}
					
					for(int j=1; j<=12*size; j++) {
						System.out.print(br);
					}
					for(int j=size-i; j>0; j--) {
						System.out.print(br);
						System.out.print(br);
						System.out.print(br);
					}
					for(int j=1; j<=i; j++) {
						System.out.print(wr);
						System.out.print(wr);
						System.out.print(wr);
					}
					for (int j =1; j<=size; j++) {
						System.out.print(wr);
						System.out.print(wr);
						System.out.print(wr);
						System.out.print(wr);
						System.out.print(wr);
					}
					System.out.println("");
				}
				
		
			for(int i=1; i<=size; i++) {
				
				
				for (int j =1; j<=size; j++) {
					System.out.print(wr);
					System.out.print(wr);
					System.out.print(wr);
					System.out.print(wr);
					System.out.print(wr);
					System.out.print(wr);
					System.out.print(wr);
				}
				
				for(int j=1; j<=i; j++) {
					System.out.print(wr);
					System.out.print(wr);
					System.out.print(wr);
				}
				for(int j=1; j<i; j++) {
					System.out.print(wr);
				}
				for(int j=size-i; j>0; j--) {
					System.out.print(br);
					System.out.print(br);
					System.out.print(br);
					System.out.print(br);
				}
				for(int j=1; j<=5*size; j++) {
					System.out.print(br);
				}
				for(int j=size-i; j>0; j--) {
					System.out.print(br);
					System.out.print(br);
					System.out.print(br);
					System.out.print(br);
				}
				for(int j=1; j<=i; j++) {
					System.out.print(wr);
					System.out.print(wr);
					System.out.print(wr);
				}
				for(int j=1; j<i; j++) {
					System.out.print(wr);
				}
				for (int j =1; j<=size; j++) {
					System.out.print(wr);
					System.out.print(wr);
					System.out.print(wr);
					System.out.print(wr);
					System.out.print(wr);
					System.out.print(wr);
					System.out.print(wr);
				}
				
				
				
				System.out.println("");
			}
			
		
			}
}
