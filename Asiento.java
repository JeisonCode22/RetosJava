//EL CALIFICADOR GENERARÁ ERROR SI USTED NO IMPLEMENTA TODOS LOS MÉTODOS ESPECIFICADOS EN EL ENUNCIADO
public abstract class Asiento {

    //Inserte acá los atributos
    
    private char tipo;
    private String ID;
    private boolean pantallaEncendida= false;
    private double inclinacionSilla=90;
    private boolean luzLecturaEncendida= false;
    private boolean luzAsistenciaEncendida= false;
    private boolean aireAcondicionadoEncendido= false;
    
    //Inserte acá el método constructor
    
    public Asiento(String ID, char tipo){
        this.ID=ID;
        this.tipo=tipo;
    }
    
    //Inserte acá los SETTERS Y GETTERS

    public char getTipo(){
        return tipo;
    }
    public void setTipo(char tipo){
        this.tipo=tipo;
    }
    
    public String getID(){
        return ID;
    }
    public void setID (String ID){
        this.ID=ID;
    }
    
    public double getInclinacionSilla(){
        return inclinacionSilla;
    }
    public void setInclinacionSilla(double inclinacionSilla){
        this.inclinacionSilla=inclinacionSilla;
    }
    
    public boolean isPantallaEncendida(){
        return pantallaEncendida;
    }
    public void setPantallaEncendida(boolean pantallaEncendida){
        this.pantallaEncendida=pantallaEncendida;
    }
    
    public boolean isLuzLecturaEncendida(){
        return luzLecturaEncendida;
    }
    public void setLuzLecturaEncendida(boolean luzLecturaEncendida){
        this.luzLecturaEncendida=luzLecturaEncendida;
    }
    
    public boolean isLuzAsistenciaEncendida(){
        return luzAsistenciaEncendida;
    }
    public void setLuzAsistenciaEncendida(boolean luzAsistenciaEncendida){
        this.luzAsistenciaEncendida=luzAsistenciaEncendida;
    }
    
    public boolean isAireAcondicionadoEncendido(){
        return aireAcondicionadoEncendido;
    }
    public void setAireAcondicionadoEncendido(boolean aireAcondicionadoEncendido){
        this.aireAcondicionadoEncendido=aireAcondicionadoEncendido;
    }

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)

    public void gestionarAireAcondicionado(){
        if (aireAcondicionadoEncendido == true) {
            aireAcondicionadoEncendido=false;
        }
        else{
            aireAcondicionadoEncendido=true;
        }
    }
    
    public void gestionarPantalla(){
        if (pantallaEncendida == true) {
            pantallaEncendida=false;
        }
        else{
            pantallaEncendida=true;
        }
    }
    
    public void gestionarLuzLectura(){
        if (luzLecturaEncendida == true) {
            luzLecturaEncendida=false;
        }
        else{
            luzLecturaEncendida=true;
        }
    }
    
    public void gestionarLuzAsistencia(){
        if (luzAsistenciaEncendida == true) {
            luzAsistenciaEncendida=false;
        }
        else{
            luzAsistenciaEncendida=true;
        }
    }
    
    public void aumentarInclinacion(double d){
        if (inclinacionSilla+d <= 135) {
            inclinacionSilla += d;
        }
        else {
            inclinacionSilla=135;
        }
    }
    
    public void disminuirInclinacion(double d){
        if (inclinacionSilla-d >= 0) {
            inclinacionSilla -= d;
        }
        else{
            inclinacionSilla=0;
        }
    }
    
    public abstract String imprimirMenuPantalla();
    
}