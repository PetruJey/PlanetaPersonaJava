public class Persona {
    String pais_nacimiento;
    char genero;
    public Persona(String pais_nacimiento, char genero) {
        this.pais_nacimiento = pais_nacimiento;
        this.genero = genero;
    }
    void MostrarPantalla() {
        System.out.println("Pais de nacimiento: " + pais_nacimiento);
        System.out.println("Genero: " + genero);
    }
    public static void main (String args[]){
        Persona p1 = new Persona("Japón", 'H');
        Persona p2 = new Persona("Cuba", 'M');
        p1.MostrarPantalla();
        p2.MostrarPantalla();
    }
}

