package com.sinfloo.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sinfloo.demo.modelo.subdito;

@Repository
public interface ISubdito extends CrudRepository<subdito, Integer>{

}
