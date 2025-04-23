package com.crud.CrudTask.Service.impl;

import com.crud.CrudTask.Entity.Employee;
import com.crud.CrudTask.Exceptions.ResourceNotFoundExceptions;
import com.crud.CrudTask.Mapper.EmplyeeMapper;
import com.crud.CrudTask.Service.EmployeeService;
import com.crud.CrudTask.UserRepository.EmployeeRepository;
import com.crud.CrudTask.dto.EmployeeDto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        //convert first dto to jpa entity
        Employee employee= EmplyeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee= employeeRepository.save(employee);
        //for return convert employeeJpa to dto
        return EmplyeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee=employeeRepository.findById(employeeId)
                .orElseThrow(()->new ResourceNotFoundExceptions("Employee is not exist with given id "+employeeId));
        return EmplyeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public List<EmployeeDto> getAllEmployee() {
        List<Employee> employees=employeeRepository.findAll();
        return employees.stream().map((employee)->EmplyeeMapper.mapToEmployeeDto(employee))
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee) {
        Employee employee=employeeRepository.findById(employeeId)
                .orElseThrow(()->new ResourceNotFoundExceptions("Employee is not exist with given id "+employeeId));
        employee.setFirstName(updatedEmployee.getFirstName());
        employee.setLastName(updatedEmployee.getLastName());
        employee.setEmail(updatedEmployee.getEmail());

        Employee updatedEmployeeObj=employeeRepository.save(employee);
        return EmplyeeMapper.mapToEmployeeDto(updatedEmployeeObj);
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        Employee employee=employeeRepository.findById(employeeId)
                .orElseThrow(()->new ResourceNotFoundExceptions("Employee is not exist with given id "+employeeId));
        employeeRepository.deleteById(employeeId);
    }
}
