package sequencial;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		double n1, n2, n3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informar valor de N1: ");
		n1 = sc.nextDouble();
		System.out.println("Informar valor de N2: ");
		n2 = sc.nextDouble();
		System.out.println("Informar valor de N3: ");
		n3 = sc.nextDouble();
		
		double media = (n1+n2+n3)/3;
		
		System.out.printf("A m�dia de %f, %f e %f � %f",n1,n2,n3,media);
		
		
		sc.close();
		
		
	}

}
