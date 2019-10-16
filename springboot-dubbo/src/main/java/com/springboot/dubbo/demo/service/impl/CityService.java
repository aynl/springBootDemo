package com.springboot.dubbo.demo.service.impl;

import com.springboot.dubbo.demo.model.City;
import com.springboot.dubbo.demo.service.ICityService;
import org.springframework.stereotype.Service;


/**
 * @author : lisy
 * @version $Id: CityService, v 0.1 2019年10月16日 上午11:14 lisy Exp $
 */
@Service
public class CityService implements ICityService{



    @Override public City getCity(Integer cityId) {
        if (cityId > 0){
            City city = new City();
            city.setCityId(cityId);
            city.setCityName(city + "城市");
            return city;
        }
        return null;
    }
}
