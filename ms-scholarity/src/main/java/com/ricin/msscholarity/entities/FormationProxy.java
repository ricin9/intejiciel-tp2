package com.ricin.msscholarity.entities;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-formation", url = "localhost:8090")
public interface FormationProxy {
    @GetMapping("formations/{id}")
    public Formation getF(@PathVariable("id") Long id);
}
