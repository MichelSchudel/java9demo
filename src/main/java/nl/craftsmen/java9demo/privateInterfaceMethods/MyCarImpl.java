package nl.craftsmen.java9demo.privateInterfaceMethods;

public class MyCarImpl implements MyCarInterface {

    public static void main(String[] args) {
        MyCarImpl myCar = new MyCarImpl();
        myCar.drive();
        MyCarInterface.getProperties();
    }
}
