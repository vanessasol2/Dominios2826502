import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ListaEstudiante {
    public static void main(String[] args) {

        Scanner into = new Scanner(System.in);
        List<Estudiante>listaEstudiantes = new ArrayList<>();

        String flag = "y";

        do {
            System.out.println("Ingrese el nombre del estudiante  ");
            String nombre = into.nextLine();

            System.out.println("Ingrse la identificacion del estudiante ");
            int identificacion = into.nextInt();

            System.out.println("Ingrese la nota del estudiante ");
            double nota = into.nextInt();

            //se crea el objecto estudiante 
            Estudiante estudianteNew = new Estudiante(nombre, identificacion, nota);
            listaEstudiantes.add(estudianteNew);

            System.out.println("ingrse otro estudiante y/n ");
            flag =into.next();
            into.nextLine();

        } while (flag.equals("y"));

        System.out.println("Lista de los estudiantes registrados: ");
        for(Estudiante estudiante : listaEstudiantes){
            System.out.println("Nombre Estudiante: " + estudiante.nombre);
            System.out.println(" Numero Identificacion: " + estudiante.identificacion);
            System.out.println(" Nota del estudiante :  " + estudiante.nota);
        }

    }

}
