package com.baeldung.hbase.controller;

import com.baeldung.hbase.HbaseClientExample;
import com.google.protobuf.ServiceException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/hbase")
public class HbaseController {

    @GetMapping("/get")
    public void get() {
        try {
            new HbaseClientExample().connect();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ServiceException e) {
            e.printStackTrace();
        }
    }

    @GetMapping("/status")
    public String status() {
        return "OK";
    }

}
