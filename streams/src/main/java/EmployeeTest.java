import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {


//        //Print all emails - One employee has one email - One to One
//        System.out.println("*********************");
//        EmployeeData.readAll()
//                .map(Employee::getEmpEmail)
//                .forEach(System.out::println);
//
//        //Print all phone numbers
//        System.out.println("*********************");
//        EmployeeData.readAll()
//                .map(Employee::getEmpPhoneNumbers)
//                .forEach(System.out::println);
//
//        System.out.println("*********************");
//        EmployeeData.readAll()
//                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
//                .forEach(System.out::println);
//
//        System.out.println("*********************");
//        EmployeeData.readAll()
//                .map(Employee::getEmpPhoneNumbers)
//                .flatMap(List::stream)
//                .forEach(System.out::println);


        //One to one (1to1) mapping
        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .forEach(System.out::println);

        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);

        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
