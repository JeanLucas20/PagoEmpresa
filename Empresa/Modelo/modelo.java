
package Modelo;

import javax.swing.JOptionPane;

public class modelo {

    public static void main(String[] args) {
    
    
    //-------------------------
    // Atributos
    //-------------------------
    //-------------------------
    int HorasTrabajadas;
    int HorasTrabajadas2;
    int Año = 2022;
    int SalarioMinimo2 = 2000000;
    int ValorHora = 8250 ;
    int Empresa;


    //-------------------------
    // Métodos
    //-------------------------

    String menu="-------------------Empresa------------------\n";
    menu+="1. Horas trabajadas - Auxilio de transporte\n";
    menu+="2. Edad del trabajador\n";
    menu+="3. Años en la Empresa\n";
    menu+="4. Salir\n";
    menu+="Ingrese una opción";
    
    do     {
            Empresa=Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (Empresa){
                    case 1:{

                        HorasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas que ha trabajado al mes: "));
                        HorasTrabajadas2 = HorasTrabajadas * ValorHora;                
                        int AuxilioTransporte = 117172 + HorasTrabajadas2;

                        if (HorasTrabajadas2 <= SalarioMinimo2){
                            JOptionPane.showMessageDialog(null, "El salario a pagar es de "+ AuxilioTransporte+", y Actualmente SI ES beneficiario del auxilio de transporte.");                  
                        }else{
                            JOptionPane.showMessageDialog(null, "El salario a pagar es de "+ HorasTrabajadas2+", y Actualmente NO ES beneficiario del auxilio de transporte.");                  
                        }
                        }

                    break;
                    
                    case 2:{
                        
                        int Nacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año en el que nacio: "));
                        int EdadTrabajador = Año - Nacimiento ;
                        JOptionPane.showMessageDialog(null, "El trabajador tiene "+ EdadTrabajador + " de edad.");                  
                        }

                        break;
                    
                    case 3:{
                            
                            int Ingreso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año en el que ingreso a la empresa: "));
                            int AñosIngresos = Año - Ingreso ;
                            JOptionPane.showMessageDialog(null, "El trabajador lleva "+ AñosIngresos + " en la empresa.");                  

                        }


                    }
        }while(Empresa!=4);
        
    }
}

