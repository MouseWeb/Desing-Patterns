package design_patterns_cod3r.Estrura.bridge.converter.converters;

import design_patterns_cod3r.Estrura.bridge.converter.employees.Employee;

import java.util.Locale;

public class CSVConverter implements Converter {

	@Override
	public String getEmployeeFormated(Employee emp) {
		return String.format(Locale.US, "%s,%d,%.2f", 
				emp.getName(),
				emp.getAge(),
				emp.getSalary());
	}

}
