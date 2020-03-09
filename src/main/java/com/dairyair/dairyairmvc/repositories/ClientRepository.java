package com.dairyair.dairyairmvc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dairyair.dairyairmvc.entities.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long>  {
}
