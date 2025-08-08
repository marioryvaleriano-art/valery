public class motocicleta extends vehiculo {

    public motocicleta(String marca, String modelo) {
        // Llamada al constructor de la clase padre
        super(marca, modelo);
    }

    // Sobrescribimos el método encender (Polimorfismo)
    @Override
    public void encender() {
        System.out.println("La motocicleta " + getMarca() + " se enciende con el botón de arranque.");
    }
}
