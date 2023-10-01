package comprobaciones;

import java.util.ArrayList;
public class InterfazUsuario
{
    // El significado de String[] instruccion le permite al usuario ingresar nuevos habitantes a la oficina padron que edita el archivo. csv e incresa los datos del nuevo habitante
    public static void ejecutar(String[] instruccion){
        OficinaPadron padron = new OficinaPadron();
        if (instruccion[0].equalsIgnoreCase("mostrar")&& instruccion.length ==1){
            mostrarOficinaPadron(padron);
        }else if(instruccion[0].equalsIgnoreCase("anadir")&& instruccion.length == 4){
            padron.annadir(new Habitante(instruccion[1],instruccion[2], instruccion[3]));
            System.out.println("Habitante añadidocorrectamente");
        }else{   
            System.out.println("Error en la instrucción");
        }
    }
    private static void mostrarOficinaPadron(OficinaPadron padron){
        ArrayList<Habitante> habitantes = padron.getHabitantesPadron();
        for(Habitante habitante : habitantes){
            System.out.println(habitante.getnombre() + " " +habitante.getapellido1() + " " + habitante.getapellido2());
        }       
        System.out.println("El numero total de habitantes es" + padron.calcularNumeroHabitantes());
    }
}   
