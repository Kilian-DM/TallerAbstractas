package tallerabstractas;

//@author kilian diaz
public class TallerAbstractas {

    public static void main(String[] args) {
        persona pe = new persona();
        pe.cargar();

        empleado em = new empleado();
        em.cargarsueldo();

        directiva di = new directiva();
        di.cargarcargo();

        System.out.println("los datos impresos son:\n ");
        pe.imprimir();
        em.imprimirsueldo();
        di.imprimircargo();
    }

}
