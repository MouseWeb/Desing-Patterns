package design_patterns_cod3r.Estrura.bridge.converter.converters;

import design_patterns_cod3r.Estrura.bridge.converter.employees.Employee;

public class JsonConverter implements Converter {

	@Override
	public String getEmployeeFormated(Employee emp) {
		StringBuilder builder = new StringBuilder();
		builder.append("{\n")
			.append("\t\"name\": \"").append(emp.getName()).append("\",\n")
			.append("\t\"age\": \"").append(emp.getAge()).append("\",\n")
			.append("\t\"salary\": \"").append(emp.getSalary()).append("\"\n")
		.append("}");
		
		return builder.toString();
	}

}
