package com.ricardeck.springboot.dao;

import java.util.List;

import com.ricardeck.springboot.domain.Cargo;

public interface CargoDao {

    void save(Cargo cargo );

    void update(Cargo cargo);

    void delete(Long id);

    Cargo findById(Long id);

    List<Cargo> findAll();
}
