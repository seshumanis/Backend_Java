package com.seshumani.flightservices.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seshumani.flightservices.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}
