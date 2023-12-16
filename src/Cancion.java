import java.util.*;

public class Cancion {

    public static void main(String[] args) {

        int tiempoPorLinea = 1; // Supuesto tiempo por línea en milisegundos

        long tiempoTotal = 0;

        String[] animales = {"el lobo", "el tigre", "el delfín", "el elefante", "el oso", "el águila", "la nutria",
                "el avestruz", "la orca", "el leopardo", "el buitre", "el ocelote", "el cocodrilo", "el erizo",
                "el gorila", "el armadillo", "el alce", "el avispón", "la abeja", "el bisonte", "el canguro", "el caimán",
                "el camaleón", "la cebra", "el chimpancé", "el ciervo", "el coyote", "el dingo", "el flamenco", "la foca",
                "la gacela", "la gaviota", "el gecko", "el guepardo", "el halcón", "el hipopótamo", "la iguana", "el jaguar",
                "la jirafa", "el koala", "la lechuza", "el lemur", "el león", "el lince", "el mono", "el murciélago",
                "la nutria", "el ñandú", "la mariposa", "el orangután", "el ornitorrinco", "la boa", "el oso", "oso polar",
                "el panda", "la pantera", "el pelícano", "el pingüino", "la pitón", "el pulpo", "el puma", "el rinoceronte",
                "la salamandra", "el sapo", "la serpiente", "el tigre", "el tapir", "el tejón", "el tiburón", "el tilacino",
                "la tortuga", "el hornero", "el uro", "el urogallo", "el urutú", "la urraca", "la vaca", "el venado",
                "el visón", "la víbora", "el cardenal", "el zorro", "el cangrejo", "el canario", "el camello", "el colibrí",
                "la comadreja", "el correcaminos", "el cuervo", "el colibrí", "la culebra", "el hamster", "el gato", "el toro",
                "la araña", "la libelula", "la cata", "el tatú", "el tucán", "el kiwi"};


        for (String animal : animales) {
            tiempoTotal += tiempoPorLinea;
        }

        Map<String, String> llamarA = new HashMap<>();
        tiempoTotal += tiempoPorLinea;

        System.out.println("Sal de ahí chivita chivita, sal de ahí de ese lugar");
        tiempoTotal += tiempoPorLinea;

        String actualmente = "la chiva";
        tiempoTotal += tiempoPorLinea;

        List<String> remover = new ArrayList<>();
        tiempoTotal += tiempoPorLinea;

        String inspeccionar = "la chiva";
        tiempoTotal += tiempoPorLinea;

        int N = 1;
        tiempoTotal += tiempoPorLinea;

        for (int i = 0; i < N; i++) {
            String prox = obtenerElementoRandom(animales);
            tiempoTotal += tiempoPorLinea;

            llamarA.put(actualmente, prox);
            tiempoTotal += tiempoPorLinea;

            System.out.println("Hay que llamar a " + prox + " para que saque a " + actualmente);
            tiempoTotal += tiempoPorLinea;

            actualmente = prox;
            tiempoTotal += tiempoPorLinea;
            do {
                tiempoTotal += tiempoPorLinea;
                remover.add(llamarA.get(inspeccionar) + " no quiere sacar a " + inspeccionar);
                tiempoTotal += tiempoPorLinea;
                inspeccionar = llamarA.get(inspeccionar);
                tiempoTotal += tiempoPorLinea;
            } while (!llamarA.containsValue(inspeccionar));


            for (int j = remover.size()-1; j >= 0; j--) {
                System.out.println(remover.get(j));
                tiempoTotal += tiempoPorLinea;
            }

            System.out.println("La chiva no quiere salir de ahí. Sal de ahí chivita chivita. Sal de ahí de ese lugar");
            tiempoTotal += tiempoPorLinea;
        }
        System.out.println("Tiempo de ejecución estimado para N = " + N + ": " + tiempoTotal + " milisegundos");
    }
    private static String obtenerElementoRandom(String[] array) {
        Random rand = new Random();
        return array[rand.nextInt(array.length)];
    }
}
