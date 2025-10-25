package br.com.dio;

import br.com.dio.persistence.ConnectionUtil;
import br.com.dio.persistence.EmployeeDAO;
import org.flywaydb.core.Flyway;

import java.sql.SQLException;

public class Main {

	private final static EmployeeDAO employeeDAO = new EmployeeDAO();

	public static void main(String[] args) {
		var flyway = Flyway.configure().dataSource().load();

	}
}
