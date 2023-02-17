
import java.util.Scanner;

public class NotaAlunos {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
						
		int c;
		float notaaluno = 0;
		float total = 0;
		int qtd = 0;
		
		System.out.println("Quantidade de alunos? ");
		qtd = leitor.nextInt();
		
		for (c = 1 ; c <= qtd ; c++) {
			System.out.println("Digite a nota do aluno " + c);
			notaaluno = leitor.nextFloat();
			total = total + notaaluno;
		}
		System.out.println("Média: " + (total/qtd));

	}

}
