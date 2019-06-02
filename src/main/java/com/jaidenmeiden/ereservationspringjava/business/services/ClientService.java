/**
 * 
 */
package com.jaidenmeiden.ereservationspringjava.business.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jaidenmeiden.ereservationspringjava.business.repository.ClientRepository;
import com.jaidenmeiden.ereservationspringjava.model.Client;

/**
 * Clase para definir los servicios de cliente
 * 
 * @author HighlanderSword
 *
 */
@Service
@Transactional(readOnly = true)
public class ClientService {
	
	private final ClientRepository clientRepository;

	public ClientService(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}

	/**
	 * Método para realizar la operación de guardar un cliente
	 * 
	 * @param Client
	 * @return
	 */
	@Transactional
	public Client create(Client Client) {
		return this.clientRepository.save(Client);
	}

	/**
	 * Método para realizar la operación de actualizar un cliente
	 * 
	 * @param Client
	 * @return
	 */
	@Transactional
	public Client update(Client Client) {
		return this.clientRepository.save(Client);
	}

	/**
	 * Método para realizar la operación de eliminar un cliente
	 * 
	 * @param Client
	 */
	@Transactional
	public void delete(Client Client) {
		this.clientRepository.delete(Client);
	}

	/**
	 * Método para consultar un cliente por su identificación
	 * 
	 * @param identificacionCli
	 * @return
	 */
	public Client findByIdentificacion(String identificacionCli) {
		return this.clientRepository.findByIdentificacion(identificacionCli);
	}
	
	/**
	 * Método para consultar todos los clientes
	 * @return
	 */
	public List<Client> findAll(){
		return this.clientRepository.findAll();
	}
	
	/**
	 * Método para buscar los clientes por su apellido
	 * @param apellidoCli
	 * @return
	 */
	public List<Client> findByApellidoCli(String apellidoCli){
		return this.clientRepository.findByLastnameCli(apellidoCli);
	}
	
	
	/**
	 * Método para buscar un cliente por su cuenta de email
	 * @param email
	 * @return
	 */
	public Client findByEmailAccount(String email) {
		return this.findByEmailAccount(email);
	}
}
