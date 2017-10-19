package beans;

public class Ciudad {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}
	public Ciudad() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ciudad(int id, String nombre, int poblacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.poblacion = poblacion;
	}
	private int id;
	private String nombre;
	private int poblacion;

}
