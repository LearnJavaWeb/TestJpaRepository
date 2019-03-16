package thinhluffy.com.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import thinhluffy.com.test.model.Department;
import thinhluffy.com.test.repository.DepartmentRepository;
import thinhluffy.com.test.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Iterable<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Department findById(Integer id) {
        return departmentRepository.findOne(id);
    }

    @Override
    public void save(Department department) {
        departmentRepository.save(department);
    }

    @Override
    public void remove(Integer id) {
        departmentRepository.delete(id);
    }
}