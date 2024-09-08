public abstract class Voluntario extends Persona {
    public Voluntario(String nombre) {
        super(nombre);
    }

    // Método abstracto calcularBono accesible desde el main
    public abstract void calcularBono();
}


