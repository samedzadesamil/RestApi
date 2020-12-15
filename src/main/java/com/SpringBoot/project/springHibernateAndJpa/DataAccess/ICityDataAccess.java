package com.SpringBoot.project.springHibernateAndJpa.DataAccess;

import com.SpringBoot.project.springHibernateAndJpa.Entities.City;

import java.util.List;

public interface ICityDataAccess {
    List<City> getAll();
    void add(City city);
    void update(City city);
    void delete(City city);


}
