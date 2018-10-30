/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveur;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MIMI PC
 */
public class Serveur {

    public static void main(String[] args) {
       
              
        try {
            LocateRegistry.createRegistry(1099);
            interface_partager_imp restaurant=new interface_partager_imp();
            Naming.rebind("rmi://localhost:1099/DATA", restaurant);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
