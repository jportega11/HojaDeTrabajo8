
public class Paciente implements Comparable<Paciente>{

	public Paciente (String nombre, String descripcion, String codigo){
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.codigo = codigo;
	}
	
	private String nombre = "";
	private String descripcion = "";
	private String codigo = "";
	
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

	
	@Override
	public int compareTo(Paciente o) {
		// TODO Auto-generated method stub
		return o.getCodigo().compareTo(this.codigo);
	}
	

}
