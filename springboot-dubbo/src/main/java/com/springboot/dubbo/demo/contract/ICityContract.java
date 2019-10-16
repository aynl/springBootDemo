package com.springboot.dubbo.demo.contract;

import com.springboot.dubbo.demo.model.City;

/**
 * @author : lisy
 * @version $Id: ICityContract, v 0.1 2019年10月16日 上午11:07 lisy Exp $
 */
public interface ICityContract {

    /**
     * 获取城市信息
     * @param cityId
     * @return
     */
    City getCity(Integer cityId);
}
