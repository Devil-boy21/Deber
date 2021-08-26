
package atributos;

import java.util.ArrayList;


public class ListaPersona {
    
    public double promedioEdad(persona[]p){
        double MaxEdad=0;
        for(int i=0;i<p.length;i++){
            if(p[i].getEdad()>MaxEdad){
                MaxEdad=p[i].getEdad();
            }
          
        }
       
        
       
        return MaxEdad;
        
        
    }
    public double edadMax(ArrayList<persona> p){
    double max=p.get(0).getEdad();
    for(int i=1;i<p.size();i++){
        if(p.get(i).getEdad()>max){
            max=p.get(i).getEdad();
        
        }
      
        }
     return max;
    }
     public persona edadMaxPersona(ArrayList<persona> p ){
    
        persona max= new persona();
              max=  p.get(0);
        for(int i=1;i<p.size();i++){
            if(p.get(i).getEdad()>max.getEdad()){
                    max=p.get(i);
            }
        }
        return max;
    }
      public persona menorEdad(ArrayList<persona> m ){
    
        persona menOR= new persona();
              menOR=  m.get(0);
        for(int i=1;i<m.size();i++){
            if(m.get(i).getEdad()<menOR.getEdad()){
                    menOR=m.get(i);
            }
        }
        return menOR;
    
       
     }
     
}


    
    
    

