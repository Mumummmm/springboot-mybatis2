package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.City;

import java.util.List;

/**
 * @author spike.lin
 */
public interface CityDao {
    /**
     * 根据城市名称返回对应城市的信息
     *
     * @param cityName 城市名
     * @return 对应城市类
     */
    City findByName(@Param(value = "cityName") String cityName);

    /**
     * 根据城市id，获取城市的信息
     *
     * @param id 城市id
     * @return
     */
    City findById(@Param(value = "id") Long id);

    /**
     * 获取城市信息列表
     *
     * @return
     */
    List<City> findAllCity();

    /**
     * 添加一个新的城市
     *
     * @param city 城市的信息
     * @return 城市id
     */
    Long addCity(City city);

    /**
     * 更新城市信息
     *
     * @param city 城市信息
     * @return 城市id
     */
    Long updateCity(City city);

    /**
     * 根据id删除城市
     *
     * @param id 城市id
     * @return 城市id
     */
    Long deleteCity(Long id);

}
