package libreria.animus;

public class Farmacia extends Negocio {

	private int numeroPuntosSigre;
	
	public int getNumeroPuntosSigre() {
		return numeroPuntosSigre;
	}
	
	public void setNumeroPuntosSigre(int numeroPuntosSigre) {
    this.numeroPuntosSigre = numeroPuntosSigre;
	}

	public Farmacia(long id, String nombre, String nif, Asociacion asociacion, int numeroPuntosSigre) {
    super(id, nombre, nif, asociacion);
    this.numeroPuntosSigre = numeroPuntosSigre;
  }

  @Override
	public String toString() {
		return "Soy la farmacia con NIF " + getNif() + ", me llamo " + getNombre();
	}

}
