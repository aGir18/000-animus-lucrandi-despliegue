package libreria.animus;

import org.hibernate.mapping.Collection;

import java.util.List;
import java.util.Collection;

public class Asociacion {

  private long id;
	private String nombre;
	private Collection<Negocio> negociosAsociacion;
	
  public String getNombre() {
    return nombre;
  }
	
	public Collection<Negocio> getNegociosAsociacion() {
		return negociosAsociacion;
	}
	
	public long getId() {
    return id;
  }
	
	public void setNombre(String nombre) {
    this.nombre = nombre;
  }
	
	public void setNegociosAsociacion(Collection<Negocio> negociosAsociacion) {
    this.negociosAsociacion = negociosAsociacion;
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
