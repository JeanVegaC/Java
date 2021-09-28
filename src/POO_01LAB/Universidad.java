
package POO_01LAB;

public class Universidad {
 
//ATRIBUTOS

    protected String codigo;
    protected String nombre;
    protected String categoria;
    protected String estudios;
    protected Double antiguedad;
    protected Double horas;

//VALORES COMUNES
    
    double AFP=0.13;
    double seguro=0.05;
    
//CONSTRUCTOR

    Universidad(String cod, String nom, String cat, String est, Double ant, Double hor){
        this.codigo=cod;
        this.nombre=nom;
        this.categoria=cat;
        this.estudios=est;
        this.antiguedad=ant;
        this.horas=hor;
       
    }
    
    
    public double pagoParcial(){
     
     if(categoria.equalsIgnoreCase("Principal"))
         return horas*25;
     else if(categoria.equalsIgnoreCase("Asociado"))
         return horas*18;
     else 
         return horas*15;
    }
    
    public double sueldoBruto(){
        return pagoParcial()+bonificacionEstudios()+bonificacionAntiguedad();
       
    }
    public double bonificacionEstudios(){
       
     if(categoria.equalsIgnoreCase("Principal")){  
         
        if(estudios.equalsIgnoreCase("Doctorado")) 
        return pagoParcial()*0.20;
       else if(estudios.equalsIgnoreCase("Maestria"))
        return pagoParcial()*0.17;
       else if(estudios.equalsIgnoreCase("Ambos"))
           return pagoParcial()*0.25;
       else 
           return 0;
     
     }else if(categoria.equalsIgnoreCase("Asociado")){
         
         if(estudios.equalsIgnoreCase("Doctorado")) 
        return pagoParcial()*0.15;
       else if(estudios.equalsIgnoreCase("Maestria"))
        return pagoParcial()*0.10;
       else if(estudios.equalsIgnoreCase("Ambos"))
           return pagoParcial()*0.20;
       else 
           return 0;
         
     }else if(categoria.equalsIgnoreCase("Auxiliar")){
         if(estudios.equalsIgnoreCase("Doctorado")) 
        return pagoParcial()*0.12;
       else if(estudios.equalsIgnoreCase("Maestria"))
        return pagoParcial()*0.08;
       else if(estudios.equalsIgnoreCase("Ambos"))
           return pagoParcial()*0.17;
       else 
           return 0;
     }
     return 0;
    }
    
    public double bonificacionAntiguedad(){
        
      if(categoria.equalsIgnoreCase("Principal")){  
         
        if(antiguedad>0 && antiguedad<7) 
        return pagoParcial()*0.05;
       else 
           return pagoParcial()*0.07;
     
     }else if(categoria.equalsIgnoreCase("Asociado")){
         
         if(antiguedad>0 && antiguedad<7) 
        return pagoParcial()*0.04;
       else 
           return pagoParcial()*0.06;
         
     }else if(categoria.equalsIgnoreCase("Auxiliar")){
         if(antiguedad>0 && antiguedad<7) 
        return pagoParcial()*0.02;
       else 
           return pagoParcial()*0.05;
         
     }       
        return 0;   
    }
    
    public double montoAFP(){
        return sueldoBruto()*AFP;
    }
    
    public double montoSeguro(){
        return sueldoBruto()*seguro;
    }
    
    public double sueldoNeto(){
        return sueldoBruto()-montoAFP()-montoSeguro();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
