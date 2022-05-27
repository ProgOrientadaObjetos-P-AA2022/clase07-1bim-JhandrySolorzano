/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Profesor;
import paquete1.Calificacion;
/**
 *
 * @author reroes
 */
public class ManejoArrayList3 {
    public static void main(String[] args) {
      
        Profesor prof1 = new Profesor("Joseph Jimenez", "facturado");
        Profesor prof2 = new Profesor("David Jones", "nombramiento");
        
        Calificacion c1 = new Calificacion(7.5 ,"Ingles");
        Calificacion c2 = new Calificacion(8, "Bilogia");
        
        c1.establecerProfesor(prof1);
        c2.establecerProfesor(prof2);
        
        System.out.println("-----------------------------");
        
        // ArrayList
       /* ArrayList <Calificacion> califiacion2 = new ArrayList<>();
        profesores2.add (prof1);
        profesores2.add(prof2);*/
       
        ArrayList <Calificacion> califiacion2 = new ArrayList<>();
        califiacion2.add (c1);
        califiacion2.add(c2);
        
        for (int i = 0; i < califiacion2.size(); i++) {
            System.out.printf("%s - %s - %2f\n", califiacion2.get(i).obtenerProfesor().obtenerNombre(),
                    califiacion2.get(i).obtenerNombreMateria(),califiacion2.get(i).obtenerNota());
        }
        
       
        
     
    }
}
