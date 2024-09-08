public final class ProfesorTitular extends Profesor {
    private double salario;

    public ProfesorTitular(String nombre, double salario) {
        super(nombre);
        this.salario = salario;
    }

    @Override
    protected void metodoSoloHijas() {
        System.out.println("Método implementado por Profesor Titular.");
    }

    @Override
    public void calcularBono() {
        double bono = salario * 0.15;
        System.out.println("El bono de " + nombre + " es: " + bono);
    }
}


