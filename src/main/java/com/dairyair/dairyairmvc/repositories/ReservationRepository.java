package com.dairyair.dairyairmvc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dairyair.dairyairmvc.entities.Reservation;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long>  {
}