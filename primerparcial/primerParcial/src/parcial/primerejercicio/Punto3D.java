package parcial.primerejercicio;

public class Punto3D {

double x;
double y;
double z;

//constructor con 3 parametros

    public Punto3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

// constructor con 1 parametro

    public Punto3D(double w) {
        this.x = w;
        this.y = w;
        this.z = w;
    }

//constrcutor sin parametros (asigna 0 a cada atributo)


    public Punto3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
// metodo que calcula sin parametros la distancia al origen

    public double distanciaAlOrigen(){
        return Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2) + Math.pow(this.z,2));
    }
//metodo que calcula con los 3 parametros

    public double distanciaDesdeOtroPunto(double x, double y, double z){
        return Math.sqrt(Math.pow(this.x-x,2) + Math.pow(this.y-y,2) + Math.pow(this.z-z,2));
    }

// metodo que recibe un objeto Punto3D

    public double distanciaDesdeOtroPunto (Punto3D otroPunto){
        return Math.sqrt(Math.pow(this.x - otroPunto.x, 2) + Math.pow(this.y - otroPunto.y, 2) +
                Math.pow(this.z - otroPunto.z, 2));
    }

    //to string que solo retorna X e Y

    @Override
    public String toString() {
        return "Punto3D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


}
