package comunicacion;

public class Alfabeto extends Pictograma {
	private String[] letras;
	private String interpretacion;
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	//Get y Set
	public String[] getLetras() {
		return letras;
	}
	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	//Fin get y set
	public String interpretacion() {
		return interpretacion;
	}
	public String toString() {
		String total = letras[0];
		if(letras.length > 1) {
			for(int i = 1; i< letras.length;i++) {
				total = total + ", " + letras[i];
			}
		}
		return total;
	}
	public int cantidadLetras() {
		return letras.length;
	}
}
