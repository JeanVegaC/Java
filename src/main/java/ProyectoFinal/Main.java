package ProyectoFinal;
import javax.swing.JOptionPane;
public class Main {
    
   
    
    public static void main(String[] args) {
    
    String dni,libro,nombre,apellido;
    int edad,opc,opv;
    Procesos oli=new Procesos();
    oli.crearCuenta("75930224","Jhean","Vega",18,1,"\n* Arte");    
         
do{    
    opc=Integer.parseInt(JOptionPane.showInputDialog(oli.menuPrincipal()));
        
    switch(opc){
        case 1:     //MENU PRINCIPAL - CASO 1 - INICIAR SESIÓN
            
            dni=JOptionPane.showInputDialog("Ingresar DNI");
        do{    
            opc=Integer.parseInt(JOptionPane.showInputDialog(oli.menuBiblioteca(dni)));
            switch(opc){
                case 1: //MENU BIBLIOTECA - CASO 1 - MOSTRAR MIS LIBROS
                    JOptionPane.showMessageDialog(null,oli.misLibros(dni));
                    break;
                case 2: //MENU BIBLIOTECA - CASO 2 - ALQUILAR LIBRO
                    libro=JOptionPane.showInputDialog("¿Ingrese el nombre del libro a prestar?");
                    oli.alquilarLibro(dni,libro);
                    JOptionPane.showMessageDialog(null,oli.mensajeAlquilarLibro(dni,libro));
                    break;
                case 3: //MENU BIBLIOTECA - CASO 3 - REGRESAR LIBRO
                    do{
                    opc=Integer.parseInt(JOptionPane.showInputDialog("¿ De que forma desea regresar los libros ?\n"
                                                                    + "***********************************\n"
                                                                    + "1.- Todos los prestados\n"
                                                                    + "2.- Por unidad"));
                    
                    switch(opc){
                        case 1:
                            JOptionPane.showMessageDialog(null,"Todos los libros han sido devueltos");
                            oli.regresarLibro(dni,"todos");
                            break;
                        case 2:
                            libro=JOptionPane.showInputDialog("Ingresar libro a devolver");
                            oli.regresarLibro(dni,libro);
                            break;
                    }
                   opv=JOptionPane.showConfirmDialog(null,"¿ Desea regresar otro libro ?");
                    }while(opv!=1||opv!=2);
                    break;
                    
            }
            
        }while(opc!=4);    
            
        
            break;
            
            
        case 2:     //MENU PRINCIPAL - CASO 2 - CREAR CUENTA
            dni=JOptionPane.showInputDialog("Ingresar DNI");
            nombre=JOptionPane.showInputDialog("Ingresar Nombre");
            apellido=JOptionPane.showInputDialog("Ingresar Apellido");
            edad=Integer.parseInt(JOptionPane.showInputDialog("Ingresar Edad"));
            oli.crearCuenta(dni, nombre, apellido, edad,0, "");
            
            //INICIAR SESIÓN
          do{  
            opc=Integer.parseInt(JOptionPane.showInputDialog(oli.menuBiblioteca(dni)));
            switch(opc){
                case 1: //MENU BIBLIOTECA - CASO 1 - MOSTRAR MIS LIBROS
                    JOptionPane.showMessageDialog(null,oli.misLibros(dni));
                    break;
                    
                case 2: //MENU BIBLIOTECA - CASO 2 - ALQUILAR LIBRO
                    libro=JOptionPane.showInputDialog("Ingrese el nombre del libro a prestar");
                    oli.alquilarLibro(dni,libro);
                    JOptionPane.showMessageDialog(null,oli.mensajeAlquilarLibro(dni,libro));
                    break;
                case 3: //MENU BIBLIOTECA - CASO 3 - REGRESAR LIBRO
                    opc=Integer.parseInt(JOptionPane.showInputDialog("¿ De que forma desea regresar los libros ?\n"
                                                                    + "***********************************\n"
                                                                    + "1.- Todos los prestados\n"
                                                                    + "2.- Por unidad"));
                    
                    switch(opc){
                        case 1:
                            JOptionPane.showMessageDialog(null,"Todos los libros han sido devueltos");
                            oli.regresarLibro(dni,"todos");
                            break;
                        case 2:
                            libro=JOptionPane.showInputDialog("Ingresar libro a devolver");
                            oli.regresarLibro(dni,libro);
                            break;
                    }
                    
                    break;
            }
           
          }while(opc!=4);
            break;
        case 3:
            break;
    }    
    
}while(opc!=3);  
    
    
    
       
       
    }
   
    
 
    
}
