package day61_Maps;

import java.util.LinkedHashMap;
import java.util.Map;
public class MapPractice {
    public static void main(String[] args) {

        Map<String,Double> employee = new LinkedHashMap<>() ;
        employee.put("Elvia",100000.0) ;
        employee.put("Ziiadin",120000.0) ;
        employee.put("Roman",130000.0) ;
        employee.put("Cihan",250000.0) ;
        employee.put("Nurbiye",180000.0) ;

        System.out.println(employee);
        System.out.println(employee.size() ); //returns how many pairs of data

        System.out.println("Salary of Ziiadin:$" + employee.get("Ziiadin") );

        employee.remove("Ziiadin") ;

        System.out.println(employee );
        System.out.println(employee.size() );

        boolean r1 = employee.containsKey("Roman") ;
        System.out.println(r1);

        System.out.println(employee );

        boolean r2 = employee.containsValue(100000.5);

        boolean r3 = employee.containsValue(130000.0);
        System.out.println(r3);
        employee.clear();

        System.out.println(employee );

        System.out.println(employee.isEmpty() );



    }
}
