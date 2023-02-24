import java.util.Random;
import java.util.Scanner;

public class AdivinhaNumero {

	public static void main(String[] args) {
		
//		 Utilize a classe Random para gerar um número que ficará oculto 
//		 para o usuário. Este número está entre 0 e 99.
		
//		1. Faça um laço de repetição que solicite ao usuário digitar um número; 
//		2. O laço encerra quando o usuário acertar o número; 
//		3. Se o número do usuário for menor que o oculto, escrever: “MAIOR”, se o número do usuário for maior que o oculto, escrever: “MENOR”.
		
		// Captura digitado
		Scanner leitor = new Scanner(System.in);
		
		//Inicia Aleatório
		Random rnd = new Random();
		//Gera um número aleatório (0 – 99)
		int x = rnd.nextInt(100);  

		var numero = 0;
		
		while (numero != x) {
			System.out.println("Digite um número inteiro entre 0 e 99" );
			numero = leitor.nextInt();
			if (numero < x) System.out.println("MENOR");
			if (numero > x) System.out.println("MAIOR");
		}
		System.out.println("ACERTOU. O número é " + numero);
		leitor.close();
		
	}

}
