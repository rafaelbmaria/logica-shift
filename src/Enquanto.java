import java.util.Scanner;

public class Enquanto {

	public static void main(String[] args) {

//      USING WHILE		
		int a = 0;
		while (a <=100) {
			System.out.println(a);
			a++;
		}

//		USING DO WHILE 		
		int b = 0;
		do {
			System.out.println(b);
			b++;
		} while(b <= 100) ;

//		USING DO WHILE
		Scanner leitor = new Scanner(System.in);
		int op = 0;
		do {
			System.out.println("Cadastrei");
			System.out.println("Deseja continuar? 1 - Sim, 2 - Não");
			op = leitor.nextInt();
		} while(op == 1);
		leitor.close();

//		USING FOR		
		int c;
		for (c = 0 ; c <= 100 ; c++) {
			System.out.println(c);
		}
		leitor.close();
	}

}
