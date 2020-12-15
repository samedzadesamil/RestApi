package com.SpringBoot.project.springHibernateAndJpa.DataAccess;

import com.SpringBoot.project.springHibernateAndJpa.Entities.City;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;
@Repository
public class HibernateCityDataAccess  implements ICityDataAccess{
    private EntityManager entityManager;
    @Autowired
    public HibernateCityDataAccess(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    @Transactional
    public List<City> getAll() {
        Session session =entityManager.unwrap(Session.class);
        List<City> cities=session.createQuery("from City",City.class).getResultList();
        return cities;
    }

    @Override
    public void add(City city) {

    }

    @Override
    public void update(City city) {

    }

    @Override
    public void delete(City city) {

    }
}
