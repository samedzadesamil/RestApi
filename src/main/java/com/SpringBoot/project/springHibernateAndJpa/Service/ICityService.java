package com.SpringBoot.project.springHibernateAndJpa.Service;

import com.SpringBoot.project.springHibernateAndJpa.Entities.City;

import java.util.List;

public interface ICityService {
    List<City> getAll();
    void add(City city);
    void update(City city);
    void delete(City city);
}
