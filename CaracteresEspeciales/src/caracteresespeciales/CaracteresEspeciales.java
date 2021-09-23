/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caracteresespeciales;

/**
 *
 * @author Alumno Mañana
 */
public class CaracteresEspeciales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Los caracteres especiales son + - * / = % & # ! ? ^ “ ‘ ~ \\ | < > ( ) [ ] { } : ; . ,");
        
        var centro = "CEEP";
        System.out.println("Salto de línea: \n" +centro);
        System.out.println("Tabulador: \t" +centro);
        System.out.println("Retroceso: \b\b" +centro);
        System.out.println("Comilla simple: \'" +centro+"'");
        System.out.println("Comilla compuesta: \"" +centro+"\"");
    }
    
}
