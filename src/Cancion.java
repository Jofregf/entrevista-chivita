import java.util.*;

public class Cancion {

    public static void main(String[] args) {

        // Crea un array de animales
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

        Map<String, String> llamarA = new HashMap<>();

        System.out.println("Sal de ahí chivita chivita, sal de ahí de ese lugar");
        String actualmente = "la chiva";

        int N = 3; // Cambiar a la cantidad de iteraciones deseadas

        for (int iteracion = 1; iteracion <= N; iteracion++) {
            String prox = obtenerElementoRandom(animales);
            llamarA.put(actualmente, prox);

            System.out.println("Hay que llamar a " + prox + " para que saque a " + actualmente);

            String inspeccionar = "la chiva";
            List<String> remover = new ArrayList<>();

            while (llamarA.containsKey(inspeccionar)) {
                remover.add(llamarA.get(inspeccionar) + " no quiere sacar a " + inspeccionar);
                inspeccionar = llamarA.get(inspeccionar);
            }

            for (int i = remover.size() - 1; i >= 0; i--) {
                System.out.println(remover.get(i));
            }

            System.out.println("La chiva no quiere salir de ahí. Sal de ahí chivita chivita, sal de ahí de ese lugar");
            actualmente = prox;
        }
    }

    private static String obtenerElementoRandom(String[] array) {
        Random rand = new Random();
        return array[rand.nextInt(array.length)];
    }
}
