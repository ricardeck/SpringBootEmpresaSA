package com.ricardeck.springboot.dao;

import org.springframework.stereotype.Repository;

import com.ricardeck.springboot.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

}
