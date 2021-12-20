package src;
// Categoria 5
public class Categoria5 {
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
    public Categoria5(int puntaje) {
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
                pregunta = "In which of these places is there no friction?";
                break;    
            case 2:
                pregunta = "Which of these phrases corresponds to the fundamental principle of energy?";
                break;
            case 3:
                pregunta ="What type of friction force exists when one body rolls over another?";                
                break;        
            case 4:
                pregunta ="Mechanical energy is the sum of two energies, what are they?";                
                break;        
            default:
                pregunta ="A speaker emits at a given fixed frequency.It is correct to state that an observer will hear a sound:";                
                break;
        }
        return pregunta;
    }
    // opciones de las diferentes preguntas de la categoria
    public  String[] getOpciones(){
        switch(numeroPregunta){
            case 1:
                a = "a.heaven";
                b = "b.An ice rink";
                c = "c.space";
                d = "d.None of the above";//respuesta correcta
                opciones = new String[]{a,b,c,d};
                break;    
            case 2:
                a = "a.Energy is not created but it is destroyed through friction.";
                b = "b.Energy is neither created nor destroyed, it only transforms.";//respuesta correcta
                c = "c.Energy is created by machine systems that transform it.";
                d = "d.Energy is neither created nor destroyed, it is only conserved.";
                opciones = new String[]{a,b,c,d};
                break;
            case 3:
                a = "a.Rolling";//respuesta correcta
                b = "b.Glide";
                c = "c.Attraction";
                d = "d.Viscous";
                opciones = new String[]{a,b,c,d};           
                break;        
            case 4:
                a = "a.Kinetic energy and energy of friction.";
                b = "b.Kinetic energy and hydraulic energy.";
                c = "c.Kinetic energy and gravitational potential energy.";//respuesta correcta
                d = "d.Kinetic energy and electrical energy.";
                opciones = new String[]{a,b,c,d};
                break;        
            default:
                a = "a.More frequently if the observer or speaker moves closer to each other";//respuesta correcta
                b = "b.More frequently if the observer or speaker moves away from each other";
                c = "c.Less frequently if the observer moves away or if the speaker approaches";
                d = "d.Less frequently if the observer moves away or if the speaker approaches";
                opciones = new String[]{a,b,c,d};
                break;
        }
        return opciones;
    }
    // Respuesta
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
