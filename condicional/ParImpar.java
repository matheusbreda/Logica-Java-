package condicional;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		String resultado;
		
		System.out.println("Informe um numero: ");
		num = sc.nextInt();
		
		if(num % 2 ==0) {
			resultado = "par";		
		}else {
			resultado = "impar";
		}
		System.out.printf("\nO numero %d � %s", num, resultado);
		System.out.printf("\nEncerrando a execu��o.");
		
		sc.close();
	}

}
