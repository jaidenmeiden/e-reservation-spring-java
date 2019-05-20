/**
 * 
 */
package com.jaidenmeiden.ereservationspringjava.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * Clase que representa la tabla cliente
 * 
 * @author HighlanderSword
 *
 * Data: Es la que determina que esta clase es un POJO
 * Entity: Es la que permite que esta clases represente una tabla de la base de datos
 * Table: A que tabla se va a mapear en la base de datos
 * 
 * La clave privada de una base de datos puede generarse de diferentes formas
 * Id: Inicio de secuencia que crea la llave primaria
 * GeneratedValue: Generador de la llava privada tipo
 * GenericGenerator: Notación propia de Hibernate para configurar la llave privada
 * 
 * Codificación de relaciones con otras tablas
 * OneToMany: Crea relación de uno a varios
 * 
 */
@Data
@Entity
@Table(name = "client")
public class Client {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid2")
	private String idCli;
	private String nameCli;
	private String lastnameCli;
	private String indentificationCli;
	private String addressCli;
	private String phoneCli;
	private String emailCli;
	
	@OneToMany(mappedBy = "cliente")
	private Set<Reservation> reservas;
	
	public Client() {
		
	}	
		
}
