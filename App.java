import java.util.Scanner;
public class App{
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        int puntaje = 0;
        String ans = "";
        String resultado = "";

        System.out.println("¿Desea jugar? (si/no): ");  
        String respuesta = leer.nextLine();

        while(respuesta.equalsIgnoreCase("si")){
            // primera ronda----------------------------------------------------------------------------------------
            System.out.println("Primera Ronda - Categoria baja");
            System.out.println("Su Puntaje actual es = " + puntaje);  
            int numeroPregunta =  (int)(Math.random()*5+1);
            Ronda1 primeraRonda = new Ronda1(puntaje);
            switch (numeroPregunta) {
                case 1:
                    System.out.println("¿Pregunta 1?");
                    System.out.println("a.respuesta 1");
                    System.out.println("b.respuesta 2");
                    System.out.println("c.respuesta 3");
                    System.out.println("d.respuesta 4");
                    System.out.println("Resoponda con una unica respuesta entre 'a', 'b', 'c', 'd' o 'salir' si desea salir con el puntaje actual " + puntaje);
                    ans = leer.nextLine();
                    primeraRonda.setRespuesta(ans);
                    resultado = primeraRonda.question1();
                    puntaje = primeraRonda.getPuntaje();
                    break;
            
                case 2:
                    System.out.println("¿Pregunta 2?");
                    System.out.println("a.respuesta 1");
                    System.out.println("b.respuesta 2");
                    System.out.println("c.respuesta 3");
                    System.out.println("d.respuesta 4");
                    System.out.println("Resoponda con una unica respuesta entre 'a', 'b', 'c', 'd' o 'salir' si desea salir con el puntaje actual " + puntaje);
                    ans = leer.nextLine();
                    primeraRonda.setRespuesta(ans);
                    resultado = primeraRonda.question2();
                    puntaje = primeraRonda.getPuntaje();
                    break;
            
                case 3:
                    System.out.println("¿Pregunta 3?");
                    System.out.println("a.respuesta 1");
                    System.out.println("b.respuesta 2");
                    System.out.println("c.respuesta 3");
                    System.out.println("d.respuesta 4");
                    System.out.println("Resoponda con una unica respuesta entre 'a', 'b', 'c', 'd' o 'salir' si desea salir con el puntaje actual " + puntaje);
                    ans = leer.nextLine();
                    primeraRonda.setRespuesta(ans);
                    resultado = primeraRonda.question3();
                    puntaje = primeraRonda.getPuntaje();
                    break;
            
                case 4:
                    System.out.println("¿Pregunta 4?");
                    System.out.println("a.respuesta 1");
                    System.out.println("b.respuesta 2");
                    System.out.println("c.respuesta 3");
                    System.out.println("d.respuesta 4");
                    System.out.println("Resoponda con una unica respuesta entre 'a', 'b', 'c', 'd' o 'salir' si desea salir con el puntaje actual " + puntaje);
                    ans = leer.nextLine();
                    primeraRonda.setRespuesta(ans);
                    resultado = primeraRonda.question4();
                    puntaje = primeraRonda.getPuntaje();
                    break;
            
                default:
                    System.out.println("¿Pregunta 5?");
                    System.out.println("a.respuesta 1");
                    System.out.println("b.respuesta 2");
                    System.out.println("c.respuesta 3");
                    System.out.println("d.respuesta 4");
                    System.out.println("Resoponda con una unica respuesta entre 'a', 'b', 'c', 'd' o 'salir' si desea salir con el puntaje actual " + puntaje);
                    ans = leer.nextLine();
                    primeraRonda.setRespuesta(ans);
                    resultado = primeraRonda.question5();
                    puntaje = primeraRonda.getPuntaje();
                    break;
            }

            System.out.println(resultado);      
            if (primeraRonda.getResultado().equalsIgnoreCase("correcto")){
                System.out.println("¿Desea continuar?(si/no):");
                respuesta = leer.nextLine();
            }else{
                respuesta = "no";
            }
            
            // Sgunda ronda
            System.out.println("Segunda Ronda - Categoria basica");
            System.out.println("Su Puntaje actual es = " + puntaje);  
            numeroPregunta =  (int)(Math.random()*5+1);
            Ronda2 segundaRonda = new Ronda2(puntaje);
            switch (numeroPregunta) {
                case 1:
                    System.out.println("¿Pregunta 1?");
                    System.out.println("a.respuesta 1");
                    System.out.println("b.respuesta 2");
                    System.out.println("c.respuesta 3");
                    System.out.println("d.respuesta 4");
                    System.out.println("Resoponda con una unica respuesta entre 'a', 'b', 'c', 'd' o 'salir' si desea salir con el puntaje actual " + puntaje);
                    ans = leer.nextLine();
                    segundaRonda.setRespuesta(ans);
                    resultado = segundaRonda.question1();
                    puntaje = segundaRonda.getPuntaje();
                    break;
            
                case 2:
                    System.out.println("¿Pregunta 2?");
                    System.out.println("a.respuesta 1");
                    System.out.println("b.respuesta 2");
                    System.out.println("c.respuesta 3");
                    System.out.println("d.respuesta 4");
                    System.out.println("Resoponda con una unica respuesta entre 'a', 'b', 'c', 'd' o 'salir' si desea salir con el puntaje actual " + puntaje);
                    ans = leer.nextLine();
                    segundaRonda.setRespuesta(ans);
                    resultado = segundaRonda.question2();
                    puntaje = segundaRonda.getPuntaje();
                    break;
            
                case 3:
                    System.out.println("¿Pregunta 3?");
                    System.out.println("a.respuesta 1");
                    System.out.println("b.respuesta 2");
                    System.out.println("c.respuesta 3");
                    System.out.println("d.respuesta 4");
                    System.out.println("Resoponda con una unica respuesta entre 'a', 'b', 'c', 'd' o 'salir' si desea salir con el puntaje actual " + puntaje);
                    ans = leer.nextLine();
                    segundaRonda.setRespuesta(ans);
                    resultado = segundaRonda.question3();
                    puntaje = segundaRonda.getPuntaje();
                    break;
            
                case 4:
                    System.out.println("¿Pregunta 4?");
                    System.out.println("a.respuesta 1");
                    System.out.println("b.respuesta 2");
                    System.out.println("c.respuesta 3");
                    System.out.println("d.respuesta 4");
                    System.out.println("Resoponda con una unica respuesta entre 'a', 'b', 'c', 'd' o 'salir' si desea salir con el puntaje actual " + puntaje);
                    ans = leer.nextLine();
                    segundaRonda.setRespuesta(ans);
                    resultado = segundaRonda.question4();
                    puntaje = segundaRonda.getPuntaje();
                    break;
            
                default:
                    System.out.println("¿Pregunta 5?");
                    System.out.println("a.respuesta 1");
                    System.out.println("b.respuesta 2");
                    System.out.println("c.respuesta 3");
                    System.out.println("d.respuesta 4");
                    System.out.println("Resoponda con una unica respuesta entre 'a', 'b', 'c', 'd' o 'salir' si desea salir con el puntaje actual " + puntaje);
                    ans = leer.nextLine();
                    segundaRonda.setRespuesta(ans);
                    resultado = segundaRonda.question5();
                    puntaje = segundaRonda.getPuntaje();
                    break;
            }
            System.out.println(resultado);      
            if (segundaRonda.getResultado().equalsIgnoreCase("correcto")){
                System.out.println("Fue la ultima ronda");
                respuesta = "final";
            }else{
                respuesta = "no";
            }
            leer.close();
        }
        System.out.println("Gracias por jugar su puntaje final es = " + puntaje);
    }
}


