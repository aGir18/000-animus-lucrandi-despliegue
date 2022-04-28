package libreria.animus;

import java.util.List;

public class Asociacion {

	private String nombre;
	private List<Negocio> negociosAsociacion;
	
	public String getNombre() {
		return nombre;
	}
	
	public List<Negocio> getNegociosAsociacion() {
		return negociosAsociacion;
	}
	
	public void setNombre(String nombre) {
    this.nombre = nombre;
  }
	
	public void setNegociosAsociacion(List<Negocio> negociosAsociacion) {
    this.negociosAsociacion = negociosAsociacion;
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
