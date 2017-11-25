package nl.craftsmen.module2;

import nl.craftsmen.module2.internal.MyInternalClass;

public class MyDependantService {

    public void execute() {
        System.out.println("executing dependant service");
        MyInternalClass myInternalClass = new MyInternalClass();
        myInternalClass.execute();
    }
}
