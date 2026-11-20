/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_christopherflores;

/**
 *
 * @author uvato
 */
public class Jugador extends Persona {

    int Dorsal;
    String pos;
    int Goles;
    int Asist;
    int TarjAm;
    int TarjRoj;
    int PartGols;
    boolean Suspen;

    public Jugador(int Dorsal, String pos, int Goles, int Asist, int TrajAm, int TrajRoj, boolean Suspen, String Nombre, int Edad, double SalBas) {
        super(Nombre, Edad, SalBas);
        this.Dorsal = Dorsal;
        this.pos = pos;
        this.Goles = Goles;
        this.Asist = Asist;
        this.TarjAm = TrajAm;
        this.TarjRoj = TrajRoj;
        this.Suspen = Suspen;
        this.PartGols = PartGols;
    }

    public void AnGol() {
        if (Suspen) {
            Goles += 0;
        } else {
            Goles += 1;
        }
    }

    public void MarcAsis() {
        if (Suspen) {
            Asist += 0;
        } else {
            Asist += 1;
        }
    }

    public void Amonestar() {
        TarjAm += 1;
        if (TarjAm == 3) {
            Suspen = true;
            TarjAm = 0;
        }
    }

    public void Expulsar() {
        TarjRoj += 1;
        Suspen = true;
    }

    public void CumpSans() {
        Suspen = false;
    }

    public void PartGol() {
        PartGols = Goles + Asist;
    }

    public void CalcSal() {
        int cant = 0;
        if (Goles > 0) {
            for (int i = 0; i < Goles; i++) {
                cant += 500;
            }
            SalBas += cant;
            cant = 0;
        }
        
        if (Asist > 0) {
            for (int i = 0; i < Asist; i++) {
                cant += 250;
            }
            SalBas += cant;
            cant = 0;
        }

        if (TarjRoj > 0) {
            for (int i = 0; i < TarjRoj; i++) {
                cant += 1000;
            }
            SalBas -= cant;
        }
    }

    @Override
    public void MostFich(){
        
    }
    
}
