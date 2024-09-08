public final class VoluntarioExterno extends Voluntario {
    private int horasTrabajadas;

    public VoluntarioExterno(String nombre, int horasTrabajadas) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    protected void metodoSoloHijas() {
        System.out.println("Método implementado por Voluntario Externo.");
    }

    @Override
    public void calcularBono() {
        System.out.println(nombre + " no recibe bono, pero ha trabajado " + horasTrabajadas + " horas.");
    }
}
