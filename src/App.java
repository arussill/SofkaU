package src;
import java.util.Scanner;

public class App{
    public static void main(String[] args) throws Exception {
        // Atributos
        Scanner leer = new Scanner(System.in);
        int puntaje = 0;
        String ans = "";
        String resultado = "";
        int rondas[] = {1,2,3,4,5};
        String pregunta ;
        String opciones [];
       
        
        // Inicio de juego
        System.out.println("¿Desea jugar? (si/no): ");  
        String respuesta = leer.nextLine();

        // Rondas
        for (int i=0; i<rondas.length; i++){

            //Ronda 1 - Categoria baja
            if (rondas[i]==1 && respuesta.equalsIgnoreCase("si")){
                System.out.println("Ronda "+(i+1));
                System.out.println("Su Puntaje actual es = " + puntaje);      
                // instancia de la primera categoria y obtencion de la pregunta y opciones
                Categoria1 primeraRonda = new Categoria1(puntaje);
                pregunta = primeraRonda.getPregunta();
                System.out.println(pregunta);
                opciones = primeraRonda.getOpciones();
                // Muestra las opciones
                for (String opcion : opciones) {
                    System.out.println(opcion);
                }
                System.out.println("Resoponda con una unica respuesta entre 'a', 'b', 'c', 'd' o 'salir' si desea salir con el puntaje actual " + puntaje);
                // Respuesta dada por el concursante
                ans = leer.nextLine();
                primeraRonda.setRespuesta(ans);
                resultado = primeraRonda.getRespuesta();
                puntaje = primeraRonda.getPuntaje();
                System.out.println(resultado); 
                // Continuación con el juego o salir
                if (primeraRonda.getResultado().equalsIgnoreCase("correcto")){
                    System.out.println("¿Desea continuar?(si/no):");
                    respuesta = leer.nextLine();
                }else{
                    respuesta = "no";
                }
            
                //Ronda 2 - Categoria basica
            }else if (rondas[i]==2 && respuesta.equalsIgnoreCase("si")){
                System.out.println("Ronda "+(i+1));
                System.out.println("Su Puntaje actual es = " + puntaje); 
                // instancia de la primera categoria y obtencion de la pregunta y opciones
                Categoria2 segundaRonda = new Categoria2(puntaje);
                pregunta = segundaRonda.getPregunta();
                System.out.println(pregunta);
                opciones = segundaRonda.getOpciones();
                // muestra las opciones
                for (String opcion : opciones) {
                    System.out.println(opcion);
                }
                System.out.println("Resoponda con una unica respuesta entre 'a', 'b', 'c', 'd' o 'salir' si desea salir con el puntaje actual " + puntaje);
                // Respuesta dada por el concursante
                ans = leer.nextLine();
                segundaRonda.setRespuesta(ans);
                resultado = segundaRonda.getRespuesta();
                puntaje = segundaRonda.getPuntaje();
                System.out.println(resultado);     
                // Continuaón cone el juego
                if (segundaRonda.getResultado().equalsIgnoreCase("correcto")){
                    System.out.println("¿Desea continuar?(si/no):");
                    respuesta = leer.nextLine();
                }else{
                    respuesta = "no";
                }

                //Ronda3 - Categoria media
            }else if (rondas[i]==3 && respuesta.equalsIgnoreCase("si")){
                System.out.println("Ronda "+(i+1));
                System.out.println("Su Puntaje actual es = " + puntaje); 
                // instancia de la primera categoria y obtencion de la pregunta y opciones
                Categoria3 terceraRonda = new Categoria3(puntaje);
                pregunta = terceraRonda.getPregunta();
                System.out.println(pregunta);
                opciones = terceraRonda.getOpciones();
                // opciones
                for (String opcion : opciones) {
                    System.out.println(opcion);
                }
                System.out.println("Resoponda con una unica respuesta entre 'a', 'b', 'c', 'd' o 'salir' si desea salir con el puntaje actual " + puntaje);
                // Respuesta dada por el concursante
                ans = leer.nextLine();
                terceraRonda.setRespuesta(ans);
                resultado = terceraRonda.getRespuesta();
                puntaje = terceraRonda.getPuntaje();
                System.out.println(resultado);     
                // Continuaón del juego
                if (terceraRonda.getResultado().equalsIgnoreCase("correcto")){
                    System.out.println("¿Desea continuar?(si/no):");
                    respuesta = leer.nextLine();
                }else{
                    respuesta = "no";
                }

                //Ronda 4 - Categoria alta
            }else if (rondas[i]==4 && respuesta.equalsIgnoreCase("si")){
                System.out.println("Ronda "+(i+1));
                System.out.println("Su Puntaje actual es = " + puntaje); 
                // instancia de la primera categoria y obtencion de la pregunta y opciones
                Categoria4 cuartaRonda = new Categoria4(puntaje);
                pregunta = cuartaRonda.getPregunta();
                System.out.println(pregunta);
                opciones = cuartaRonda.getOpciones();
                //muestra las opciones
                for (String opcion : opciones) {
                    System.out.println(opcion);
                }
                System.out.println("Resoponda con una unica respuesta entre 'a', 'b', 'c', 'd' o 'salir' si desea salir con el puntaje actual " + puntaje);
                // Respuesta dada por el concursante
                ans = leer.nextLine();
                cuartaRonda.setRespuesta(ans);
                resultado = cuartaRonda.getRespuesta();
                puntaje = cuartaRonda.getPuntaje();
                System.out.println(resultado);     
                //Continuacion del juego
                if (cuartaRonda.getResultado().equalsIgnoreCase("correcto")){
                    System.out.println("¿Desea continuar?(si/no):");
                    respuesta = leer.nextLine();
                }else{
                    respuesta = "no";
                }

                //Ronda 5 - Categoria superior
            }else if (rondas[i]==5 && respuesta.equalsIgnoreCase("si")){
                System.out.println("Ronda "+(i+1));
                System.out.println("Su Puntaje actual es = " + puntaje); 
                // instancia de la primera categoria y obtencion de la pregunta y opciones
                Categoria5 quintaRonda = new Categoria5(puntaje);
                pregunta = quintaRonda.getPregunta();
                System.out.println(pregunta);
                opciones = quintaRonda.getOpciones();
                // muestra las opciones
                for (String opcion : opciones) {
                    System.out.println(opcion);
                }
                System.out.println("Resoponda con una unica respuesta entre 'a', 'b', 'c', 'd' o 'salir' si desea salir con el puntaje actual " + puntaje);
                // Respuesta dada por el concursante
                ans = leer.nextLine();
                quintaRonda.setRespuesta(ans);
                resultado = quintaRonda.getRespuesta();
                puntaje = quintaRonda.getPuntaje();
                System.out.println(resultado);     
                // Finalización del juego
                if (quintaRonda.getResultado().equalsIgnoreCase("correcto")){
                    System.out.println("Fue la ultima ronda");
                    respuesta = "final";
                }else{
                    respuesta = "no";
                }
            }
        }
        leer.close();
        // Entrega de resultados
        System.out.println("Gracias por jugar su puntaje final es = " + puntaje);
        // Guardado de los resultados obtenidos de los ganadores del juego en base de datos concurso.db       
        Jugador participante = new Jugador(puntaje);
        
    }
}


