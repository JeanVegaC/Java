package ProyectoFinal;

public class Nodo {
    
protected String dni,nombre,apellido,libro;    
protected int edad,cont;
protected Nodo siguiente;

public Nodo(){
    
}   

public Nodo(String dni,String nombre,String apellido,int edad,int cont,String libro){
    this.dni=dni;
    this.nombre=nombre;
    this.apellido=apellido;
    this.edad=edad;
    this.cont=cont;
    this.libro=libro;    
    
}
    
public String getDni(){
    return dni;
}       
public void setDni(String dni){
    this.dni=dni;
}  

public String getNombre(){
    return nombre;
}    
public void setNombre(String nombre){
    this.nombre=nombre;
} 

public String getApellido(){
    return apellido;
}    
public void setApellido(String apellido){
    this.apellido=apellido;
}    

public int getEdad(){
    return edad;
}
    
public void setEdad(int edad){
    this.edad=edad;
}       
    
    

public int getCont(){
    return cont;
}

public void setCont(int cont){
    this.cont=cont;
}

public String getLibro(){
    return libro;
}

public void setLibro(String libro){
    this.libro=libro;
}    
    
public Nodo getSiguiente(){
    return siguiente;
}  
    
public void setSiguiente(Nodo siguiente){
    this.siguiente=siguiente;
}
}
