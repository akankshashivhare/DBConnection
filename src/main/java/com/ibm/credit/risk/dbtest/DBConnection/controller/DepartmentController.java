package com.ibm.credit.risk.dbtest.DBConnection.controller;


import java.util.List;
// Importing required classes
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ibm.credit.risk.dbtest.DBConnection.entity.Department;
import com.ibm.credit.risk.dbtest.DBConnection.service.DepartmentService;
 
// Annotation
@RestController
 
// Class
public class DepartmentController {
 
    @Autowired private DepartmentService departmentService;
 
    // Save operation
    @PostMapping("/save")
    public Department saveDepartment(
         @RequestBody Department department)
    {
        return departmentService.saveDepartment(department);
    }
 
    // Read operation
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList()
    {
        return departmentService.fetchDepartmentList();
    }
 
    // Update operation
    @PutMapping("/departments/{id}")
    public Department
    updateDepartment(@RequestBody Department department,
                     @PathVariable("id") Long departmentId)
    {
        return departmentService.updateDepartment(
            department, departmentId);
    }
 
    // Delete operation
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id")
                                       Long departmentId)
    {
        departmentService.deleteDepartmentById(
            departmentId);
        return "Deleted Successfully";
    }
}
