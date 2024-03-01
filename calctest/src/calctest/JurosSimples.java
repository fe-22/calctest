package calctest;

public class JurosSimples {
	
	public static double calcularMontanteJurosSimples(double valorInicial, double taxaJuros, int tempo) {
		return valorInicial *(1 + taxaJuros * tempo);
	}
	
	public static double calcularJurosSimples(double valorInicial, double taxaJuros, int tempo) {
		return calcularMontanteJurosSimples(valorInicial, taxaJuros, tempo) - valorInicial;
	}

}
