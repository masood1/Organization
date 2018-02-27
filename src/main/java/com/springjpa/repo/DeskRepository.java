package com.springjpa.repo;

import org.springframework.data.repository.CrudRepository;
import com.springjpa.model.Desk;

public interface DeskRepository extends CrudRepository<Desk, Long>{

}
