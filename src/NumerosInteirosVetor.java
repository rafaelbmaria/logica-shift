import java.util.*;

public class NumerosInteirosVetor {

	// leia um vetor de 5 numeros inteiros e mostra
	
	public static void main(String[] args) {

//EX 1    		
//		int i = 0;
//		int[] numeros;
//		numeros = new int[5];
//		numeros[0] = 100;
//		numeros[1] = 1;
//		numeros[2] = 5;
//		numeros[3] = 8;
//		numeros[4] = 0;
//		
//		System.out.println("O primeiro numero é:" + numeros[0]);
//		System.out.println("O segundo numero é:" + numeros[1]);
//		System.out.println("O terceiro numero é:" + numeros[2]);
//		System.out.println("O quarto numero é:" + numeros[3]);
//		System.out.println("O quinto numero é:" + numeros[4]);
//		
//		for(i = 0; i < numeros.length ; i++) {
//			System.out.println("Os numeros são :" + numeros[i]);
//		}
			
//EX2 	ARMAZENA DADOS NO VETOR E IMPRIME	
//		Scanner leitor = new Scanner(System.in);
//		System.out.println("Quantos números deseja informar?");
//		int quantidade = leitor.nextInt();
//		int[] numeros;
//		
//		numeros = new int[quantidade];
//		
//		if (quantidade <=0) {
//			System.out.println("Programa Encerrado");
//			System.exit(0);
//		}
//
//		for(int p = 0; p < numeros.length; p++) {
//			System.out.println("Qual é o " + (p+1) + "º numero?");
//			numeros[p]=leitor.nextInt();
//		}
//		
//		int p;
//		for(p = 0; p < numeros.length ; p++) {
//		System.out.println("Os numeros são :" + numeros[p]);
//		}
//		leitor.close();
		
//EX3   Faça   um   Programa   que   leia   um   vetor   de   10 números 
//		reais   e   mostre-os   na   ordem inversa. 
//
//		Scanner leitor = new Scanner(System.in);
//
//		float[] numeros;
//		
//		numeros = new float[10];
//		
//		for(int p = 0; p < numeros.length; p++) {
//			System.out.println("Digite o " + (p+1) + "º numero?");
//			numeros[p] = leitor.nextFloat();
//		}
//		
//        System.out.println("Lista sem ordenacao");
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.print(numeros[i] + "; ");
//        }
//		
//        System.out.println("\nLista na ordem inversa:");
//        for (int i = numeros.length -1; i >= 0 ; i--) {
//            System.out.print(numeros[i] + "; ");
//        }
//        leitor.close();
        
//EX4	Faça um Programa que leia 4 notas, mostre as notas e a média na tela. 
		
        Scanner leitor = new Scanner(System.in);

		float[] notas;
		float soma = 0;
		
		notas = new float[4];
		
		for(int p = 0; p < notas.length; p++) {
			System.out.println("Digite o " + (p+1) + "º nota?");
			notas[p] = leitor.nextFloat();
		}
        
		for(int p = 0; p < notas.length; p++) {
			soma += notas[p]; 
		}
		
      System.out.println("Notas");
      for (int i = 0; i < notas.length; i++) {
          System.out.print(notas[i] + "; ");
      }
		
		System.out.println("Média = " + soma / notas.length);
        
		leitor.close();
	}

}
