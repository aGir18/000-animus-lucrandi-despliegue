package libreria.animus;

import java.util.List;
import java.util.Collection;

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

	public Asociacion(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "La asociacion se llama asociacion " + getNombre() + " y tiene " + " negocios.";
	}

}
