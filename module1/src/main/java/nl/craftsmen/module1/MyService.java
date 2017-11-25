package nl.craftsmen.module1;

import nl.craftsmen.module2.MyDependantService;
import nl.craftsmen.module2.internal.MyInternalClass;

public class MyService {


    public static void main(String[] args) {
        MyService myService = new MyService();
        myService.execute();
        MyInternalClass myInternalClass = new MyInternalClass();
        myInternalClass.execute();
    }

    public void execute() {
        System.out.println("executing service");
        MyDependantService myDependantService = new MyDependantService();
        myDependantService.execute();

    }
}
