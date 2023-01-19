class Employee
{
    int id;

    Employee()
    {
        System.out.println("This is Default Constructor");
    }
    Employee(int i)
    {
        id = i;
    }
}
public class ConstructorOverLoading
{
    public static void main(String[] args)
    {
        Employee emp=new Employee();
        Employee e=new Employee(10);
        System.out.println("This is Parameterize Constructor in Employee id is : " +e.id);;
    }
}

