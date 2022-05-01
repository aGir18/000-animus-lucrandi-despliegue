package libreria.animus;

public class Optica extends Negocio {
  
  private int numeroAutorefractometros;
  
  public int getNumeroAutorefractometros() {
  	return numeroAutorefractometros;
  }
  
  public void setNumeroAutorefractometros(int numeroAutorefractometros) {
  	this.numeroAutorefractometros = numeroAutorefractometros;
  }
  
  public Optica(long id, String nombre, String nif, Asociacion asociacion, int numeroAutorefractometros) {
    super(id, nombre, nif, asociacion);
    this.numeroAutorefractometros = numeroAutorefractometros;
  }

  @Override
  public String toString() {
    return "Soy la Optica con nombre " + getNombre() + " y NIF " + getNif();
  }
  
}
