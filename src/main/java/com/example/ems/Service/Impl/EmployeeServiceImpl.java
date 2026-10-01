package com.example.ems.Service.Impl;

import com.example.ems.DTO.EmployeeDTO;
import com.example.ems.Entity.Employee;
import com.example.ems.Mapper.EmployeeMapper;
import com.example.ems.Repository.EmployeeRepository;
import com.example.ems.Service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDTO);
        Employee savedEmployee = employeeRepository.save(employee);
        return  EmployeeMapper.mapToEmployeeDTO(savedEmployee);
    }
}
