package libreria.animus;

public abstract class Negocio {

  private long id;
	private String nombre;
	private String nif;
	private Asociacion asociacion;
		
	public String getNombre() {
	  return nombre;
	}
	
  public String getNif() {
    return nif;
  }  

  public long getId() {
    return id;
  }
  
  public Asociacion getAsociacion() {
    return asociacion;
  }
  
  public void setNombre(String nombre) {
    this.nombre = nombre;    
  }
  
  public void setNif(String nif) {
    this.nif = nif;
  }
	
  public void setId(long id) {
    this.id = id;
  }
  
  public void setAsociacion(Asociacion asociacion) {
    this.asociacion = asociacion;
  }

  public Negocio(long id, String nombre, String nif, Asociacion asociacion) {
    this.id = id;
    this.nombre = nombre;
    this.nif = nif;
    this.asociacion = asociacion;
  }
}
