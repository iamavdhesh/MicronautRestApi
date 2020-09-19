package com.app.controller

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/")
class UserController {


    @Get("/user{name}", produces = [MediaType.APPLICATION_JSON])
    fun getName(name: String?): String {
        return "Hello Mr $name"
    }

}