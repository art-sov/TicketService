package com.art.tecketservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "price-service")
public interface PriceServiceClient {

    @RequestMapping(method = RequestMethod.GET, value = "/priceapi/price/{type}", produces = "application/json")
    Double getPrice(@PathVariable("type") String type);
}
