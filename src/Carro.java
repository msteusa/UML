class Carro {
    Motor motor = new Motor();

    public void arrancar() {
        motor.encender();
        System.out.println("El carro arranca");

    }
}