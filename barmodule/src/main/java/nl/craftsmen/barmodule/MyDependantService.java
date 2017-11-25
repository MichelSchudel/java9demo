package nl.craftsmen.barmodule;

import nl.craftsmen.barmodule.internal.MyInternalClass;

public class MyDependantService {

    public void execute() {
        System.out.println("executing dependant service");
        MyInternalClass myInternalClass = new MyInternalClass();
        myInternalClass.execute();
    }
}
