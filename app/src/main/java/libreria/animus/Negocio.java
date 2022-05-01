package libreria.animus;

public abstract class Negocio {

  private long id;
	private String nombre;
	private String nif;
	private Asociacion asociacion;
		
	public long getId() {
    return id;
  }
	
  public String getNif() {
    return nif;
  }
  
  public String getNombre() {
    return nombre;
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
  
  public Negocio(String nombre, String nif){
		this.nombre = nombre;
		this.nif = nif;
	}
	
}
