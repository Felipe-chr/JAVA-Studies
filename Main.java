public class Main {
    public static void main(String[] args) {



        
    }

    public static void printEmployee(Employee employee){


        switch (employee) {
            case Manager manager ->{
                manager.setCode("123");
                manager.setSalary(5000);
                manager.setName("João");
                manager.setLogin("João");
                manager.setPassword("123456");   
                manager.setCommission(1200);
                    
                System.out.printf("%s\n",manager.getCode());
                System.out.printf("%s\n",manager.getSalary());
                System.out.printf("%s\n",manager.getName());
                System.out.printf("%s\n",manager.getLogin());
                System.out.printf("%s\n",manager.getPassword());
                System.out.printf("%s\n",manager.getCommission());
            }
            case Salesman salesman ->{
                salesman.setCode("321");
                salesman.setSalary(2800);
                salesman.setName("Lucas");
                salesman.setPercentPerSold(10);
 
                    
                System.out.printf("%s\n",salesman.getCode());
                System.out.printf("%s\n",salesman.getSalary());
                System.out.printf("%s\n",salesman.getName());
                System.out.printf("%s\n",salesman.getPercentPerSold());
            }
            case null, default -> System.out.println("Funcionário inválido ou nulo.");
        }
        System.out.println("==============");
        System.out.printf("Salário Total: R$%.2f%n",employee.getFullSalary());
    }
}
