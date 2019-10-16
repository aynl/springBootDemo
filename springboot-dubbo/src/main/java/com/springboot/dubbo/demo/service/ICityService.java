package com.springboot.dubbo.demo.service;

import com.springboot.dubbo.demo.model.City;

/**
 * @author : lisy
 * @version $Id: ICityService, v 0.1 2019年10月16日 上午11:13 lisy Exp $
 */
public interface ICityService {


    City getCity(Integer cityId);
}
