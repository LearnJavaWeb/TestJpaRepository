package thinhluffy.com.test.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import thinhluffy.com.test.model.Department;

public interface DepartmentRepository extends PagingAndSortingRepository<Department, Integer> {
}
