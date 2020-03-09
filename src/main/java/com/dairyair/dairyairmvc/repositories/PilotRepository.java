package com.dairyair.dairyairmvc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dairyair.dairyairmvc.entities.Pilot;

@Repository
public interface PilotRepository extends CrudRepository<Pilot, Long>  {
}