package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		final int ajuste = 32;
		final double fator = 5.0 / 9.0;
		double grauFahrenheit = 124;
		
		double temperatura = (grauFahrenheit - ajuste) * fator;
		
		System.out.println(" A temperatura " + grauFahrenheit + "°F é igual a " + temperatura + "°C");
	}
}
