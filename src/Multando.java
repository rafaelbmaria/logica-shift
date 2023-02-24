//Crie um programa Java que; após receber a velocidade máxima da via, ele 
//comece a coletar a velocidade dos carros que passam.
//
//Para cada carro que passar o programa deverá ser capaz de:
//
//Multar caso desrespeitem a velocidade máxima conforme os parâmetros abaixo:
//
//  1. Informe 50 reais se estiver até 10km/h acima; 
//  2. Informe 100 reais se estiver entre 11km/h e 30km/h acima; 
//  3. Informe 300 reais se estiver acima de 31km/h acima.
//
//Gerar relatório ao final do processamento com:
//
//A)	Velocidade média dos veículos;
//B)	Total de multas em R$
//C)	Total de multas aplicadas
//D)	Percentual de carros multados

import java.util.Scanner;

public class Multando {

	public static void main(String[] args) {

		float via, veiculo, multa, velocidade_total, vlr_total_multas, tot_multa_aplic;
		float perc_multado;
		int c;
		int qtd;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informa a velocidade maxima permitida para a via ");
		via = leitor.nextFloat();
		
		qtd = 4; 
		velocidade_total = 0;
		multa = 0;
		vlr_total_multas = 0;
		tot_multa_aplic = 0;
		perc_multado = 0;
				
		for (c = 1 ; c <= qtd ; c++) {
			System.out.println("Informa a velocidade do veiculo ");
			veiculo = leitor.nextFloat();
			if (veiculo > via) {
				if (veiculo - via <=10){
					multa = 50;
				} else if ((veiculo - via > 10) && (veiculo - via <= 30)) {
					multa = 100;
				} else {
					multa = 300;
				}
				vlr_total_multas += multa;
				tot_multa_aplic ++;

			}
			velocidade_total = velocidade_total + veiculo;
		}
		perc_multado = (tot_multa_aplic / qtd) * 100;
		
		System.out.println("Velocidade Média	   : " + (velocidade_total/qtd));
		System.out.printf( "Valor Total Multas	   : R$ %,.2f%n", vlr_total_multas);
		System.out.println("Total Multas Aplicadas     : " + tot_multa_aplic);	
		System.out.printf( "Percentual Carros Multados : %,.2f%%\n", perc_multado);
		
		leitor.close();

	}

}
