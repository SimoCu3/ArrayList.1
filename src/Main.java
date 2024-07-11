/*
CONSEGNA:
Creare una classe Student che accenti nel costruttore il parametro name (String) e age (Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con n elementi e stamparlo in console.
Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console
*/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Simone",21);
        Student student2 = new Student("Mario",22);
        Student student3 = new Student("Giovanni",23);

        List<Student> schoolClass1 = new ArrayList<>();
        schoolClass1.add(student1);
        schoolClass1.add(student2);
        schoolClass1.add(student3);

        System.out.println("Classe: \n" + schoolClass1);

        Student student4 = new Student("Stefano",20);
        Student student5 = new Student("Alessandro",19);
        Student student6 = new Student("Marco",24);
        Student student7 = new Student("Luca",25);
        schoolClass1.add(student4);
        schoolClass1.add(student5);
        schoolClass1.add(student6);
        schoolClass1.add(student7);

        System.out.println("Classe aggiornata: \n" + schoolClass1);

    }
}

/*
CORREZIONE:

*/