import java.util.*;
import java.util.ArrayList;

class Employee{
    int id;
    String name;
    int salary;

    Employee(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary=salary;
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {

//        Employee employee1 = new Employee(1,"John",10000);
//        Employee employee2 = new Employee(2,"Nimesh",12000);
//        Employee employee3 = new Employee(3,"Rahul",12000);


        int [] id ={1,2,3};
        String [] name ={"John","Nimesh","Rahul"};
        int [] salary = {10000,12000,12000};


        List<Employee> list = new ArrayList<>();
        for (int i = 0; i <id.length ; i++) {
            Employee employee = new Employee(id[i],name[i],salary[i]);
            list.add(employee);
//            HashMap<Integer,Employee> map = new HashMap<>();
//            Map<Integer,Employee> map1 = new Hashtable<>();
//            HashSet<Integer> map2 = new HashSet<>();
        }

//        list.add(employee1);
//        list.add(employee2);
//        list.add(employee3);

//        for(Employee e:list){
//            System.out.println(e.id + " " + e.name + " " + e.salary);
//        }

//        Iterator<Employee> iterator = list.iterator();
//
//        while(iterator.hasNext()){
//            Employee e  =iterator.next();
//            System.out.println(e.id+ " " + e.name + " " + e.salary);
//
//        }

        ListIterator<Employee> listIterator = list.listIterator(list.size());
        while(listIterator.hasPrevious()){
            Employee e = listIterator.previous();
            System.out.println(e.id + " "+ e.name + " "+ e.salary);
        }


    }
}
