package controller;

import java.sql.SQLException;
import java.util.List;
import model.Database;
import model.Employee;

public class Controller {
    Database db = new Database();
    public Controller(){
        try{
            db.connect();
            db.getFromDatabase();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void addEmployee(Employee employee){
        db.addEmployeeToDatabase(employee);
    }
    public List<Employee> getEmployees(){
        return db.getEmployees();
    }
}
