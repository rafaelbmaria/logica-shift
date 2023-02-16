import java.util.Scanner;

public class Elogio {

	public static void main(String[] args) {

		byte opcao;
		String nome;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual o seu nome?");
		nome = leitor.next();
		
		System.out.println("Selecione a opção desejada: 1- Elogio profissional");
		System.out.println("                            2- Elogio físico");
		System.out.println("                            3- Elogio pessoal");
		
		opcao = leitor.nextByte();
		
		switch (opcao){
		case 1:
			System.out.println(nome + " seu texto está perfeito");
			break;
		case 2:
			System.out.println(nome + " você está em boa forma");
			break;
		case 3:
			System.out.println(nome + " você é uma pessoa bacana");
			break;
		default:
			System.out.println(nome + " opção inválida");
	}
		leitor.close();
	}
}
