class Employee {
    String name;
    int number;

    public Employee(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void printData() {
        System.out.println("Name: " + name + ", Number: " + number);
    }
}

class Scientist extends Employee {
    String publication;

    public Scientist(String name, int number, String publication) {
        super(name, number);
        this.publication = publication;
    }

    public void printData() {
        super.printData();
        System.out.println("Publication: " + publication);
    }
}

class Manager extends Employee {
    String title;
    double clubDues;

    public Manager(String name, int number, String title, double clubDues) {
        super(name, number);
        this.title = title;
        this.clubDues = clubDues;
    }

    public void printData() {
        super.printData();
        System.out.println("Title: " + title + ", Club dues:" + clubDues);
    }
}