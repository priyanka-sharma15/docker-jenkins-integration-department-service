package com.prtech.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prtech.department.entity.Department;
import com.prtech.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepo;

	public Department saveDepartment(Department departmnetObj) {
	
		return departmentRepo.save(departmnetObj);
	}

	public Department findDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
		return departmentRepo.findByDepartmentId(departmentId);
	}

}
