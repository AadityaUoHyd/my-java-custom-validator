package org.aadi.validators.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

import org.aadi.validators.valiadtion.ValidateEmployeeType;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    
    private int empId;
    @NotBlank(message = "firstName cannot be null or empty")
    private String firstName;
    @NotBlank(message = "lastName cannot be null or empty")
    private String lastName;
    @Past(message = "your date of joining must be earlier than current date")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date doj;
    @NotNull(message = "department should not be null")
    @NotEmpty(message = "department should not be empty")
    private String dept;
    @Email(message = "email id is invalid")
    private String email;

    //my custom annotation
    @ValidateEmployeeType
    private String employeeType; //Permanent, Third-Party-Vendor, Contractual
}
