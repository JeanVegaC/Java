package ProyectoFinal;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        String dni, libro, nombre, apellido;
        int edad, opc, opv;
        Procesos oli = new Procesos();
        oli.crearCuenta("75930224", "Jhean", "Vega", 18, 1, "\n* Arte");

        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(oli.menuPrincipal()));

            switch (opc) {
                case 1:     //MENU PRINCIPAL - CASO 1 - INICIAR SESIÓN

                    dni = JOptionPane.showInputDialog("Ingresar DNI");
                    do {
                        opc = Integer.parseInt(JOptionPane.showInputDialog(oli.menuBiblioteca(dni)));
                        switch (opc) {
                            case 1: //MENU BIBLIOTECA - CASO 1 - MOSTRAR MIS LIBROS
                                JOptionPane.showMessageDialog(null, oli.misLibros(dni));
                                break;
                            case 2: //MENU BIBLIOTECA - CASO 2 - ALQUILAR LIBRO
                                libro = JOptionPane.showInputDialog("¿Ingrese el nombre del libro a prestar?");
                                if (libro==null||libro.equalsIgnoreCase("")) {
                                    JOptionPane.showMessageDialog(null,"Libro invalido");
                                    break;
                                }
                                oli.alquilarLibro(dni, libro);
                                JOptionPane.showMessageDialog(null, oli.mensajeAlquilarLibro(dni, libro));
                                break;
                            case 3: //MENU BIBLIOTECA - CASO 3 - REGRESAR LIBRO
                                if (oli.regresarContLibros(dni)==0) {
                                        JOptionPane.showMessageDialog(null,"No tienes libros prestados");
                                }else{
                                  
                                
                                do {
                                    opc = Integer.parseInt(JOptionPane.showInputDialog(oli.regresarLibros()));

                                    switch (opc) {

                                        case 1:
                                            JOptionPane.showMessageDialog(null, "Todos los libros han sido devueltos");
                                            oli.regresarLibro(dni, "todos");
                                            break;
                                        case 2:
                                            libro = JOptionPane.showInputDialog("Ingresar libro a devolver");
                                            oli.regresarLibro(dni, libro);
                                            break;
                                        case 3:
                                            break;
                                    }
                                    if (opc==1) {
                                        break;
                                    }
                                    
                                    if (opc == 2) {
                                        opv = JOptionPane.showConfirmDialog(null, "¿ Desea regresar otro libro ?", "YES_NO_OPTION", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                                        if (opv == 1) {
                                            break;
                                        }
                                    }

                                } while (opc != 3);
                                break;  
                                }
                                

                        }

                    } while (opc != 4);

                    break;
                    

                case 2:     //MENU PRINCIPAL - CASO 2 - CREAR CUENTA
                    dni = JOptionPane.showInputDialog("Ingresar DNI");
                    nombre = JOptionPane.showInputDialog("Ingresar Nombre");
                    apellido = JOptionPane.showInputDialog("Ingresar Apellido");
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Edad"));
                    oli.crearCuenta(dni, nombre, apellido, edad, 0, "");

                    //INICIAR SESIÓN
                    do {
                        opc = Integer.parseInt(JOptionPane.showInputDialog(oli.menuBiblioteca(dni)));
                        switch (opc) {
                            case 1: //MENU BIBLIOTECA - CASO 1 - MOSTRAR MIS LIBROS
                                JOptionPane.showMessageDialog(null, oli.misLibros(dni));
                                break;
                            case 2: //MENU BIBLIOTECA - CASO 2 - ALQUILAR LIBRO
                                libro = JOptionPane.showInputDialog("¿Ingrese el nombre del libro a prestar?");
                                if (libro==null||libro.equalsIgnoreCase("")) {
                                    JOptionPane.showMessageDialog(null,"Libro invalido");
                                    break;
                                }
                                oli.alquilarLibro(dni, libro);
                                JOptionPane.showMessageDialog(null, oli.mensajeAlquilarLibro(dni, libro));
                                break;
                            case 3: //MENU BIBLIOTECA - CASO 3 - REGRESAR LIBRO
                              if (oli.regresarContLibros(dni)==0) {
                                        JOptionPane.showMessageDialog(null,"No tienes libros prestados");
                                }else{
                                  
                                do {
                                    opc = Integer.parseInt(JOptionPane.showInputDialog(oli.regresarLibros()));

                                    switch (opc) {

                                        case 1:
                                            JOptionPane.showMessageDialog(null, "Todos los libros han sido devueltos");
                                            oli.regresarLibro(dni, "todos");
                                            break;
                                        case 2:
                                            libro = JOptionPane.showInputDialog("Ingresar libro a devolver");
                                            oli.regresarLibro(dni, libro);
                                            break;
                                        case 3:
                                            break;
                                    }

                                    if (opc == 2) {
                                        opv = JOptionPane.showConfirmDialog(null, "¿ Desea regresar otro libro ?", "YES_NO_OPTION", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                                        if (opv == 1) {
                                            break;
                                        }
                                    }

                                } while (opc != 3);
                                break;
                              }
                                
                            
                                

                        }

                    } while (opc != 4);
                    break;
                case 3:
                    break;
            }

        } while (opc != 3);

    }

}
