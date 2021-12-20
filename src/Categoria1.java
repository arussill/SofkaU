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
                pregunta = "¿Cual es la representación gráfica del número nueve mil treinta y seis?";
                break;    
            case 2:
                pregunta = "¿A cuántas unidades equibale 10 decenas de millar?";
                break;
            case 3:
                pregunta ="¿Cual es la aproximidad del núemro 58 a la decena?";                
                break;        
            case 4:
                pregunta ="¿Qué cantidad expresa el número romano V?";                
                break;        
            default:
                pregunta ="¿Cuál es el nombre del triángulo que tiene dos lados iguales y uno desigual?";                
                break;
        }
        return pregunta;
    }
    // opciones de las diferentes preguntas de la categoria
    public  String[] getOpciones(){
        switch(numeroPregunta){
            case 1:
                a = "a.9360";
                b = "b.90036";
                c = "c.936";
                d = "d.9036";//respuesta correcta
                opciones = new String[]{a,b,c,d};
                break;    
            case 2:
                a = "a.10000 unidades";
                b = "b.100000 unidades";//respuesta correcta
                c = "c.1000 unidades";
                d = "d.1000000 unidades";
                opciones = new String[]{a,b,c,d};
                break;
            case 3:
                a = "a.50";
                b = "b.59";
                c = "c.60";//respuesta correcta
                d = "d.55";
                opciones = new String[]{a,b,c,d};           
                break;        
            case 4:
                a = "a.uno";
                b = "b.cinco";//respuesta correcta
                c = "c.diez";
                d = "d.cincuenta";
                opciones = new String[]{a,b,c,d};
                break;        
            default:
                a = "a.isósceles";//Respuesta correcta
                b = "b.escaleno";
                c = "c.equilatero";
                d = "d.rectangulo";
                opciones = new String[]{a,b,c,d};
                break;
        }
        return opciones;
    }
    //Respuestas
    public String getRespuesta(){
        switch (numeroPregunta) {
            case 1:
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
            case 4:
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
