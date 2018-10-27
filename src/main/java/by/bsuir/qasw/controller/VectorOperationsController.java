package by.bsuir.qasw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/operation")
public class VectorOperationsController {
    @GetMapping("/echo")
    public String checkWork() {
        return "OK!";
    }
}
