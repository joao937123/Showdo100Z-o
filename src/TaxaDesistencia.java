
import java.util.Random;

public class TaxaDesistencia {

	public static double calcularPremioFinal(double premioAcumulado) {

		double taxa = new Random().nextDouble(10, 35);
		double valorDesconto = premioAcumulado * taxa/100;
		premioAcumulado = premioAcumulado - valorDesconto;
		return premioAcumulado;
	}
}
