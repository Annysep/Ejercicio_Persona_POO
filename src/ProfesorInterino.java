public final class ProfesorInterino extends Profesor {
    private double salario;

    public ProfesorInterino(String nombre, double salario) {
        super(nombre);
        this.salario = salario;
    }

    @Override
    protected void metodoSoloHijas() {
        System.out.println("Método implementado por Profesor Interino.");
    }

    @Override
    public void calcularBono() {
        double bono = salario * 0.10;
        System.out.println("El bono de " + nombre + " es: " + bono);
    }
}


