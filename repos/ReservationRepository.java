package com.seshumani.flightservices.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seshumani.flightservices.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

}
