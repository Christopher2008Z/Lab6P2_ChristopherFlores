package lab6p2_christopherflores;

public class Portero extends Jugador{
    int Ataj;
    int GolRec;

    public Portero(int Ataj, int GolRec, int Dorsal, String pos, int Goles, int Asist, int TrajAm, int TrajRoj, boolean Suspen, String Nombre, int Edad, double SalBas) {
        super(Dorsal, pos, Goles, Asist, TrajAm, TrajRoj, Suspen, Nombre, Edad, SalBas);
        this.Ataj = Ataj;
        this.GolRec = GolRec;
    }
    
    
}
