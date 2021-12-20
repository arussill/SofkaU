package src;
// Categoria 3
public class Categoria3 {
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
    public Categoria3(int puntaje) {
        this.puntaje = puntaje;
        puntos = 300;
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
                pregunta = "¿Qué es la trayectoria de un móvil?";
                break;    
            case 2:
                pregunta = "¿En qué unidad se mide la presión?";
                break;
            case 3:
                pregunta ="¿Dónde nacio Isaac Newton?";                
                break;        
            case 4:
                pregunta ="Una masa de kilogramo, ¿a qué peso equivale en newton?";                
                break;        
            default:
                pregunta ="¿Cuál de estas velocidades corresponde a los movimientos circulares?";                
                break;
        }
        return pregunta;
    }
    // opciones de las diferentes preguntas de la categoria
    public  String[] getOpciones(){
        switch(numeroPregunta){
            case 1:
                a = "a.Es la línea que describe en su movimiento";//respuesta correcta
                b = "b.Es la dirección del movimiento";
                c = "c.Es la dirección y sentido del movimiento";
                d = "d.Es el sentido del movimiento";
                opciones = new String[]{a,b,c,d};
                break;    
            case 2:
                a = "a.Pascales";//respuesta correcta
                b = "b.Kg";
                c = "c.m/s";
                d = "d.Newton";
                opciones = new String[]{a,b,c,d};
                break;
            case 3:
                a = "a.Dinamarca";
                b = "b.Inglaterra";//respuesta correcta
                c = "c.Finlandia";
                d = "d.Estados Unidos";
                opciones = new String[]{a,b,c,d};           
                break;        
            case 4:
                a = "a. 5.8N";
                b = "b. 6.3N";
                c = "c. 7.2N";
                d = "d. 9.8N";//respuesta correcta
                opciones = new String[]{a,b,c,d};
                break;        
            default:
                a = "a.Velocidad media";
                b = "b.Velocidad angular";//respuesta correcta
                c = "c.Velocidad lineal";
                d = "d. Velocidad de trayectoria";
                opciones = new String[]{a,b,c,d};
                break;
        }
        return opciones;
    }
    // Respuesta
    public String getRespuesta(){
        switch (numeroPregunta) {
            case 1:
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
            case 2:
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
            case 3:
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
            case 4:
                if (respuesta.equalsIgnoreCase("d")){
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
