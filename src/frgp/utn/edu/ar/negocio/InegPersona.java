package frgp.utn.edu.ar.negocio;

import java.util.List;

import frgp.utn.edu.ar.entidad.Persona;

@Deprecated
public interface InegPersona {

	public List<Persona> listarPersonas();
	public boolean agregarPersona(Persona p);
}
