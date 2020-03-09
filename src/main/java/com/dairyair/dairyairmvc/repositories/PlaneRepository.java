package com.dairyair.dairyairmvc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dairyair.dairyairmvc.entities.Plane;

@Repository
public interface PlaneRepository extends CrudRepository<Plane, Long>  {
}