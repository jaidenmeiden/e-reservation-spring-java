package com.jaidenmeiden.ereservationspringjava.business.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jaidenmeiden.ereservationspringjava.model.Client;
import com.jaidenmeiden.ereservationspringjava.model.Reservation;

/**
 * Interface para definir la operaciones de la base de datos
 * relacionadas con la reserva
 * 
 * @author HighlanderSword
 * 
 */
public interface ReservationRepository extends JpaRepository<Reservation, String> {

	/**
	 * Método para consultar las reservas por cliente
	 * 
	 * @param cliente
	 * @return
	 */
	@Query("Select r from Reservation r where r.cliente =:cliente")
	public List<Reservation> findByCliente(Client cliente);
	
	/**
	 * Definición de método para consultar las reservas por la fecha de ingreso en
	 * base a un rango de fechas
	 * 
	 * @param fechaInicio
	 * @param fechaSalida
	 * @return
	 */
	@Query("Select r from Reservation r where r.fechaIngresoRes =:fechaInicio  and r.fechaSalidaRes =:fechaSalida")
	public List<Reservation> find(@Param("fechaInicio") Date fechaInicio, @Param("fechaSalida") Date fechaSalida);
}
