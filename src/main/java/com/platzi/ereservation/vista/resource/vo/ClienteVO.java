/**
 * 
 */
package com.platzi.ereservation.vista.resource.vo;

import java.util.Set;

import javax.persistence.OneToMany;

import com.platzi.ereservation.modelo.Reserva;

import lombok.Data;

/**
 * Clase que representa la tabla CLiente
 * @author fdhior
 *
 */

@Data
public class ClienteVO {

	private String idCli;
	private String nombreCli;
	private String apellidoCli;
	private String identificacionCli;
	private String direccionCli;
	private String telefonoCli;
	private String emailCLi;
	
	
}
