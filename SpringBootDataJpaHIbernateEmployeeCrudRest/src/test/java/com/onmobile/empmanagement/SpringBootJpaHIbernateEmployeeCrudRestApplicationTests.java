package com.onmobile.empmanagement;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.onmobile.empmanagement.dao.EmployeeDao;
import com.onmobile.empmanagement.model.Employee;
import com.onmobile.empmanagement.service.EmployeeService;
import com.onmobile.empmanagement.service.EmployeeServiceImpl;

@SpringBootTest
class SpringBootJpaHIbernateEmployeeCrudRestApplicationTests {

	@Mock
	EmployeeDao dao;
	@InjectMocks
	EmployeeService service = new EmployeeServiceImpl();
	@Test
	void testGetEmployee() {
		Employee emp2 = new Employee();

		Optional<Employee> emp3 = Optional.of(emp2);

		Mockito.when(dao.findById(36)).thenReturn(emp3);
		Employee emp = service.getEmployeeById(36);
		assertNotNull(emp);
	}
}
