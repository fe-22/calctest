package calctest;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tipo de juros (s/c): ");
		String tipoJuros = sc.nextLine();
		
		System.out.println("Digite a taxa de juros (em decimal):  ");
		double taxaJuros = sc.nextDouble();
		
		System.out.println("Digite o periodo de tempo (em anos):  ");
		int tempo = sc.nextInt();
		
		System.out.println("Digite o valor inicial:  ");
		double valorInicial = sc.nextDouble();
		
		double montante, juros;
		
		
		if (tipoJuros.equals("s")) {
			montante = JurosSimples.calcularMontanteJurosSimples(valorInicial, taxaJuros, tempo);
			juros = JurosSimples.calcularJurosSimples(valorInicial, taxaJuros, tempo);
		}else if (tipoJuros.equals("c")) {
			montante = JurosComposto.calcularMontanteJurosComposto(valorInicial, taxaJuros, tempo);
			juros = JurosComposto.calcularJurosComposto(valorInicial, taxaJuros, tempo);
			
		}else {
			System.out.println("Tipo de juros inválido: " + taxaJuros);
			return;
		}
		
		System.out.println("***Juros  " + tipoJuros + "****");
		System.out.printf("Montante: R$%.2f", juros);
		System.out.printf("juros:   R$%.2f", juros);
		
		

	}

}
