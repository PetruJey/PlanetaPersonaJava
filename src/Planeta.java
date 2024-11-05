public class Planeta{
    String nombre;
    double PerOrb = 0;
    double PerRot = 0;

    public Planeta(String nombre, double PerOrb, double PerRot){
        this.nombre = nombre;
        this.PerOrb = PerOrb;
        this.PerRot = PerRot;
    }
    void MostrarPantalla() {
        System.out.println("El planeta "+nombre+" posee:\n-Un Periodo Orbital de "+PerOrb+" Años.\n-Un Periodo de Rotacion de "+PerRot+" Dias.");
    }
    public static void main(String args[]){
        Planeta p1 = new Planeta("Venus", 1.6156, 243.01);
        Planeta p2 = new Planeta("Marte", 1.88, 37 );
        p1.MostrarPantalla();
        p2.MostrarPantalla();
    }
}
