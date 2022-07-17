package EjerciciosTema3;

public class Coche {
    int puertas;

    public void sumarpuertas(int x){
        puertas += x;
    }
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.sumarpuertas(1);
        System.out.println(miCoche.puertas);
    }
}
