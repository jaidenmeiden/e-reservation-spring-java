package com.jaidenmeiden.ereservationspringjava.business.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jaidenmeiden.ereservationspringjava.model.Client;

/**
 * Interface para definir la operaciones de la base de datos
 * relacionadas con el cliente
 * 
 * @author HighlanderSword
 * 
 */
public interface ClientRepository extends JpaRepository<Client, String> {

	/**
	 * Definición de método para buscar los clientes por su apellido
	 * @param lastnameCli
	 * @return
	 */
	public List<Client> findByLastnameCli(String lastnameCli);
	
	/**
	 * Definición de método para buscar un cliente por su identificación
	 * @param identificacionCli
	 * @return
	 */
	public Client findByIdentificacion(String indentificationCli);
	
	/**
	 * Definición de método para buscar un cliente por su cuenta de email
	 * @param email
	 * @return
	 */
	@Query("Select c from Client c where c.emailCli like %:email")
	public Client findByEmailAccount(@Param("email") String email);
}
