public sealed abstract class Employee permits Manager, Salesman {
    
    protected String code;
    protected String name;
    protected String addres;
    protected int age;
    protected double salary;

    
    
    public Employee(String code,
                    String name,
                    String addres,
                    int age,
                    double salary) 
                    {
                    this.code = code;
                    this.name = name;
                    this.addres = addres;
                    this.age = age;
                    this.salary = salary;
    }
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public String getAddres() {
        return addres;
    }
    public int getAge() {
        return age;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddres(String addres) {
        this.addres = addres;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;

    }
    public abstract double getFullSalary();

}
