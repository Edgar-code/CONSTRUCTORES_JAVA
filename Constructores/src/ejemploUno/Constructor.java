package ejemploUno;

public class Constructor {
	//atributos de la clase
	private int codigo;
	private int tamaño;
	private String texto;
	private String color;
	
	//constructores
	public Constructor() {
		this.codigo = 4;
		this.tamaño = 8;
		this.texto = "Abogado";
		this.color = "Rojo";
	}
	
	public Constructor(int codigo, int tamaño, String texto, String color) {
		this.codigo = codigo;
		this.tamaño = tamaño;
		this.texto = texto;
		this.color = color;
	}

	public Constructor(int codigo, String color) {
		this.codigo = codigo;
		this.color = color;
	}

	//metodos getter y setters
	public Constructor(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//metodo comparar
	public String Comparar(Constructor C) {
		String mensaje;
		if(codigo == C.getCodigo()) {
			mensaje = "Son iguales...";
		}else {
			mensaje = "No son iguales...";
		}
		return mensaje;
	}
	
}
