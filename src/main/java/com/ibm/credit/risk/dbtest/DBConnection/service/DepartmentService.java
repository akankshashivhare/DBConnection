package com.ibm.credit.risk.dbtest.DBConnection.service;

import java.util.List;

import com.ibm.credit.risk.dbtest.DBConnection.entity.Department;

//Interface
public interface DepartmentService {

 // Save operation
 Department saveDepartment(Department department);

 // Read operation
 List<Department> fetchDepartmentList();

 // Update operation
 Department updateDepartment(Department department,
                             Long departmentId);

 // Delete operation
 void deleteDepartmentById(Long departmentId);
}
