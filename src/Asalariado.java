public abstract class Asalariado extends Persona {
    public Asalariado(String nombre) {
        super(nombre);
    }

    // Método abstracto que se implementará en clases hijas y será llamado desde main()
    public abstract void calcularBono();
}



