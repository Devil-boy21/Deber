package atributos;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        //    Scanner reader = new Scanner(System.in);
        //    persona[]lista=new persona[2];
        //   System.out.println("ingrese un nombre:");
        //   persona p1=new persona();
        //   p1.setNombre(reader.next());
        //   System.out.println("ingrese una edad:");
        //  p1.setEdad(  reader.nextDouble());
        //  lista[0]=p1;

        //  System.out.println("ingrese otro nombre:");
        //  persona p2= new persona();
        //  p2.setNombre(reader.next());
        // System.out.println("ingrese una edad:");
        //  p2.setEdad(  reader.nextDouble());
        //  lista[1]=p2;
        // ListaPersona lpersona=new ListaPersona();
        // double resultado=lpersona.promedioEdad(lista);
        // System.out.println("la edad maxima es :"+resultado);
        persona p1 = new persona();
        p1.setNombre("Yordi");
        p1.setEdad(27);

        persona p2 = new persona();
        p2.setNombre("Ana");
        p2.setEdad(21);

        ListaPersona lista = new ListaPersona();

        ArrayList<persona> nombre = new ArrayList<persona>();
        nombre.add(p1);
        nombre.add(p2);
        double maxP = lista.edadMax(nombre);
//        System.out.println(""+nombre.get(0).toString());
        System.out.println("" + lista.edadMaxPersona(nombre));
        System.out.println("" + lista.menorEdad(nombre));

    }

}
