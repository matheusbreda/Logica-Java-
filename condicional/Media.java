package condicional;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, media;
		String resultado;
		
		System.out.println("Digite as notas 1, 2 e 3: ");
		n1=sc.nextDouble();
		n2=sc.nextDouble();
		n3=sc.nextDouble();
		
		media=(n1+n2+n3)/3;
		
		if(media >= 6) {
			resultado = "Aprovado";
		}else {
			resultado = "Reprovado";
		}
		System.out.printf("O aluno foi %s com media de %.1f",resultado,media);
		sc.close();
	}

}
