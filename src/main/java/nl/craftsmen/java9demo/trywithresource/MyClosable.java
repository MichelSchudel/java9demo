package nl.craftsmen.java9demo.trywithresource;

public class MyClosable implements AutoCloseable {

    @Override
    public void close() {
        System.out.println(" closing ");
    }
}
