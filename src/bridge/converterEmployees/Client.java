package bridge.converterEmployees;

import bridge.converterEmployees.converter.CSVConverter;
import bridge.converterEmployees.converter.Converter;
import bridge.converterEmployees.converter.JsonConverter;
import bridge.converterEmployees.employee.Intern;
import bridge.converterEmployees.employee.TechManager;

public class Client {

    public static void main(String[] args) {
        Converter csvConverter = new CSVConverter();
        Converter jsonConverter = new JsonConverter();

        Intern intern = new Intern("Joana Doe", 24, 4000d);
        TechManager tm = new TechManager("Erick Wendel", 27, 6000d);

        System.out.println(csvConverter.getEmployeeFormated(intern));
        System.out.println(jsonConverter.getEmployeeFormated(intern));
        System.out.println(csvConverter.getEmployeeFormated(tm));
        System.out.println(jsonConverter.getEmployeeFormated(tm
        ));
    }
}
