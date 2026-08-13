public non-sealed class Manager extends Employee{
    private String login;
    private String password;
    private double commission;

    @Override
    public String getCode(){
        return "MN" + super.getCode();
    }
    @Override
    public double getFullSalary(){
        return this.salary + this.commission;
    }

    public Manager(
            String code,
            String name,
            String address,
            int age,
            double salary,
            String login,
            String password,
            double commission
        ){
            super(code, name, address, age, salary);
            this.login = login;
            this.commission = commission;
            this.password = password;

            }


    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
    public double getCommission() {
        return commission;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setCommission(double commission) {
        this.commission = commission;
    }
    
}
