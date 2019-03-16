package thinhluffy.com.test.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import thinhluffy.com.test.model.Department;
import thinhluffy.com.test.model.Employee;

public interface EmployeeService {
    Page<Employee> findAll(Pageable pageable);

    Employee findById(Integer id);

    void save(Employee employee);

    void remove(Integer id);

    Iterable<Employee> findAllByDepartment(Department department);

    Page<Employee> findAllByNameContaining(String name, Pageable pageable);
}
