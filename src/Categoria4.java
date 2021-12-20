package src;
// Categoria 4
public class Categoria4 {
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
    public Categoria4(int puntaje) {
        this.puntaje = puntaje;
        puntos = 400;
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
                pregunta = "¿En qué unidad se mide la velocidad angular?";
                break;    
            case 2:
                pregunta = "¿Qué es el módulo de un vector?";
                break;
            case 3:
                pregunta ="¿En qué unidad se mide el trabajo?";                
                break;        
            case 4:
                pregunta ="¿Cuál es el valor de la gravedad de la Tierra?";                
                break;        
            default:
                pregunta ="¿Cuál de las siguientes leyes no pertenece a los 3 principios de Newton?";                
                break;
        }
        return pregunta;
    }
    // opciones de las diferentes preguntas de la categoria
    public  String[] getOpciones(){
        switch(numeroPregunta){
            case 1:
                a = "a.Newton.";
                b = "b.Km/h.";
                c = "c.Rad/s.";//respuesta correcta
                d = "d.m/s.";
                opciones = new String[]{a,b,c,d};
                break;    
            case 2:
                a = "a.Su punto de inicio.";
                b = "b.El valor de la magnitud que representa.";//respuesta correcta
                c = "c.El punto medio del vector.";
                d = "d.La dirección en la que está orientado.";
                opciones = new String[]{a,b,c,d};
                break;
            case 3:
                a = "a.Julios.";//respuesta correcta
                b = "b.Newton.";
                c = "c.Watios.";
                d = "d.Pascales.";
                opciones = new String[]{a,b,c,d};           
                break;        
            case 4:
                a = "a.9.8 m/s2.";
                b = "b.10 m/s2.";
                c = "c.9.8 m/s.";//respuesta correcta
                d = "d.10 m/s.";
                opciones = new String[]{a,b,c,d};
                break;        
            default:
                a = "a.Ley de atracción.";//respuesta correcta
                b = "b.Ley fundamental de la dinámica";
                c = "c.Ley de la inercia.";
                d = "d.Ley de la acción y reacción.";
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
