package ux.test.businessLogic;

import ux.test.impl.JsonLibrary;

import java.util.List;

public class EmployeeSerializer {
    public String serializeEmployees(List<Person> employees) {
        JsonLibrary jsonLibrary = new JsonLibrary();

        try {
            String json = jsonLibrary.convertToJson(employees);
            System.out.println("Serialized JSON: " + json);

            return json;

        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public List<Person> deserializeEmployees(String json) {
        JsonLibrary jsonLibrary = new JsonLibrary();

        try {
            // Deserialize the JSON back to a Person object
            List<Person> employeeList = jsonLibrary.convertFromJson(json, List.class);
            System.out.println("Deserialized Employees: " + employeeList.size());

            return employeeList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
