package libreria.animus;

public class Optica extends Negocio implements OpticaIntLib {
  
  private int numeroAutorefractometros;
  
  @Override
  public int getNumeroAutorefractometros() {
  	return numeroAutorefractometros;
  }
  
  @Override
  public void setNumeroAutorefractometros(int numeroAutorefractometros) {
  	this.numeroAutorefractometros = numeroAutorefractometros;
  	
  }

  public Optica(String nombre, String nif, int numeroAutorefractometros) {
    super(nombre, nif);
    this.numeroAutorefractometros = numeroAutorefractometros;
  }

  @Override
  public String toString() {
    return "Soy la Optica con nombre " + getNombre() + " y NIF " + getNif();
  }
  
}
