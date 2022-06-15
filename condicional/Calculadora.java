package condicional;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int opcao;
		double num1,num2;
		
		System.out.println("Informe o 1º valor: ");
		num1 = sc.nextDouble();
		System.out.println("Informe o 2º valor: ");
		num2 = sc.nextDouble();
		
		System.out.println("\n\nCalculadora\n");
		System.out.println("\n1. Soma \n2. Subtração \n3. Multiplicação \n4. Divisão");
		System.out.println("Escolha uma opção: ");
		opcao=sc.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.printf("%f+%f=%f", num1,num2,num1+num2);
			break;
		case 2:
			System.out.printf("%f-%f=%f", num1,num2,num1-num2);
			break;
		case 3:
			System.out.printf("%f*%f=%f", num1,num2,num1*num2);
			break;
		case 4:
			System.out.printf("%f/%f=%f", num1,num2,num1/num2);
			break;
		default :
			System.out.println("Opção invalida :(");		
		}
		
		sc.close();
	}

}
