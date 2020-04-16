package ejecutable;

import java.util.Scanner;

	public class activ_1 {
		
		public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in)	;
		
		System.out.println("Introduzca un numero: ");
		
		Double num = sc.nextDouble();
		
		Double num2 = Double.valueOf(num);
		
		System.out.println(num2);
		}
	}
