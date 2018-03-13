package org.spring.springboot.service;

import org.spring.springboot.domain.City;

import java.util.List;

/**
 * @author spike.lin
 */
public interface CityService {
    /**
     * 通过城市名称，获取城市信息
     *
     * @param cityName 城市名称
     * @return 城市信息
     */
    City findCityByName(String cityName);

    /**
     * 根据城市id，获取城市信息
     *
     * @param id 城市id
     * @return 城市信息
     */
    City findCityById(Long id);

    /**
     * 获取城市信息列表
     *
     * @return 城市列表
     */
    List<City> findAllCity();

    /**
     * 添加新的城市
     *
     * @param city 城市信息
     * @return 城市id
     */
    Long addCity(City city);

    /**
     * 更新城市信息
     *
     * @param city
     * @return
     */
    Long updateCity(City city);

    /**
     * 根据城市id,删除城市
     *
     * @param id
     * @return
     */
    Long deleteCity(Long id);
}
