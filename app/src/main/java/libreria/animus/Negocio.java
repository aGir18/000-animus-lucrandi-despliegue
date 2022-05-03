package libreria.animus;

public abstract class Negocio {

  private long id;
	private String nombre;
	private String nif;
		
	public long getId() {
    return id;
  }
	
  public String getNif() {
    return nif;
  }
  
  public String getNombre() {
    return nombre;
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
  
  public Negocio() {};
  
  public Negocio(String nombre, String nif){
		this.nombre = nombre;
		this.nif = nif;
	}
	
}
