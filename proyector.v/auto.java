public class auto extends vehiculo {

    public auto(String marca, String modelo) {
        // Llamada al constructor de la clase padre
        super(marca, modelo);
    }

    // Sobrescribimos el método encender (Polimorfismo)
    @Override
    public void encender() {
        System.out.println("El auto " + getMarca() + " se enciende con la llave.");
    }
}
