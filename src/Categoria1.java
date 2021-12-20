package src;
// Categoria 1
public class Categoria1 {
    // Atributos
    String pregunta;
    String respuesta;
    String resultado;
    String continuar;
    String r;
    int puntaje;
    int puntos;
    int numeroPregunta;
    String [] opciones;
    String a, b, c, d;

    // Constructor
    public Categoria1(int puntaje) {
        this.puntaje = puntaje;
        puntos = 100;
        numeroPregunta = (int)(Math.random()*5+1);
    }
    // se recibe la respuesta del concursante
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    // Preguntas de la categoria         
    public String getPregunta(){
        switch(numeroPregunta){
            case 1:
                pregunta = "¿Pregunta 1?";
                break;    
            case 2:
                pregunta = "¿Pregunta 2?";
                break;
            case 3:
                pregunta ="¿Pregunta 3?";                
                break;        
            case 4:
                pregunta ="¿Pregunta 4?";                
                break;        
            default:
                pregunta ="¿Pregunta 5?";                
                break;
        }
        return pregunta;
    }
    // opciones de las diferentes preguntas de la categoria
    public  String[] getOpciones(){
        switch(numeroPregunta){
            case 1:
                a = "a.Respuesta 1";
                b = "b.Respuesta 2";
                c = "c.Respuesta 3";
                d = "d.Respuesta 4";
                opciones = new String[]{a,b,c,d};
                break;    
            case 2:
                a = "a.Respuesta 1";
                b = "b.Respuesta 2";
                c = "c.Respuesta 3";
                d = "d.Respuesta 4";
                opciones = new String[]{a,b,c,d};
                break;
            case 3:
                a = "a.Respuesta 1";
                b = "b.Respuesta 2";
                c = "c.Respuesta 3";
                d = "d.Respuesta 4";
                opciones = new String[]{a,b,c,d};           
                break;        
            case 4:
                a = "a.Respuesta 1";
                b = "b.Respuesta 2";
                c = "c.Respuesta 3";
                d = "d.Respuesta 4";
                opciones = new String[]{a,b,c,d};
                break;        
            default:
                a = "a.Respuesta 1";
                b = "b.Respuesta 2";
                c = "c.Respuesta 3";
                d = "d.Respuesta 4";
                opciones = new String[]{a,b,c,d};
                break;
        }
        return opciones;
    }
    // respuesta a la pregunta 1
    public String question1 ( ){
        if (respuesta.equalsIgnoreCase("a")){
            puntaje = puntaje + puntos;
            resultado = "Respuesta Correcta su puntaje es = " + puntaje;
            r = "correcto";
        }else if(respuesta.equalsIgnoreCase("salir")){
            resultado = "Usted salio del juego con un puntaje =  " + puntaje;
            r = "salio";
        }else{
            puntaje = 0;
            resultado = "Respuesta Incorrecta, su puntaje es = " + puntaje;
            r = "malo";
        }
        return resultado;
    }
    // respuesta a la pregunta 2
    public String question2 ( ){
        if (respuesta.equalsIgnoreCase("a")){
            puntaje = puntaje + puntos;
            resultado = "Respuesta Correcta su puntaje es = " + puntaje;
            r = "correcto";
        }else if(respuesta.equalsIgnoreCase("salir")){
            resultado = "Usted salio del juego con un puntaje =  " + puntaje;
            r = "salio";
        }else{
            puntaje = 0;
            resultado = "Respuesta Incorrecta, su puntaje es = " + puntaje;
            r = "malo";
        }
        return resultado;
    }
    // respuesta a la pregunta 3
    public String question3 ( ){
        if (respuesta.equalsIgnoreCase("a")){
            puntaje = puntaje + puntos;
            resultado = "Respuesta Correcta su puntaje es = " + puntaje;
            r = "correcto";
        }else if(respuesta.equalsIgnoreCase("salir")){
            resultado = "Usted salio del juego con un puntaje =  " + puntaje;
            r = "salio";
        }else{
            puntaje = 0;
            resultado = "Respuesta Incorrecta, su puntaje es = " + puntaje;
            r = "malo";
        }
        return resultado;
    }
    // respuesta a la pregunta 4
    public String question4 ( ){
        if (respuesta.equalsIgnoreCase("a")){
            puntaje = puntaje + puntos;
            resultado = "Respuesta Correcta su puntaje es = " + puntaje;
            r = "correcto";
        }else if(respuesta.equalsIgnoreCase("salir")){
            resultado = "Usted salio del juego con un puntaje =  " + puntaje;
            r = "salio";
        }else{
            puntaje = 0;
            resultado = "Respuesta Incorrecta, su puntaje es = " + puntaje;
            r = "malo";
        }
        return resultado;
    }
    // respuesta a la pregunta 5
    public String question5 ( ){
        if (respuesta.equalsIgnoreCase("a")){
            puntaje = puntaje + puntos;
            resultado = "Respuesta Correcta su puntaje es = " + puntaje;
            r = "correcto";
        }else if(respuesta.equalsIgnoreCase("salir")){
            resultado = "Usted salio del juego con un puntaje =  " + puntaje;
            r = "salio";
        }else{
            puntaje = 0;
            resultado = "Respuesta Incorrecta, su puntaje es = " + puntaje;
            r = "malo";
        }
        return resultado;
    }
    // este es el metodo get del puntaje que se obtiene despues de contestar a la pregunta
    public int getPuntaje (){
        return this.puntaje;
    }
    // este es el metodo get del resultado obtenido correcto, malo o salio que permite saber si el juego continua o termina
    public String getResultado(){
        if (r.equalsIgnoreCase("correcto")){
            continuar = r;
        }else{
            continuar = r;
        }
        return continuar;
    }   
}
