public class Worker {
    private String surname;
    private String name;
    private String patronymic;
    private String position;
    private String email;
    private int phoneNumber;
    private int salary;
    private int age;

    public Worker(String surname, String name, String patronymic, String position, String email, int phoneNumber, int salary, int age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showInfo(){
        System.out.println("Surname: " + getSurname() + "\n" + "Name: " + getName() + "\n" + "Patronymic: " + getPatronymic() +
                "\n" + "Position: " + getPosition() + "\n" + "Email: " + getEmail() + "\n" + "Phone Number: " + getPhoneNumber() +
                "\n" + "Salary: " + getSalary() + "\n" + "Age: " + getAge() + "\n");
    }

    public static void main(String[] args) {
        Worker[] workers = new Worker[5];
        workers[0] = new Worker("Petrov", "Ivan", "Andreeevich", "team lead", "123@.com", 111, 3500, 45);
        workers[1] = new Worker("Sidorov", "Vlad", "Nicolaevich", "middle", "4321@.com", 222, 2200, 26);
        workers[2] = new Worker("Smirnov", "Igor", "Vladislavovich", "junior", "877@.com", 333, 900, 20);
        workers[3] = new Worker("Gorbacheva", "Anna", "Igorevna", "senior", "543@.com", 444, 1700, 23);
        workers[4] = new Worker("Bynis", "Arty", "Konstantinovich", "junior", "444@.com", 555, 850, 41);

        for(int i = 0; i < workers.length; i++){
            if(workers[i].getAge() >= 40){
                System.out.println("information about " + (i+1) + " worker:");
                System.out.println();
                workers[i].showInfo();
            }
        }
    }
}
