package com.dairyair.dairyairmvc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dairyair.dairyairmvc.entities.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long>  {
	@Query("SELECT c FROM Client c WHERE c.outstandingBalance > 0.0")
	List<Client> findByOustandingBalanceGreaterThan(double value);
}
