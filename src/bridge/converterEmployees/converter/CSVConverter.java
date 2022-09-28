package bridge.converterEmployees.converter;

import bridge.converterEmployees.employee.Employee;

import java.util.Locale;

public class CSVConverter implements Converter {

    // valores separados por virgula

    @Override
    public String getEmployeeFormated(Employee emp) {
        // locale usa o ponto como bloqueio de casas decimais
        return String.format(Locale.US, "%s,%d,%.2f",
                emp.getName(),
                emp.getAge(),
                emp.getSalary());
    }

}