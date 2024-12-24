package com.sivapriyan.springproject.week1.introductionToSpringBoot.repositories;

import com.sivapriyan.springproject.week1.introductionToSpringBoot.entities.EmployeeEntitiy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntitiy,Long> {

}
