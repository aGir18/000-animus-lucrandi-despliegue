package libreria.animus;

public class Asociacion {

  private long id;
	private String nombre;
	
  public String getNombre() {
    return nombre;
  }
	
	public long getId() {
    return id;
  }
	
	public void setNombre(String nombre) {
    this.nombre = nombre;
  }
	
	public void setId(long id) {
    this.id = id;
  }

	public Asociacion() {};
	
	public Asociacion(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "La asociacion se llama asociacion " + getNombre() + " y tiene " + " negocios.";
	}

}
