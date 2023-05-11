package com.example.Shop.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

//    @Autowired
//    private EmployeeService employeeService;
//
//    @GetMapping
//    public List<Employee> getAllEmployees() {
//        return employeeService.findAll();
//    }

//    @PostMapping
//    public @ResponseBody String addEmployee(@RequestParam String firstName,
//                                            @RequestParam String lastName,
//                                            @RequestParam Integer age,
//                                            @RequestParam Double salary,
//                                            @RequestParam String password){
//        Employee employee = new Employee();
//        employee.setFirstName(firstName);
//        employee.setLastName(lastName);
//        employee.setAge(age);
//        employee.setSalary(salary);
//        employee.setPassword(password);
////        EmployeeRepository.save(employee);
//
//        return "Employee added successfully ";
//    }


    @GetMapping
    public String getEmployeeById(Model model) {
        return "employee";
    }
//
//    @PutMapping("/{employeeId}")
//    public Employee updateEmployee(@PathVariable Long employeeId, @RequestBody Employee employeeDetails) {
//        return employeeService.update(employeeId, employeeDetails);
//    }
//
//    @DeleteMapping("/{employeeId}")
//    public void deleteEmployee(@PathVariable Long employeeId) {
//        employeeService.deleteEmployee(employeeId);
//    }
}