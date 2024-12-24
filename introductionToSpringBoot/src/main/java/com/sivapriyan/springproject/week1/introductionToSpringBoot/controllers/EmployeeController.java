package com.sivapriyan.springproject.week1.introductionToSpringBoot.controllers;

import com.sivapriyan.springproject.week1.introductionToSpringBoot.dto.EmployeeDTO;
import com.sivapriyan.springproject.week1.introductionToSpringBoot.entities.EmployeeEntitiy;
import com.sivapriyan.springproject.week1.introductionToSpringBoot.repositories.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping(path = "/{employeeId}")
    public EmployeeEntitiy getEmployeeById(@PathVariable(name = "employeeId") Long id){
        return employeeRepository.findById(id).orElse(null);
    }

    @GetMapping
    public List<EmployeeEntitiy> getAllEmployees(@RequestParam(required = false) Integer age,
                                @RequestParam(required = false) String sortBy)
    {
        return employeeRepository.findAll();
    }

    @PostMapping
    public EmployeeEntitiy createNewEmployee(@RequestBody EmployeeEntitiy inputEmployee){
        return employeeRepository.save(inputEmployee);
    }

    @PutMapping
    public String updateEmployeeById(){
        return "Hello from put";
    }
}
