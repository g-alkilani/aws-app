package awsproject.controllers;

import awsproject.entities.Employee;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeesController {

    @GetMapping(value = "/employees")
    public List<Employee> getAllEmployees() throws InterruptedException {
        Thread.sleep(1_00);
        return fixedList();
    }

    @GetMapping(value = "/employees/{id}", produces = "application/json;charset=UTF-8")
    public Employee getEmployee(@PathVariable Integer id) throws InterruptedException {
        return new Employee("Josh", "A", id, null);
    }

    private static List<Employee> fixedList() {
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("John", "Brown", 1, null));
        list.add(new Employee("Rick", "Black", 2, 1));
        list.add(new Employee("Michael", "Clark", 1, null));
        list.add(new Employee("Josh", "Kent", 1, null));
        return list;
    }

}
