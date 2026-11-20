package lab6p2_christopherflores;

public class Entrenador extends Persona{
    int AnosExp;
    String Form;

    public Entrenador(int AnosExp, String Form, String Nombre, int Edad, double SalBas) {
        super(Nombre, Edad, SalBas);
        this.AnosExp = AnosExp;
        this.Form = Form;
    }
    
    public void CalcSal(){
        for (int i = 0; i < AnosExp; i++) {
            SalBas+=1000;
        }
    }
    
    public void MostFich(){
        
    }
}
