package com.sivapriyan.springproject.week1.introductionToSpringBoot.controllers;

import com.sivapriyan.springproject.week1.introductionToSpringBoot.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

//    @GetMapping(path = "/getMessage")
//    public String getMessageSpring(){
//        return "Message Successfully got";
//    }

    @GetMapping(path = "/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable(name = "employeeId") Long employeeId){
        return new EmployeeDTO(employeeId,"Siva","siva@gmail.com",21, LocalDate.of(2024,1,2), true);
    }

    @GetMapping
    public String getAllEmployees(@RequestParam(required = false) Integer age,
                                  @RequestParam(required = false) String sortBy)
    {
        return "Hi age"+age+" "+sortBy;
    }

    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO inputEmployee){
        inputEmployee.setId(100L);
        return inputEmployee;
    }

    @PutMapping
    public String updateEmployeeById(){
        return "Hello from put";
    }
}
