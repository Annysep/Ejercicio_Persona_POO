public class Main {
    public static void main(String[] args) {
        // Instanciar clases
        PersonalAdmvo personalAdmvo = new PersonalAdmvo("Andres", 5000);
        ProfesorTitular profesorTitular = new ProfesorTitular("Andrea", 7000);
        VoluntarioMiembro voluntarioMiembro = new VoluntarioMiembro("Ana", 80);

        // Llamar a los métodos desde el main
        personalAdmvo.calcularBono();
        profesorTitular.calcularBono();
        voluntarioMiembro.calcularBono();

        // No es posible llamar al método metodoSoloHijas() desde el main()
        // personalAdmvo.metodoSoloHijas(); // Esto provocaría un error de compilación
    }
}
