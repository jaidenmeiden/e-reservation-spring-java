package com.jaidenmeiden.ereservationspringjava.business.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jaidenmeiden.ereservationspringjava.model.Reservation;

/**
 * Interface para definir la operaciones de la base de datos
 * relacionadas con la reserva
 * 
 * @author HighlanderSword
 * 
 */
public interface ReservationRepository extends JpaRepository<Reservation, String> {

}
