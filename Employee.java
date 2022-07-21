class Employee
{
      private String name;
      private int yearofjoining;
      private int salary;
      private String address;
      public Employee(String n,int y,int s,String a)
      {
            name = n;
            yearofjoining = y;
            salary = s;
            address = a;
      }
      public String getName()
      {
           return name;
      }
      public int getYearOfJoining()
      {
          return yearofjoining;
      }
      public int getSalary()
      {
          return salary;
      }
      public String getAddress()
      {
          return address;
      }
      public static void main(String args[])
      {
            Employee e1 = new Employee("Robert",1994,30000,"64C-WallsStreat");
            System.out.println("Employee Name: " + e1.getName());
            System.out.println("Employee Year of joining : " + e1.getYearOfJoining());
            System.out.println("Employee Salary: " + e1.getSalary());
            System.out.println("Employee Address: " + e1.getAddress());
            
            Employee e2 = new Employee("Sam",2000,40000,"68D-WallsStreat");
            System.out.println("Employee Name: " + e2.getName());
            System.out.println("Employee Year of joining : " + e2.getYearOfJoining());
            System.out.println("Employee Salary: " + e2.getSalary());
            System.out.println("Employee Address: " + e2.getAddress());
            
            Employee e3 = new Employee("John",1999,45000,"26B-WallsStreat");
            System.out.println("Employee Name: " + e3.getName());
            System.out.println("Employee Year of joining : " + e3.getYearOfJoining());
            System.out.println("Employee Salary: " + e3.getSalary());
            System.out.println("Employee Address: " + e3.getAddress());
            
     }
}
