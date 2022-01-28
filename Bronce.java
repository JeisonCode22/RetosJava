//EL CALIFICADOR GENERARÁ ERROR SI USTED NO IMPLEMENTA TODOS LOS MÉTODOS ESPECIFICADOS EN EL ENUNCIADO
public class Bronce extends Asiento{
                // ^ hereda de Asiento

    //Inserte acá el método constructor

    public Bronce(String ID, char tipo){
       super(ID, tipo);
    }

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public String imprimirMenuPantalla(){
        return "BRONCE";
    } 
}