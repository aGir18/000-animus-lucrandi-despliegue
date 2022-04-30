package libreria.animus;

import java.util.List;

public class Asociacion {

  private long id;
	private String nombre;
	private List<Negocio> negociosAsociacion;
	
  public String getNombre() {
    return nombre;
  }
	
	public List<Negocio> getNegociosAsociacion() {
		return negociosAsociacion;
	}
	
	public long getId() {
    return id;
  }
	
	public void setNombre(String nombre) {
    this.nombre = nombre;
  }
	
	public void setNegociosAsociacion(List<Negocio> negociosAsociacion) {
    this.negociosAsociacion = negociosAsociacion;
  }
	
	public void setId(long id) {
    this.id = id;
  }

	public Asociacion(String nombre, List<Negocio> negocios) {
		this.nombre = nombre;
		this.negociosAsociacion = negocios;
	}
	
	@Override
	public String toString() {
		return "La asociacion se llama asociacion " + getNombre() + " y tiene " + 
		    getNegociosAsociacion().size() + " negocios.";
	}

}
