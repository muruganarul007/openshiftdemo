package com.example.openshiftdemo;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class NewController {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String test() {
        return "First test on OpenShift";
    }

    @RequestMapping(value = "/user/login/{name}", method = RequestMethod.GET)
    public String test1(@PathVariable("name") String name) {
        return "First test on OpenShift done by : "+name;
    }

    @RequestMapping(value = "/user/info", method = RequestMethod.POST)
    public String test2(@Valid @RequestBody SampleRequest request) {
        SampleRequest request1 = new SampleRequest(request.getName(), request.getId());
        return "Hello : "+request1.getName()+ " and your User Id is: "+request1.getId();
    }
}
