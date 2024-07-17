package frgp.utn.edu.ar.dao;

import java.util.List;

import frgp.utn.edu.ar.entidad.Persona;

@Deprecated
public interface IdaoPersona {

	public List<Persona> listarPersonas();
	public boolean agregarPersona(Persona p);
}
