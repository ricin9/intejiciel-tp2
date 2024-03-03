package com.ricin.msscholarity.entities;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-bourse", url = "localhost:8092")
public interface BourseProxy {
    @GetMapping("bourses/{id}")
    public Bourse getB(@PathVariable("id") Long id);
}