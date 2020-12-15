package com.SpringBoot.project.springHibernateAndJpa.Service;

import com.SpringBoot.project.springHibernateAndJpa.DataAccess.ICityDataAccess;
import com.SpringBoot.project.springHibernateAndJpa.Entities.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service

public class CityService  implements ICityService{
    private ICityDataAccess cityDataAccess;

   @Autowired
    public CityService(ICityDataAccess cityDataAccess) {
        this.cityDataAccess = cityDataAccess;
    }
    @Transactional
    @Override
    public List<City> getAll() {
        return cityDataAccess.getAll();
    }
    @Transactional
    @Override
    public void add(City city) {

    }
    @Transactional
    @Override
    public void update(City city) {

    }
    @Transactional
    @Override
    public void delete(City city) {

    }
}
