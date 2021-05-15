package rmi_cliente_servidor;

import java.rmi.Naming;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;
/**
 *
 * @author VictorA
 */

public class Cliente {
    
    public static void main(String[] args) throws RemoteException{
        String x="", y="";
        
        try{
            Suma s = (Suma) Naming.lookup("//85.187.158.121:1099/Suma"); 
            
            while(true){
                String menu = JOptionPane.showInputDialog(null, "Suma de dos numeros\n"
                + "1.- Sumar\n"
                + "2.- Salir\n", "Cliente Servidor RPC", JOptionPane.DEFAULT_OPTION);
                switch(menu){
                    case "1":
                        x = JOptionPane.showInputDialog(null, "Primer Numero", "suma", JOptionPane.QUESTION_MESSAGE);
                        y = JOptionPane.showInputDialog(null, "Segundo Numero", "suma", JOptionPane.QUESTION_MESSAGE);
                        
                        
                        
                        JOptionPane.showMessageDialog(null, "La suma es: " + s.suma(x, y));
                       
                        
                        break;
                    case "2":
                        JOptionPane.showMessageDialog(null,"Saliendo", null, JOptionPane.WARNING_MESSAGE);
                        System.exit(0);
                    break;
                }                      

            }
                        
            
        }catch (Exception e){
            
        }

    }
    
}
