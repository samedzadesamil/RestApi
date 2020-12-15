package com.SpringBoot.project.springHibernateAndJpa.restApi;

import com.SpringBoot.project.springHibernateAndJpa.Entities.City;
import com.SpringBoot.project.springHibernateAndJpa.Service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")

public class CityController {
    private ICityService cityService;
    @Autowired
    public CityController(ICityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/cities")
    public List<City> get(){
        return cityService.getAll();

    }




}
