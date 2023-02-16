
import java.util.Scanner;

public class Bissexto {

	public static void main(String[] args) {
		
		// "&&" (E)
		// "||" (OU)
		// NEGAÇÃO	 "!"(NÃO)
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Programa para verificar se ano é bissexto");
		System.out.println("Informe o ano");
		var ano = leitor.nextInt();

		boolean  bissexto = (ano % 400 ==0) || (ano % 4 == 0 && ano %100 !=0);

		// if ternario
		String msg = bissexto ? "é" : "não é";
		
		System.out.println(ano + msg + "bissexto");
		
		leitor.close();
		
	}

}
