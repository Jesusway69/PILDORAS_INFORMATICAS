package poo;


public class Furgoneta extends Coche {

private int capacidadCarga;
private int plazasExtra;

public Furgoneta(int plazasExtra,int capacidadCarga){
    super(); //Llamar al constructor de la clase padre Coche
    this.capacidadCarga=capacidadCarga;
    this.plazasExtra=plazasExtra;
}
public String dimeDatosFurgoneta(){
    return "La capacidad de carga es de " + capacidadCarga + "m3"+ " y las plazas son " + (plazasExtra + plazas);
}
}
