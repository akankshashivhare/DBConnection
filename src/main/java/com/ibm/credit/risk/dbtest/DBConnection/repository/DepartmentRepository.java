package com.ibm.credit.risk.dbtest.DBConnection.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.credit.risk.dbtest.DBConnection.entity.Department;
 
// Annotation
@Repository
 
// Interface extending CrudRepository
public interface DepartmentRepository
    extends CrudRepository<Department, Long> {
}
