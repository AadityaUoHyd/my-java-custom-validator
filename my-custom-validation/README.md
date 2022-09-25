# Implementing my own custom-validation in spring-boot (through java annotation)

- Here, we declare our own annotation. We can perform validation on the basis of our own business logic. 
   In this demo project, I'm validating "employeeType" which can only have three values : 'permanent' or 'Third-Party-Vendor', 'Contractual'.
   For this, create a annotation with given field(e.g. employeeType) to validate, we need to implement 
   ConstraintValidator interface from javax.validation package, which takes our custom annotation
   (e.g. ValidateEmployeeType) and dataType of the field which we need to validate(e.g. String) as parameter.
   

- Go to postman and provide payload as json body:

{
    "firstName":null,
    "lastName":"Raj",
    "doj":"22-10-2022",
    "dept":"",
    "email":"aadiraj@gmail.com",
    "employeeType":"abc"
}

            Now, hit URL with POST : http://localhost:8080/employees

- Output will be (It'll validate and provide custom message for those wrongly filled fields):

{
    "firstName": "firstName cannot be null or empty",
    "employeeType": "Invalid employeeType: It should be either Permanent Or vendor",
    "dept": "department should not be empty",
    "doj": "your date of joining must be earlier than current date"
}