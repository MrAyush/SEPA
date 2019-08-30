abstract class Employeex {
    String name;
    int EID;
    public Employeex(String name, int EID) {
        this.name = name;
        this.EID = EID;
    }
    abstract void earnings();
    abstract void printData();
}
class Boss extends Employeex {

    double weeklySal;
    public Boss(String name, int EID, double salary) {
        super(name, EID);
        this.weeklySal = salary;
    }

    @Override
    void earnings() {
        System.out.println(weeklySal * 54);
    }

    @Override
    void printData() {
        System.out.println("Name: " + name + ", Eid: " + EID);
        this.earnings();
    }
}

class HrlyWorker extends Employeex {
    double wage, hours;
    public HrlyWorker(String name, int EID, double wage, double hours) {
        super(name, EID);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    void earnings() {
        System.out.println(wage * hours);
    }

    @Override
    void printData() {
        System.out.println("Name: " + name + ", Eid: " + EID);
        this.earnings();
    }
}

class CommissionWorker extends Employeex {
    double salary;
    double commission;
    int quantity;

    public CommissionWorker(String name, int EID, double salary, double commission, int quantity) {
        super(name, EID);
        this.salary = salary;
        this.commission = commission;
        this.quantity = quantity;
    }

    @Override
    void earnings() {
        System.out.println((salary  + (commission * quantity)));
    }

    @Override
    void printData() {
        System.out.println("Name: " + name + ", Eid: " + EID);
        this.earnings();
    }
}

class PeiceWorker extends Employeex{

    double wagePerPeice;
    int quantity;

    public PeiceWorker(String name, int EID, double wagePerPeice, int quantity) {
        super(name, EID);
        this.wagePerPeice = wagePerPeice;
        this.quantity = quantity;
    }

    @Override
    void earnings() {
        System.out.println((wagePerPeice * quantity));
    }

    @Override
    void printData() {
        System.out.println("Name: " + name + ", Eid: " + EID);
        this.earnings();
    }
}