
package POO_01LAB;


public class Jefe {
 //ATRIBUTOS 
    String nombre;
    String sexo;
    int dni;
    String cargo;
    String area;
    Double antiguedad;
    String seguro;
    Double bonificacion=2000.0;
    
   //CONSTRUCTOR 
   public Jefe(String nom, String sex, int dni, String car, String are, Double ant, String seg){
        
    this.nombre=nom;
    this.sexo=sex;
    this.dni=dni;
    this.cargo=car;
    this.area=are;
    this.antiguedad=ant;
    this.seguro=seg;
       
    }
   
   //SUELDO BASE
   public double sueldoBase(){
      if(cargo.equalsIgnoreCase("Gerente")){
          if(area.equalsIgnoreCase("Contabilidad"))
              return 6000;
          else if(area.equalsIgnoreCase("Tecnologias de información"))
              return 8000;
          else
              return 7000;
         }else if(cargo.equalsIgnoreCase("Subgerente")){
             
                if(area.equalsIgnoreCase("Contabilidad"))
                    return 5000;
                else if(area.equalsIgnoreCase("Tecnologias de información"))
                     return 7000;
                else
                     return 6000;   
       }
     return 0;
   } 
   //SUELDO BASE CON DESCUENDO POR SEGURO
   public double descuento(){
      if(seguro.equalsIgnoreCase("AFP"))
          return sueldoBase()*0.15;
      else
          return sueldoBase()*0.08;
   
   }
   //SUELDO BRUTO
   public double sueldoBruto(){
      return sueldoBase()+bonificacion; 
   } 
   //MONTO MOVILIDAD 
   public double montoMovilidad(){
       if(cargo.equalsIgnoreCase("Gerente"))
           return 700;
       else
           return 400;
   }
   
   //DESCUENTOS
   public double descuentos(){
       if(antiguedad <7 && antiguedad>0)
           return sueldoBruto()*0.05;
       else 
           return sueldoBruto()*0.04;
   }
   //SUELDO NETO
   public double sueldoNeto(){
       return sueldoBruto()-descuento()-descuentos()+montoMovilidad();
   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

