package com.srs.demo.dao;

import org.springframework.data.jpa.repository.support.CrudMethodMetadata;
import org.springframework.data.repository.CrudRepository;

import com.srs.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer> {
@Override
default Iterable<Alien> findAll() {
	// TODO Auto-generated method stub
	return null;
}
}
