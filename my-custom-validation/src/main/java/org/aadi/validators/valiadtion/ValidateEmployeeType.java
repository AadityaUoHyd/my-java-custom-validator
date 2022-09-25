package org.aadi.validators.valiadtion;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = EmployeeTypeValidator.class) //This class will take responsibility to validate EmployeeType
public @interface ValidateEmployeeType {

    public String message() default "Invalid employeeType: It should be either Permanent Or vendor";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
