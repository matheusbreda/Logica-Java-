package sequencial;

public class Variaveis {

	public static void main(String[] args) {
		
		int quantidade = 1500;
		float valorMercadoria = 750.28f;
		double peso = 78.3;
		char genero = 'F';
		
		System.out.printf("A quantidade de produtos em estoque � %d\n", quantidade);
		System.out.printf("O valor da parcela � R$%.1f\n", valorMercadoria);
		System.out.printf("O Erinaldo pesa %f quilos\n", peso);
		System.out.printf("Do genero %c tem matriculado %d alunas\n", genero, quantidade);
	}
}
