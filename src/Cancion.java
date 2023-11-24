import java.util.*;

public class Cancion {

    public static void main(String[] args) {

        // Considerando que el problema dice que cada linea de codigo que se ejecute tardará 1ms, es por lo que creo un
        // contador para las líneas ejecutadas
        int lineasEjecutadas = 0;

        // Numero de veces que se ejecutará el ciclo
        int N = 3;
        lineasEjecutadas++;

        // Crea un array de 100 animales
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
        lineasEjecutadas++;

        // Creo un hashmap para guardar el animal actual y el proximo como un par clave/valor
        Map<String, String> llamarA = new HashMap<>();
        lineasEjecutadas++;

        // Se imprime la primera linea de la canción
        System.out.println("Sal de ahí chivita chivita, sal de ahí de ese lugar");

        // Asigno el primer animal de todos que será la chiva
        String actualmente = "la chiva";
        lineasEjecutadas += 2; // Incrementar el contador

        // empiezo la iteración del bucle para generar las estrofas de la canción.
        for (int iteracion = 1; iteracion <= N; iteracion++) {
            // Busco asigno aleatoriamente un animal a la variable
            String prox = obtenerElementoRandom(animales);
            // Asigno al hashmap el animal actual (en este caso la chiva):y el animal buscado aleatoriamente
            llamarA.put(actualmente, prox);
            lineasEjecutadas += 2;

            // Se imprime la estrofa con el animal que busco aleatoriamente y con el actual
            System.out.println("Hay que llamar a " + prox + " para que saque a " + actualmente);
            lineasEjecutadas++;

            // Creo otra variable a la que le asignaré tambien el valor "la chiva", al ingresar de nuevo en el ciclo
            // volverá tener el valor de "la chiva"
            String inspeccionar = "la chiva";
            // Se crea un array para generar una parte de la canción
            List<String> remover = new ArrayList<>();
            lineasEjecutadas += 2;

            // Un bucle while que se ejecutará mientras que la clave del hash tenga como clave el valor de inspeccionar,
            // para construir de que tal animal no quiere sacar al otro
            while (llamarA.containsKey(inspeccionar)) {
                remover.add(llamarA.get(inspeccionar) + " no quiere sacar a " + inspeccionar);
                // ahora el valor de inspeccionar tomará el valor del animal que se busco aleatoriamente
                inspeccionar = llamarA.get(inspeccionar);
                lineasEjecutadas += 2; // Incrementar el contador por cada línea en el bucle while
            }

            // Se lee el array de forma inversa para ir generando de que cada animal debe ir sacando al anterior
            // hasta llegar al de la chiva
            for (int i = remover.size() - 1; i >= 0; i--) {
                System.out.println(remover.get(i));
                lineasEjecutadas++; // Incrementar el contador por cada línea en el bucle for
            }

            // Se imprime la ultima linea de la canción antes de entrar al siguiente animal
            System.out.println("La chiva no quiere salir de ahí. Sal de ahí chivita chivita, sal de ahí de ese lugar");

            // ahora la variable actualmente tomará el valor del animal que se busco aleatoriamente.
            actualmente = prox;
            lineasEjecutadas += 2;
        }

        // Calcular el tiempo total basado en el número de líneas ejecutadas (1 ms por línea)
        long tiempoTotal = lineasEjecutadas;
        System.out.println("Tiempo total de ejecución: " + tiempoTotal + " milisegundos");
    }

    // cree una función para que cree un numero aleatorio entre el numero 0 y el tamaño del array que es 100,
    // lo hago para que se traiga un animal de forma aleatoria
    private static String obtenerElementoRandom(String[] array) {
        Random rand = new Random();
        return array[rand.nextInt(array.length)];
    }
}
