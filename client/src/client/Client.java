/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;


import java.net.InetAddress;
import java.rmi.Naming;
import java.rmi.Remote;
import java.util.Scanner;
import serveur.interface_partager;
public class Client {



    public static void main(String[] args) throws Exception {
       
        Remote r = Naming.lookup("rmi://"
					+ InetAddress.getLocalHost().getHostAddress() + ":" + 1099
					+ "/DATA");
			System.out.println(r);
                        if (r instanceof interface_partager) {
                            int i;
                            rest res=new rest();
                            String [] liste=res.getTab(); 
                                boolean faire =true;
                            int res1=0,res2=0,res3=0;
                            int []liste1=res.getTab1();
                            System.out.println("voici le classement des restaurants!");
                            for (i=0;i<liste.length;i++){
                                System.out.println(liste[i]);
                            }  
                            
                            
                              while (faire==true){
                	System.out.println("choisie votre resterant"); 

             Scanner lire = new Scanner(System.in);
                     String c=lire.nextLine();
       switch (c){
           case "rest1":{ 
               System.out.println("Merci pour votre choix");
               res1=res1+1;
           System.out.println("Merci pour votre choix");
               res2=res2+1;
               System.out.println("donnée votre évaluation/20");
               System.out.println("Note de Qualité de la nourriture" );
               int nour=lire.nextInt();
                 System.out.println("Note de Qualité de la salle" );
                 int salle=lire.nextInt();
                 System.out.println("Note de Qualité de service");
                 int service=lire.nextInt();
                  int s = ((interface_partager) r).CalculerScore(nour, salle, service);
                  System.out.println("votre évaluation est: "+s+"/20");
                   System.out.println("nombre de clients qui aime ce resterant1 est: "+res1);

           }
             
        break;
           case "rest2":{
                 System.out.println("Merci pour votre choix");
               res2=res2+1;
               System.out.println("donnée votre évaluation/20");
               System.out.println("Note de Qualité de la nourriture" );
               int nour=lire.nextInt();
                 System.out.println("Note de Qualité de la salle" );
                 int salle=lire.nextInt();
                 System.out.println("Note de Qualité de service");
                 int service=lire.nextInt();
                  int s = ((interface_partager) r).CalculerScore(nour, salle, service);
                  System.out.println("votre évaluation est: "+s+"/20");
                   System.out.println("nombre de clients qui aime ce resterant1 est: "+res2);

                break;}
           case "rest3":{
                 System.out.println("Merci pour votre choix");
               res3=res3+1;
               System.out.println("Merci pour votre choix");
               res2=res2+1;
               System.out.println("donnée votre évaluation/20");
               System.out.println("Note de Qualité de la nourriture" );
               int nour=lire.nextInt();
                 System.out.println("Note de Qualité de la salle" );
                 int salle=lire.nextInt();
                 System.out.println("Note de Qualité de service");
                 int service=lire.nextInt();
                  int s = ((interface_partager) r).CalculerScore(nour, salle, service);
                  System.out.println("votre évaluation est: "+s+"/20");
                   System.out.println("nombre de clients qui aime ce resterant1 est: "+res3);

           }
               default:
            System.out.println("entrez une nombre valide");
               
       }		
       
               
         

               
       }     
        
			 
				 
      
                                 
                         }   
                           
                            } 
                            
                            
                          
                       
                           
                            
                            
                            }
    





