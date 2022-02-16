package com.techproed.SpringBootJWT_Study;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;

@RestController
public class StudentController {
  @GetMapping(path = "/students")
  public String getStudent(String student){

      return "kursat turgut beye hayirli offerler";
  }

}
