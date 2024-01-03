package org.redeyefrog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/rest")
@RestController
public class DemoRestController {

    @GetMapping("/doGet")
    public String query() {
        log.info("DO GET!!");
        return "Query Data Success";
    }

    @PostMapping("/doPost")
    public String save() {
        log.info("DO POST!!");
        return "Insert Data Success";
    }

    @PutMapping("/doPut")
    public String update() {
        log.info("DO PUT!!");
        return "Update Data Success";
    }

    @DeleteMapping("/doDelete")
    public String delete() {
        log.info("DO DELETE!!");
        return "Delete Data Success";
    }

}
