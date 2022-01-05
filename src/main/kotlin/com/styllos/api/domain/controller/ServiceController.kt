package com.styllos.api.domain.controller

import com.styllos.api.domain.model.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/services")
class ServiceController {

    @GetMapping
    fun  getServices(): Service {
        return Service("test", "test")
    }
}