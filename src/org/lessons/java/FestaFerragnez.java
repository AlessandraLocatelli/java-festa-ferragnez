package org.lessons.java;

//creare e inizializzare array contenente nomi invitati
//chiedere il nome all'utente
//verificare che il nome sia presente nella lista con metodo .equals()
//comunicare all'utente se può entrare o meno
//usare il ciclo for e poi ciclo while come bonus (o viceversa)


import java.util.Scanner;

public class FestaFerragnez {


    public static void main(String[] args) {

        //creo una array stringa con all'interno i nomi degli invitati
        String[] invitatiFesta = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
                "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        // chiedo il nome all'utente tramite input
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci qui il tuo nome: ");
        String name = sc.nextLine();

        //verifico se il nome dell'utente è presente nella lista
        //e comunico se può entrare o meno


        boolean found = false;


        //ciclo for


        /*for(int i = 0; i < invitatiFesta.length; i++) {


            if (invitatiFesta[i].equals(name)) {

                found = true;
                 break;
            }

        }*/



        //ciclo while

        int i = 0;

        while (!found && i < invitatiFesta.length) {

            if (invitatiFesta[i].equals(name)) {
                found = true;
                break;
            }

            i++;


        }

        if (found)
        {
            System.out.println("Il tuo nome è presente nella lista. Puoi entrare!");
        } else
        {
            System.out.println("Mi dispiace, il tuo nome non è presente nella lista");
        }




        //chiudo lo scanner
        sc.close();


    }


}
