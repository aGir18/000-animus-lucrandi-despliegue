package libreria.animus;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;


public class Asociacion {

  private long id;
	private String nombre;
	private List<Negocio> negociosAsociacion;
	
  public String getNombre() {
    return nombre;
  }
	
	public long getId() {
    return id;
  }
	
	public List<Negocio> getNegociosAsociacion() {
    return negociosAsociacion;
  }
	
	public void setNombre(String nombre) {
    this.nombre = nombre;
  }
		
	public void setId(long id) {
    this.id = id;
  }
	
	public void setNegociosAsociacion(List<Negocio> negociosAsociacion) {
    this.negociosAsociacion = negociosAsociacion;
  }
	
	public void addNegocio(Negocio negocio) {
	  getNegociosAsociacion().add(negocio);
	  negocio.setAsociacion(this);
	}
	
	public Asociacion(long id, String nombre, List<Negocio> negociosAsociacion) {
    super();
    this.id = id;
    this.nombre = nombre;
    this.negociosAsociacion = negociosAsociacion;
  }

  @Override
	public String toString() {
		return "La asociacion se llama asociacion " + getNombre() + " y tiene " + 
	getNegociosAsociacion().size() + " negocios.";
	}

}
