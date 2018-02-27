package com.springjpa.repo;

import org.springframework.data.repository.CrudRepository;
import com.springjpa.model.Floor;

public interface FloorRepository extends CrudRepository<Floor, Long> {

}
