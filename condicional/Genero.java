package condicional;

import java.util.Scanner;

public class Genero {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			char genero;
			
			System.out.println("Informe o genero (F ou M): ");
			genero = sc.next().charAt(0);
			genero= Character.toUpperCase(genero);
			
			System.out.println((genero=='F')? "Feminino" : (genero =='M')? "Masculino" : "Valor invalido");
			
			sc.close();
	}

}
