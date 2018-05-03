package com.websystique.springmvc.controller;


import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class Controller11 {

    //public String post1( @RequestBody Marker marker) {

    //@RequestMapping(value="/ss", method = RequestMethod.POST,consumes = "application/json")
    @RequestMapping(value="/ss", method = RequestMethod.POST)
    public String post( @RequestBody String marker) {
        System.out.println(marker);
        return "OKAY";
    }

    @RequestMapping(value="/sss", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody  public List<Marker> sss( ) {

        Marker marker1 = new Marker(1,"g");
        Marker marker2 = new Marker(5,"gg");
        List<Marker> list = new ArrayList<>(Arrays.asList(marker1, marker2));
        return list;
    }

    @RequestMapping(value="/ss1", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String post2( @RequestBody Marker markers) {
        System.out.println("CTR:"+markers);
        return "OKAY";
    }

    @RequestMapping(value="/ss2", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String post1( @RequestBody List<Marker> markers) {
        System.out.println("CTR:"+markers);
        return "OKAY";
    }

}
