package src;
// Categoria 2
public class Categoria2 {
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
    public Categoria2(int puntaje) {
        this.puntaje = puntaje;
        puntos = 200;
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
                pregunta = "Si X es menor que Y por una diferencia de 6 e Y es el doble de Z,¿cuál es el valor de x cuando Zes igual a 2?";
                break;    
            case 2:
                pregunta = "Cada estudiante puede elegir entre 4 tipos de sudadera y 3 tipos de pantalones en su uniforme, ¿Cuales son las combinaciones posibles?";
                break;
            case 3:
                pregunta ="3(x-4)=18¿Cuál es el valor de x?";                
                break;        
            case 4:
                pregunta ="¿Qué resultado da 4x4-4+4x4?";                
                break;        
            default:
                pregunta ="¿Cuánto es 2x+6? Si x+3=y";                
                break;
        }
        return pregunta;
    }
    // opciones de las diferentes preguntas de la categoria
    public  String[] getOpciones(){
        switch(numeroPregunta){
            case 1:
                a = "a.5";
                b = "b.8";
                c = "c.-2";//respuesta correcta
                d = "d.10";
                opciones = new String[]{a,b,c,d};
                break;    
            case 2:
                a = "a.10";
                b = "b.12";//respuesta correcta
                c = "c.3";
                d = "d.24";
                opciones = new String[]{a,b,c,d};
                break;
            case 3:
                a = "a.10";//respuesta correcta
                b = "b.6";
                c = "c.14/3";
                d = "d.22/4";
                opciones = new String[]{a,b,c,d};           
                break;        
            case 4:
                a = "a.64";
                b = "b.-4";
                c = "c.28";//respuesta correcta
                d = "d.4";
                opciones = new String[]{a,b,c,d};
                break;        
            default:
                a = "a.2y";//Respuesta correcta
                b = "b.y";
                c = "c.4y";
                d = "d.No se puede resolver";
                opciones = new String[]{a,b,c,d};
                break;
        }
        return opciones;
    }
    // Respuesta
    public String getRespuesta(){
        switch (numeroPregunta) {
            case 1:
                if (respuesta.equalsIgnoreCase("c")){
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
                break;
            case 2:
                if (respuesta.equalsIgnoreCase("b")){
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
                break;
            case 3:
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
                break;
            case 4:
                if (respuesta.equalsIgnoreCase("c")){
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
                break;
            default:
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
                break;
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
