package figure;
import java.util.Scanner;

public class Circle3 {

	public static void main(String[] args) {

		char wc = '○'; 
		char bc = '●';
		
		Scanner scan = new Scanner(System.in);
		int radius = scan.nextInt();
		
		for(int x=-radius; x<=radius; x++) {
			
			for (int y=-radius; y<=radius; y++) {
				
				if(x*x+y*y<=radius*radius) {
					System.out.print(bc+" ");
				}else {
					System.out.print(wc+" ");
				}
			}
			System.out.println();
		}
		
		
		
	}

}
