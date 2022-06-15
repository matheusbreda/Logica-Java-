package desafio;

import java.util.Scanner;

public class DesafioDeLogica {

	public static void main(String[] args) {
		
		double totalC = 0, totalCImp = 0, totalCLucro = 0, totalE = 0, totalEImp = 0, totalELucro = 0, totalV = 0, totalVImp = 0, totalVLucro = 0;
		int contador;
		
		Scanner sc = new Scanner(System.in);
		
		for (contador = 0; contador <= 14; contador++) {
			
			char categoria;
			
			System.out.printf("\nDigte uma das opções abaixo de acordo com a categoria que deseja (%d tipos de produtos catalogados): \n(C) cama, mesa e banho. \n(E) eletrodomésticos. \n(V) vestuário. ", contador);
			categoria = sc.next().charAt(0);
			categoria = Character.toUpperCase(categoria);
		
			System.out.println((categoria == 'C') ? "\nCama, mesa e banho" : (categoria == 'E') ? "\nEletrodomésticos" : (categoria == 'V') ? "\nVestuário" : "\nEssa categoria não existe :(  ");
		
			switch (categoria) {
				case 'C':
					double precoUniC, valorC;
					int quantidadeC;
									
					System.out.println("Digite o preço unitario: ");
					precoUniC = sc.nextDouble();
					System.out.println("Digite a quantidade: ");
					quantidadeC = sc.nextInt();
					valorC = precoUniC * quantidadeC;
					
					double valorCImp, valorProdCImp;					
					valorCImp = valorC * 0.3741;
					valorProdCImp = valorC + valorCImp;
					totalCImp += valorCImp;
					
					double valorCLucro, valorProdCLucro;
					valorCLucro = valorProdCImp * 0.30; 
					valorProdCLucro = valorProdCImp + valorCLucro;
					totalCLucro += valorCLucro;
					
					totalC += valorProdCLucro;
					
					double valorCUni;
					valorCUni = valorProdCLucro / quantidadeC;
					
					System.out.printf("\nValor total: R$%.2f\nValor de impostos: R$%.2f\nValor de lucro: R$%.2f\nO valor final do produto é de: R$%.2f (por unidade: R$%.2f)\n", valorC, valorCImp, valorCLucro, valorProdCLucro, valorCUni);													
					break;
					
				case 'E':
					double precoUniE, valorE;
					int quantidadeE;
									
					System.out.println("Digite o preço unitario: ");
					precoUniE = sc.nextDouble();
					System.out.println("Digite a quantidade: ");
					quantidadeE = sc.nextInt();
					valorE = precoUniE * quantidadeE;
					
					double valorEImp, valorProdEImp;					
					valorEImp = valorE * 0.4314;
					valorProdEImp = valorE + valorEImp;
					totalEImp += valorEImp;
					
					double valorELucro, valorProdELucro;
					valorELucro = valorProdEImp * 0.35; 
					valorProdELucro = valorProdEImp + valorELucro;
					totalELucro += valorELucro;
					
					totalE += valorProdELucro;
					
					double valorEUni;
					valorEUni = valorProdELucro / quantidadeE;
										
					System.out.printf("\nValor total: R$%.2f\nValor de impostos: R$%.2f\nValor de lucro: R$%.2f\nO valor final do produto é de: R$%.2f (por unidade: R$%.2f)\n", valorE, valorEImp, valorELucro, valorProdELucro, valorEUni);					
					break;
					
				case 'V':
					double precoUniV, valorV;
					int quantidadeV;
									
					System.out.println("Digite o preço unitario: ");
					precoUniV = sc.nextDouble();
					System.out.println("Digite a quantidade: ");
					quantidadeV = sc.nextInt();
					valorV = precoUniV * quantidadeV;
					
					double valorVImp, valorProdVImp;					
					valorVImp = valorV * 0.3842;
					valorProdVImp = valorV + valorVImp;
					totalVImp += valorVImp;
					
					double valorVLucro, valorProdVLucro;
					valorVLucro = valorProdVImp * 0.50; 
					valorProdVLucro = valorProdVImp + valorVLucro;
					totalVLucro += valorVLucro;
					
					totalV += valorProdVLucro;
					
					double valorVUni;
					valorVUni = valorProdVLucro / quantidadeV;
										
					System.out.printf("\nValor total: R$%.2f\nValor de impostos: R$%.2f\nValor de lucro: R$%.2f\nO valor final do produto é de: R$%.2f (por unidade: R$%.2f)\n", valorV, valorVImp, valorVLucro, valorProdVLucro, valorVUni);	
					break;
			}						
		}
		
		System.out.printf("\nCama, mesa e banho\nTotal de impostos: R$%.2f\nTotal de lucro: R$%.2f\nValor final: R$%.2f\n", totalCImp, totalCLucro, totalC);
		System.out.printf("\nEletrodomésticos\nTotal de impostos: R$%.2f\nTotal de lucro: R$%.2f\nValor final: R$%.2f\n", totalEImp, totalELucro, totalE);
		System.out.printf("\nVestuario\nTotal de impostos: R$%.2f\nTotal de lucro: R$%.2f\nValor final: R$%.2f\n", totalVImp, totalVLucro, totalV);
		
		sc.close();
	}

}
