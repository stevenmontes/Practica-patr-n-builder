package calculadoraComidaBuilder;

import calculadoracomida.Medida;

public class InformacionComida {
    private String nombre; 
    private int cantidadPorcion;
    private Medida unidadDeMedida;
    private int porciones;
    private int calorias;
    private int grasa;
    private int sodio;
    private int carbohidratos;
    
	public InformacionComida(String nombre, int cantidadPorcion, Medida unidadDeMedida, int porciones, int calorias,
			int grasa, int sodio, int carbohidratos) {
		this.nombre = nombre;
		this.cantidadPorcion = cantidadPorcion;
		this.unidadDeMedida = unidadDeMedida;
		this.porciones = porciones;
		this.calorias = calorias;
		this.grasa = grasa;
		this.sodio = sodio;
		this.carbohidratos = carbohidratos;
	}

	@Override
	public String toString() {
		return "InformacionComida [nombre=" + nombre + ", cantidadPorcion=" + cantidadPorcion + ", unidadDeMedida="
				+ unidadDeMedida + ", porciones=" + porciones + ", calorias=" + calorias + ", grasa=" + grasa
				+ ", sodio=" + sodio + ", carbohidratos=" + carbohidratos + "]";
	}
    
    public static class InformacionComidaBuilder {
        private String bNombre; 
        private int bCantidadPorcion;
        private Medida bUnidadDeMedida;
        private int bPorciones;
        private int bCalorias;
        private int bGrasa;
        private int bSodio;
        private int bCarbohidratos;
        
        public InformacionComidaBuilder() {
        	
        }
        
		public InformacionComidaBuilder nombre(String bNombre) {
			this.bNombre = bNombre;
			return this;
		}
		
		public InformacionComidaBuilder cantidadPorcion(int bCantidadPorcion) {
			this.bCantidadPorcion = bCantidadPorcion;
			return this;
		}
		
		public InformacionComidaBuilder unidadDeMedida(Medida bUnidadDeMedida) {
			this.bUnidadDeMedida = bUnidadDeMedida;
			return this;
		}
		
		public InformacionComidaBuilder porciones(int bPorciones) {
			this.bPorciones = bPorciones;
			return this;
		}
		
		public InformacionComidaBuilder calorias(int bCalorias) {
			this.bCalorias = bCalorias;
			return this;
		}
		
		public InformacionComidaBuilder grasa(int bGrasa) {
			this.bGrasa = bGrasa;
			return this;
		}
		
		public InformacionComidaBuilder sodio(int bSodio) {
			this.bSodio = bSodio;
			return this;
		}
		
		public InformacionComidaBuilder carbohidratos(int bCarbohidratos) {
			this.bCarbohidratos = bCarbohidratos;
			return this;
		}
		
		public InformacionComida build() {
			return new InformacionComida(bNombre, bCantidadPorcion, bUnidadDeMedida, bPorciones, bCalorias, bGrasa, bSodio, bCarbohidratos);
		}
        
        
    }
    
}
