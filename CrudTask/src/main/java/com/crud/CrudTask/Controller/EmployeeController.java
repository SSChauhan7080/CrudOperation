package com.crud.CrudTask.Controller;

import com.crud.CrudTask.Service.EmployeeService;
import com.crud.CrudTask.dto.EmployeeDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    //build the employee
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployeee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto savedEmployee=employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long eid){
        EmployeeDto employeeDto=employeeService.getEmployeeById(eid);
        return ResponseEntity.ok(employeeDto);
    }
    //get all employee
    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
       List<EmployeeDto> employees= employeeService.getAllEmployee();
       return  ResponseEntity.ok(employees);
    }
//update employee
    @PutMapping("/{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable("id") Long eid,
                                                      @RequestBody  EmployeeDto updatedEmploye){
        EmployeeDto employeeDto= employeeService.updateEmployee(eid, updatedEmploye);
        return ResponseEntity.ok(employeeDto);
    }

    //delete employee by id
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long eid){
        employeeService.deleteEmployee(eid);
        return ResponseEntity.ok("Emplyee deleted succesfully");
    }
}
