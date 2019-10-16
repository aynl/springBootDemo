package com.springboot.dubbo.demo.component;

import com.alibaba.dubbo.config.annotation.Service;
import com.springboot.dubbo.demo.contract.ICityContract;
import com.springboot.dubbo.demo.model.City;
import com.springboot.dubbo.demo.service.impl.CityService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author : lisy
 * @version $Id: CityContract, v 0.1 2019年10月16日 上午11:10 lisy Exp $
 */
@Service(version = "1.0.0")
public class CityContract implements ICityContract {


    @Autowired CityService cityService;

    /**
     * 获取城市信息
     * @param cityId
     * @return
     */
    @Override public City getCity(Integer cityId) {
        return cityService.getCity(cityId);
    }
}
