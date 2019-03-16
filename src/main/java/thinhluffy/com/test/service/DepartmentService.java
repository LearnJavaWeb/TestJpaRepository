package thinhluffy.com.test.service;

import thinhluffy.com.test.model.Department;

public interface DepartmentService {
    Iterable<Department> findAll();

    Department findById(Integer id);

    void save(Department department);

    void remove(Integer id);
}
