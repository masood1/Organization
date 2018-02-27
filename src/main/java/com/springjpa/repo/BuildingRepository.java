package com.springjpa.repo;

import org.springframework.data.repository.CrudRepository;
import com.springjpa.model.Building;

public interface BuildingRepository extends CrudRepository<Building, Long>{
}

