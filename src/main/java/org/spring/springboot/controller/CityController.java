package org.spring.springboot.controller;

import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * @author spike.lin
 */
@RestController
@RequestMapping(value = "/api")
public class CityController {

    @Resource
    private CityService cityService;

    @RequestMapping(value = "/city/{id}", method = RequestMethod.GET)
    public City findOneCity(@PathVariable(value = "id") Long id) {
        return cityService.findCityById(id);
    }

    @RequestMapping(value = "/city", method = RequestMethod.GET)
    public List<City> findAllCity() {
        return cityService.findAllCity();
    }

    @RequestMapping(value = "/city", method = RequestMethod.POST)
    public Long addCity(@RequestBody @Valid City city) {
        return cityService.addCity(city);
    }

    @RequestMapping(value = "/city", method = RequestMethod.PUT)
    public Long updateCity(@RequestBody @Valid City city) {
        return cityService.updateCity(city);
    }

    @RequestMapping(value = "/city/{id}", method = RequestMethod.DELETE)
    public Long deleteCity(@PathVariable Long id) {
        return cityService.deleteCity(id);
    }
}
