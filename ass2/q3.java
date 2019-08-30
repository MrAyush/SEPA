interface Base1 {
    int val = 0;
    void printBase1();
}

interface Base2 {
    char val = '0';
    void printBase2();
}

class Derived implements Base1, Base2{

    @Override
    public void printBase1() {
        System.out.println(Base1.val);
    }

    @Override
    public void printBase2() {
        System.out.println(Base2.val);
    }
}