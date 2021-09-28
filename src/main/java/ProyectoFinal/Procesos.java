package ProyectoFinal;


public class Procesos {
    
protected Nodo inicio,fin;    
String Libros=""; 
public Procesos(){
   inicio=fin=null;
}    
    
public boolean estaVacia(){
    return inicio==null&&fin==null;
    
}    





public void crearCuenta(String dni,String nombre, String apellido, int edad,int cont, String libro){
  if(estaVacia()){
    fin=new Nodo(dni,nombre,apellido,edad,cont,libro);
    inicio=fin;
    fin.setSiguiente(null);
  }else{
     fin.setSiguiente(new Nodo(dni,nombre,apellido,edad,cont,libro));
     fin=fin.getSiguiente();  
  }
}    
  
public Nodo encontrar(String dni){
    Nodo tmp=inicio;
    while(!tmp.getDni().equalsIgnoreCase(dni)){
      tmp=tmp.getSiguiente();  
    }
    return tmp;
}


public String mostrar(){    //MOSTRAR TODOS LOS OBJETOS, NO UTILIZADO
   Nodo tmp=inicio;
   while(tmp!=null){
      return "DNI: "+tmp.getDni()+" Libro: "+tmp.getLibro();
   } 
    return "\n";
} 


public String menuPrincipal(){
    
return "BIENVENIDO\n"
        + "**********************\n"
        + "¿ Elija una opción a realizar? \n"
        + "1.- Iniciar sesión\n"
        + "2.- Crear cuenta\n"
        + "3.- Salir\n"
        + "**********************";
  
}


public String menuBiblioteca(String dni){
    
    Nodo tmp=encontrar(dni);
    
    return "BIENVENIDO "+tmp.getNombre()+" "+tmp.getApellido()+"\n"
            + "***********************************\n"
            + "¿ Que opción deseas realizar ?\n"
            + "1.- Mis Libros\n"
            + "2.- Alquilar Libro\n"
            + "3.- Regresar Libro\n"
            + "4.- Cerrar Sesión";
        
}    


public String misLibros(String dni){
    int cont=0;
    Nodo tmp=encontrar(dni);
    return "Hola "+tmp.getNombre()+" "+tmp.getApellido()+"\n"
            + "*********************\n"
            + "Estos son tus libros prestados:\n"
            + tmp.getLibro()+""
            + "\n"
            + "\nLibros prestados: "+tmp.getCont();
}  


public String regresarLibros(){
    return "¿ De que forma desea regresar los libros ?\n"
                                            + "***********************************\n"
                                            + "1.- Todos los prestados\n"
                                            + "2.- Por unidad\n"
                                            + "3.- Atras ";
}
    
public void alquilarLibro(String dni,String libro){
   
    Nodo tmp=encontrar(dni);
    
    Libros=tmp.getLibro()+"\n"+"* "+libro;
    tmp.setLibro(Libros);
    tmp.setCont(tmp.getCont()+1);
    
}  



public String mensajeAlquilarLibro(String dni,String libro){
    
    Nodo tmp=encontrar(dni);
 
   return "GRACIAS POR ALQUILAR EL LIBRO: "+" "+libro+"\n"
           + "*************************************\n"
            + "Editorial : Universidad Cesar Vallejo\n"
           + "*************************************\n"
            + "Datos del estudiante:\n"
           + "*************************************\n"
            + "DNI: "+tmp.getDni()+"\n"
            + "Nombre Completo: "+tmp.getNombre()+" "+tmp.getApellido()+"\n"
            + "Edad: "+tmp.getEdad();
}
    
public void regresarLibro(String dni,String libro){
    
    Nodo tmp=encontrar(dni);
    
    if (libro.equalsIgnoreCase("todos")) {
        tmp.setLibro("");
        tmp.setCont(0);
    }else{
    
    
    String nueva=tmp.getLibro();
    String z=nueva.replace("\n* "+libro,"");
    tmp.setLibro(z);
        if (tmp.getCont()==0) {
            tmp.setCont(0);
        }else tmp.setCont(tmp.getCont()-1);
    
    }
    
}    

  public int regresarContLibros(String dni){
    Nodo tmp=encontrar(dni);
    return tmp.getCont();  
  }  
    
    
    
    
    
    
    
    
    
    
    
    
    
}
