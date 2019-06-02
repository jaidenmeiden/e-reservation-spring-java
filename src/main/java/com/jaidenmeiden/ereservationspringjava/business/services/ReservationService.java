/**
 * 
 */
package com.jaidenmeiden.ereservationspringjava.business.services;


import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jaidenmeiden.ereservationspringjava.business.repository.ReservationRepository;
import com.jaidenmeiden.ereservationspringjava.model.Client;
import com.jaidenmeiden.ereservationspringjava.model.Reservation;

/**
 * Clase para definir los servicios de reserva
 * 
 * @author HighlanderSword
 *
 */
@Service
@Transactional(readOnly = true)
public class ReservationService {

	private final ReservationRepository reservationRepository;
	
	public ReservationService(ReservationRepository reservationRepository) {
		this.reservationRepository = reservationRepository;
	}
	
	/**
	 * Método para realizar la operación de guardar una reserva
	 * 
	 * @param reserva
	 * @return
	 */
	@Transactional
	public Reservation create(Reservation reserva) {
		return this.reservationRepository.save(reserva);
	}

	/**
	 * Método para realizar la operación de actualizar una reserva
	 * 
	 * @param reserva
	 * @return
	 */
	@Transactional
	public Reservation update(Reservation reserva) {
		return this.reservationRepository.save(reserva);
	}

	/**
	 * Método para realizar la operación de eliminar una reserva
	 * 
	 * @param reserva
	 */
	@Transactional
	public void delete(Reservation reserva) {
		this.reservationRepository.delete(reserva);
	}

	
	/**
	 * Método para consultar todos las reservas
	 * @return
	 */
	public List<Reservation> findAll(){
		return this.reservationRepository.findAll();
	}
	
	/**
	 * Método para consultar las reservas por un cliente en específico
	 * 
	 * @param cliente
	 * @return
	 */
	public List<Reservation> findByCliente(Client cliente){
		return this.reservationRepository.findByCliente(cliente);
	}
	
	/**
	 * Método para consultar las reservas por la fecha de ingreso en
	 * base a un rango de fechas
	 * 
	 * @param fechaInicio
	 * @param fechaSalida
	 * @return
	 */
	public List<Reservation> find(Date fechaInicio, Date fechaSalida){
		return this.reservationRepository.find(fechaInicio, fechaSalida);
	}	
}
