package nl.craftsmen.java9demo.trywithresource;

public class ResourceDemo {

    public static void main(String[] args) {
        MyClosable myClosable = new MyClosable();
        try (myClosable) {
            System.out.println(myClosable);
        }
        System.out.println(myClosable.toString());
    }
}
