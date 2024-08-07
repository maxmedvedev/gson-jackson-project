package ux.test.app;

import ux.test.businessLogic.EmployeeSerializer;
import ux.test.businessLogic.Person;

import java.util.List;

public class App {
    public void run() {
        Person alice = new Person("Alice", 25);
        Person tom = new Person("Tom", 23);

        List<Person> employees = List.of(alice, tom);
        EmployeeSerializer jsonSerializer = new EmployeeSerializer();
        String serializeEmployees = jsonSerializer.serializeEmployees(employees);

        System.out.println(serializeEmployees);

        List<Person> deserializeEmployees = jsonSerializer.deserializeEmployees(serializeEmployees);

        System.out.println(deserializeEmployees);
    }
}
