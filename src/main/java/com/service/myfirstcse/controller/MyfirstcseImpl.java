package com.service.myfirstcse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-01-30T12:39:00.323Z")

@RestSchema(schemaId = "myfirstcse")
@RequestMapping(path = "/myfirstcse", produces = MediaType.APPLICATION_JSON)
public class MyfirstcseImpl {

    @Autowired
    private MyfirstcseDelegate userMyfirstcseDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userMyfirstcseDelegate.helloworld(name);
    }

}
