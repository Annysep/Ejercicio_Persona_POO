public abstract class Persona {
    protected String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto que implementarán las clases hijas
    protected abstract void metodoSoloHijas();  // Este no puede llamarse desde main()

    public String getNombre() {
        return nombre;
    }
}



