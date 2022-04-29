package libreria.animus;

public abstract class Negocio implements NegocioIntLib {

	private String nombre;
	private String nif;
		
  @Override
  public String getNif() {
    return nif;
  }
  
  @Override
  public String getNombre() {
    return nombre;
  }
  
  @Override
  public void setNombre(String nombre) {
    this.nombre = nombre;    
  }
  
  @Override
  public void setNif(String nif) {
    this.nif = nif;
  }
	
	public Negocio(String nombre, String nif){
		this.nombre = nombre;
		this.nif = nif;
	}
	
}
