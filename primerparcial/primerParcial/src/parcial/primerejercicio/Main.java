package parcial.primerejercicio;

public class Main {
    public static void main(String[] args) {

        // clase Punto3D


        Punto3D primerObjeto = new Punto3D(9, 5, 2);
        Punto3D segundoObjeto = new Punto3D(2, 5, 9);
        Punto3D tercerObjeto = new Punto3D(4);

        System.out.println(primerObjeto);
        System.out.println(segundoObjeto);
        System.out.println(tercerObjeto);

        System.out.println(segundoObjeto.distanciaAlOrigen());
        System.out.println(segundoObjeto.distanciaDesdeOtroPunto(0, 0, 0));
        System.out.println(segundoObjeto.distanciaDesdeOtroPunto(primerObjeto));


        //clase Vector3D

        Vector3D primerVector = new Vector3D(primerObjeto, segundoObjeto);
        Vector3D segundoVector = new Vector3D(tercerObjeto);

        System.out.println(primerVector);
        System.out.println(segundoVector);

        System.out.println(primerVector.magnitudVector());
        System.out.println(segundoVector.magnitudVector());

        primerVector.mostrarComponentes();
        segundoVector.mostrarComponentes();


    }
}
