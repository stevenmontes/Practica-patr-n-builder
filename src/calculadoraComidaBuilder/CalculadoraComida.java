package calculadoraComidaBuilder;

import calculadoraComidaBuilder.InformacionComida.InformacionComidaBuilder;
import calculadoracomida.Medida;

public class CalculadoraComida {
	public static void main(String args[]) {
		InformacionComida ollaDeCarne;
		InformacionComidaBuilder builder = new InformacionComida.InformacionComidaBuilder();
		builder = builder.nombre("Olla de carne").cantidadPorcion(240).unidadDeMedida(Medida.ML).porciones(2).calorias(350).grasa(40).sodio(50).carbohidratos(10);
		ollaDeCarne = builder.build();
		System.out.println(ollaDeCarne.toString());
	}
}
