public class Autobus{
    //Inserte acá los atributos
    
    String nombreConductor;
    int nPasajeros;
    double cantidadDinero;
    int nMaximoPasajeros;
    double localizacionX;
    double localizacionY;
    boolean puertaAbierta;
    boolean aireAcondicionadoActivado;
    boolean motorEncendido;
    boolean wifiEncendido;
    boolean enMarcha;
    
    //Inserte acá el método constructor
    
    public Autobus(String nombreConductor, int nMaximoPasajeros, boolean puertaAbierta) {
        this.nombreConductor = nombreConductor;
        this.nMaximoPasajeros = nMaximoPasajeros;
        this.puertaAbierta = puertaAbierta;
    }
    
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    
    public void recogerPasajero(int estrato) {
        switch (estrato) {
            case 0:
                if (puertaAbierta == true && enMarcha == false) {
                    if (nPasajeros < nMaximoPasajeros) {
                        System.out.println(nPasajeros += 1);
                        System.out.println(cantidadDinero += 1500);
                    }
                }
                break;
            case 1:
                if (puertaAbierta == true && enMarcha == false) {
                    if (nPasajeros < nMaximoPasajeros) {
                        System.out.println(nPasajeros += 1);
                        System.out.println(cantidadDinero += 1500);
                    }
                }
                break;
            case 2:
                if (puertaAbierta == true && enMarcha == false) {
                    if (nPasajeros < nMaximoPasajeros) {
                        System.out.println(nPasajeros += 1);
                        System.out.println(cantidadDinero += 1500);
                    }
                }
                break;
            case 3:
                if (puertaAbierta == true && enMarcha == false) {
                    if (nPasajeros < nMaximoPasajeros) {
                        System.out.println(nPasajeros += 1);
                        System.out.println(cantidadDinero += 2600);
                    }
                }
                break;
            case 4:
                if (puertaAbierta == true && enMarcha == false) {
                    if (nPasajeros < nMaximoPasajeros) {
                        System.out.println(nPasajeros += 1);
                        System.out.println(cantidadDinero += 2600);
                    }
                }
                break;
            case 5:
                if (puertaAbierta == true && enMarcha == false) {
                    if (nPasajeros < nMaximoPasajeros) {
                        System.out.println(nPasajeros += 1);
                        System.out.println(cantidadDinero += 3000);
                    }
                }
                break;
            case 6:
                if (puertaAbierta == true && enMarcha == false) {
                    if (nPasajeros < nMaximoPasajeros) {
                        System.out.println(nPasajeros += 1);
                        System.out.println(cantidadDinero += 3000);
                    }
                }
                break;
        }
    }

    public void dejarPasajero() {
        if (puertaAbierta == true && enMarcha == false) {
            nPasajeros--;
            System.out.println(nPasajeros);
        }
    }

    public double calcularDistanciaAcopio() {
        double Acopio;
        Acopio = Math.sqrt(Math.pow(this.localizacionX, 2) + Math.pow(this.localizacionY, 2));
        return Acopio;
    }

    public void gestionarPuerta() {
        if (enMarcha == false && puertaAbierta == false) {
            this.puertaAbierta = true;
        } else {
            this.puertaAbierta = false;
        }
    }

    public void gestionarAireAcondicionado() {
        if (motorEncendido == true) {
            aireAcondicionadoActivado = false;
        } else if(motorEncendido == false){
            aireAcondicionadoActivado = true;
        }
    }

    public void gestionarMotor() {
        if (motorEncendido == false) {
            motorEncendido = true;
        } else if (motorEncendido==true){
            motorEncendido = false;
        }
    }

    public void gestionarWifi() {
        if (motorEncendido == true) {
            wifiEncendido = false;
        } else if(motorEncendido == false){
            wifiEncendido = true;
        }
    }
    
    public void gestionarMarcha() {
        if (puertaAbierta == false && motorEncendido == true && enMarcha == false) {
            enMarcha = true;
        } else if (puertaAbierta == false && motorEncendido == true && enMarcha == true) {
            enMarcha = false;
        }
    }

    public void moverDerecha(double d) {
        if (puertaAbierta == false && motorEncendido == true && enMarcha == true) {
            System.out.println(this.localizacionX += d);
        }
    }

    public void moverIzquierda(double d) {
        if (puertaAbierta == false && motorEncendido == true && enMarcha == true) {
            System.out.println(this.localizacionX -= d);
        }
    }

    public void moverArriba(double d) {
        if (puertaAbierta == false && motorEncendido == true && enMarcha == true) {
            System.out.println(this.localizacionY += d);
        }
    }

    public void moverAbajo(double d) {
        if (puertaAbierta == false && motorEncendido == true && enMarcha == true) {
            System.out.println(this.localizacionY -= d);
        }
    }
    
    
    
    //Inserte acá los SETTERS Y GETTERS
    
    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public int getnMaximoPasajeros() {
        return nMaximoPasajeros;
    }

    public void setnMaximoPasajeros(int nMaximoPasajeros) {
        this.nMaximoPasajeros = nMaximoPasajeros;
    }

    public int getnPasajeros() {
        return nPasajeros;
    }

    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    public double getCantidadDinero() {
        return cantidadDinero;
    }

    public void setCantidadDinero(double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    public double getLocalizacionX() {
        return localizacionX;
    }

    public void setLocalizacionX(double localizacionX) {
        this.localizacionX = localizacionX;
    }

    public double getLocalizacionY() {
        return localizacionY;
    }

    public void setLocalizacionY(double localizacionY) {
        this.localizacionY = localizacionY;
    }

    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }

    public boolean isAireAcondicionadoActivado() {
        return aireAcondicionadoActivado;
    }

    public void setAireAcondicionadoActivado(boolean aireAcondicionadoActivado) {
        this.aireAcondicionadoActivado = aireAcondicionadoActivado;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }

    public boolean isWifiEncendido() {
        return wifiEncendido;
    }

    public void setWifiEncendido(boolean wifiEncendido) {
        this.wifiEncendido = wifiEncendido;
    }

    public boolean isEnMarcha() {
        return enMarcha;
    }

    public void setEnMarcha(boolean enMarcha) {
        this.enMarcha = enMarcha;
    }
    
    
    
}