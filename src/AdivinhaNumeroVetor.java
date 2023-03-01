import java.util.Scanner;
import java.util.Random;

public class AdivinhaNumeroVetor {

	public static void main(String[] args) {
		int numeroTentativas = 5;
		int[] tentativas = new int[numeroTentativas];
		Random rnd = new Random(); //Inicia Aleatório 
		int oculto = rnd.nextInt(100); //Gera um número aleatório (0 – 99)
		int numeroUsuario, contador = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Número de tentativas para adivinhar o número oculto: " + numeroTentativas);

		do {
			System.out.println("\nInforme um número de 0 a 99:");
			numeroUsuario = sc.nextInt();
			if (numeroUsuario < oculto) {
			System.out.println("Maior!");
			} else if (numeroUsuario > oculto) {
			System.out.println("Menor!");
			} else {
			System.out.println("Acertou!");
			}
			// Informa o numero de tentativas efetuadas, guarda a tentativa no vetor e contabiliza o contador
			System.out.println("Tentativa " + (contador + 1) + "/" + numeroTentativas);
			tentativas[contador] = numeroUsuario;
			contador++;
		} while (numeroUsuario != oculto && contador <= (numeroTentativas-1));
		sc.close();
	}
}
