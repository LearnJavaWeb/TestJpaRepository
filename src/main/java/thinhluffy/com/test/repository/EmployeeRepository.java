package thinhluffy.com.test.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import thinhluffy.com.test.model.Department;
import thinhluffy.com.test.model.Employee;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {
    Iterable<Employee> findAllByDepartment(Department department);

    Page<Employee> findAllByNameContaining(String name, Pageable pageable);
}
