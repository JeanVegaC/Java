
package POO_01LAB;


public class Arquitecto {
   //ATRIBUTOS
    String codigo;
    String nombre;
    String condicion;
    String especialidad;
    String supervision;
    Double obras;  
    String seguro;
   
   
    //CONSTRUCTOR
    
    public Arquitecto(String cod, String nom, String con, String esp, String sup, Double obr, String seg){
        
    this.codigo=cod;
    this.nombre=nom;
    this.condicion=con;    
    this.especialidad=esp;
    this.supervision=sup;
    this.obras=obr;
    this.seguro=seg;    
    }
    
    //METODOS ADICIONALES
    
    public double sueldoBase(){
      if(condicion.equalsIgnoreCase("Estable")){  
          if(supervision.equalsIgnoreCase("Obras")){
             return 4000;  
          }else if(supervision.equalsIgnoreCase("Vias")){
              return 6000;}
    }else if(condicion.equalsIgnoreCase("Contratado")){
          if(supervision.equalsIgnoreCase("Obras")){
             return 2000;  
          }else if(supervision.equalsIgnoreCase("Vias"))
             return 4500;} 
             return 0;
    }
    
    public double bonificacion(){ 
        if(especialidad.equalsIgnoreCase("Estructuras")){
            return sueldoBase()*0.16;}
        else if(especialidad.equalsIgnoreCase("Recursos hidricos")){
            return sueldoBase()*0.18;}
        else{ 
            return sueldoBase()*0.22;}
        
    }
    
     public double descuento(){
      if(seguro.equalsIgnoreCase("AFP"))
          return sueldoBase()*0.15;
      else
          return sueldoBase()*0.08;
   
   }
     
    public double montoMovilidad(){
       if(obras>0&&obras<17)
           return 300;
       else 
           return 600;     
    }
    
    public double sueldoNeto(){
      return sueldoBruto()-descuento();  
    }
    
    public double sueldoBruto(){
       return sueldoBase()+bonificacion(); 
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
