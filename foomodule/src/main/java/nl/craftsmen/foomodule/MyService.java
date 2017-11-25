package nl.craftsmen.foomodule;

import com.sun.net.httpserver.HttpServer;
import nl.craftsmen.barmodule.MyDependantService;
import nl.craftsmen.barmodule.internal.MyInternalClass;

import java.io.IOException;

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
        try {
            HttpServer httpServer = HttpServer.create();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
