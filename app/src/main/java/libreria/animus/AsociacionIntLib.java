package libreria.animus;

import java.util.List;

public interface AsociacionIntLib {

	public String getNombre();
	
	public List<Negocio> getNegociosAsociacion();
	
	public void setNombre(String nombre);
	
	public void setNegociosAsociacion(List<Negocio> negociosAsociacion);
	
	public String toString();

}
