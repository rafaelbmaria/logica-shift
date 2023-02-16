import java.util.Scanner;

public class votacao {

	public static void main(String[] args) {
		
		short idade;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe sua idade");
		
		idade = leitor.nextShort();
		
		if (idade >= 16) {
			if (idade >= 18 && idade < 65) {
				System.out.println("Você deve votar");
			}
			else {
				System.out.println("Você pode votar, se desejar");				
			}
		}else {
			System.out.println("Você não pode votar");
		}
		
		leitor.close();
		
	}
}

