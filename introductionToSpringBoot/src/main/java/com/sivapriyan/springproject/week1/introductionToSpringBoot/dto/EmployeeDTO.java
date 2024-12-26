package com.sivapriyan.springproject.week1.introductionToSpringBoot.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sivapriyan.springproject.week1.introductionToSpringBoot.annotations.EmployeeRoleValidation;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.expression.common.TemplateAwareExpressionParser;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    private Long id;

    @NotBlank(message = "Required field in Employee: name")
    @Size(min = 3, max = 10, message = "Number of characters in name should be in the range: 3-10")
    private String name;

    @NotBlank(message = "Email of the Employee cannot be blank")
    @Email(message = "Email should be a valid email")
    private String email;

    @NotNull(message = "Age of the Employee cannot be null")
    @Max(value = 80, message = "Age cannot be greater than 80")
    @Min(value = 18, message = "Age cannot be less than 18")
    private Integer age;

    @NotBlank(message = "Role of the Employee cannot be blank")
//    @Pattern(regexp = "^(ADMIN|USER)$" ,message = "Role of Employee can be USER or ADMIN")
    @EmployeeRoleValidation
    private String role;

    @NotNull(message = "salary of the Employee should not be null")
    @Positive(message = "salary of the Employee should be positive")
    @Digits(integer = 6,fraction = 2, message = "The salary can be in the form XXXX.YY")
    @DecimalMax(value = "100000.99")
    @DecimalMin(value = "100.50")
    private Double salary;

    @PastOrPresent(message = "Date of Joining field in Employee cannot be in the future")
    private LocalDate dateOfJoining;

    @AssertTrue(message = "Employee should be active")
    @JsonProperty("isActive")
    private Boolean isActive;

}

