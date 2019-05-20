package com.jaidenmeiden.ereservationspringjava.business.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jaidenmeiden.ereservationspringjava.model.Client;

/**
 * Interface para definir la operaciones de la base de datos
 * relacionadas con el cliente
 * 
 * @author HighlanderSword
 * 
 */
public interface ClientRepository extends JpaRepository<Client, String> {

}
