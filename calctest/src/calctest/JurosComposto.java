package calctest;

public class JurosComposto {
	
	public static double calcularMontanteJurosComposto (double valorInicial, double taxaJuros, int tempo) {
		return valorInicial * Math.pow((1 + taxaJuros), tempo);
	}
	
	public static double calcularJurosComposto (double valorIncial, double taxaJuros, int tempo) {
		return calcularMontanteJurosComposto(valorIncial, taxaJuros, tempo) - valorIncial;
	}

}
