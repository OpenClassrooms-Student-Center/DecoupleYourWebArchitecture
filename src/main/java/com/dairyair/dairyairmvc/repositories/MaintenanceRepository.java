package com.dairyair.dairyairmvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dairyair.dairyairmvc.entities.MaintenanceIssue;

@Repository
public interface MaintenanceRepository extends CrudRepository<MaintenanceIssue, Long>   {
	List<MaintenanceIssue> findByFixed(String fixed);
}
