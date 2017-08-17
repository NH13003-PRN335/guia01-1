/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.guia01;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Utilities nombre = new Utilities();
        String texto = "Hola mundo Se le llama verso a una de las unidades en la literatura en lenguas romances y los textos argumentativos y expositivos).";
 String[]palabras=texto.split("\\s+");
    StringBuilder textoFormateado=new StringBuilder();
    
        for (String palabra:palabras) {
            textoFormateado.append(palabra.substring(0,1)
                    .toUpperCase().concat(palabra.substring
                    (1, palabra.length()).toLowerCase()).concat(" "));}
        System.out.println(nombre.getResume(texto.replace(" ","")));
System.out.println(textoFormateado);

    
        
        
    }
    
}
