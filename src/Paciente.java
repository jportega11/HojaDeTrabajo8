//Universidad del Valle de Guatemala
//Algoritmos y Estructuras de Datos
//Guillermo Javier de Leon Archila, 14022
//Jose pablo Ortega Grajeda, 14565
//Paciente: clase donde se guarda la información de cada paciente

public class Paciente implements Comparable<Paciente>{
	
	//atributos
	private String nombre = "";
	private String descripcion = "";
	private String codigo = "";
		
	//constructor con parámetros
	public Paciente (String nombre, String descripcion, String codigo){
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.codigo = codigo;
	}
	
	//setters y getters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	
	//toString
	public String toString() {
		return nombre + ", " + descripcion + ", " + codigo;
	}

	//método comparteTo, donde se compara el código de emergencia
	public int compareTo(Paciente o) {
		return -o.getCodigo().compareTo(this.codigo);
	}

}
