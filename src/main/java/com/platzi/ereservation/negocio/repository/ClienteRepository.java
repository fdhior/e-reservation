package com.platzi.ereservation.negocio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.platzi.ereservation.modelo.Cliente;

/**
 * Interface para definir las operaciones de bbd relacionadas con cliente
 * @author fdhior
 *
 */
public interface ClienteRepository extends JpaRepository<Cliente, String> {

	/**
	 * Definción de método para buscar los clientes por su apellido
	 * @param apellidoCli
	 * @return
	 */
	public List<Cliente> findByApellidoCli(String apellidoCli);

	public Cliente findByIdentificacion(String identificacionCli); 
	
}
