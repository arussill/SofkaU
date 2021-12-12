public class Ronda1 {

    String respuesta;
    String resultado;
    String continuar;
    String r;
    int puntaje;
    int puntos;
    

    public Ronda1(int puntaje) {
        this.puntaje = puntaje;
        puntos = 100;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
        
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
    
    public int getPuntaje (){
        return this.puntaje;
    }

    public String getResultado(){
        if (r.equalsIgnoreCase("correcto")){
            continuar = r;
        }else{
            continuar = r;
        }
        return continuar;
    }

    
}
