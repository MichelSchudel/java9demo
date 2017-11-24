package nl.craftsmen.java9demo.privateInterfaceMethods;

public interface MyCarInterface {

    default void drive() {
        startEngine();
        applyGas();
    }

    private void applyGas() {
        System.out.println("Applying gGas");
    }

    private void startEngine() {
        System.out.println("Starting engine");
    }

    static void getProperties() {
        System.out.println("4 wheels");
        getSteering();

    }

    private static void getSteering() {
        System.out.println("1 steering wheel");

    }
}
