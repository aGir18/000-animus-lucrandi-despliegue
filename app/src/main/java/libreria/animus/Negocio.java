package libreria.animus;

public abstract class Negocio {

	private String nombre;
	private String nif;
	
	public String getNif() {
		return nif;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNif(String nif) {
    this.nif = nif;
  }
	
	public void setNombre(String nombre) {
    this.nombre = nombre;
  }
	
	public Negocio(String nombre, String nif){
		this.nombre = nombre;
		this.nif = nif;
	}
	
}
