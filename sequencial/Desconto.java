package sequencial;

import java.util.Scanner;

public class Desconto {

	public static void main(String[] args) {
		
		double salarioBruto, desconto;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o salario bruto: ");
		salarioBruto = sc.nextDouble();
		
		desconto = salarioBruto * (1-0.11);
		
		System.out.printf("O salário bruto é de R$%.2f e com o desconto foi para R$%.2f", salarioBruto, desconto);
		
		sc.close();
	}

}
