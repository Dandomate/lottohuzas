
package lottohuzas;

import java.util.ArrayList;
import java.util.Scanner;

public class Lottohuzas {

   
    public static void main(String[] args) {
        ArrayList<Integer> lotto = new ArrayList<>();
        ArrayList<Integer> s = new ArrayList<>();
        
        Scanner bemenet;
        bemenet = new Scanner(System.in);
        
        System.out.println("Ez az Ötöslottó(mini) szimuláló program");
        System.out.println("1-9 ig tud beírni számokat, ha eltalálja az 5db számot akkor ön nyert!");
        System.out.println("Sok Szerencsét!");
        System.out.println("Készítette: Dandóczi Máté Attila");
       
        System.out.print("\nKérem írja be az első számot: ");
        int elso=bemenet.nextInt();
        while(!(elso==1 || elso==2 || elso==3 || elso==4 || elso==5 || elso==6 || elso==7 || elso==8 || elso==9)){       
            System.out.println("1-9 között választhat!");
            System.out.print("\nKérem írja be az első számot: ");
            elso=bemenet.nextInt();  
        }
        lotto.add(elso);
        System.out.println("Eddig huzott számaid/od: "+lotto);
        
        
        System.out.print("\nKérem írja be a második számot: ");
        int masodik=bemenet.nextInt();
        while(!(masodik==1 || masodik==2 || masodik==3 || masodik==4 || masodik==5 || masodik==6 || masodik==7 || masodik==8 || masodik==9)){       
            System.out.println("1-9 között választhat!");
            System.out.print("\nKérem írja be a második számot: ");
            masodik=bemenet.nextInt(); 
        }
        lotto.add(masodik);
        System.out.println("Eddig huzott számaid/od: "+lotto);
        
        
        System.out.print("\nKérem írja be a harmadik számot: ");
        int harmadik=bemenet.nextInt();
        while(!(harmadik==1 || harmadik==2 || harmadik==3 || harmadik==4 || harmadik==5 || harmadik==6 || harmadik==7 || harmadik==8 || harmadik==9)){       
            System.out.println("1-9 között választhat!");
            System.out.print("\nKérem írja be a harmadik számot: ");
            harmadik=bemenet.nextInt(); 
        }
        lotto.add(harmadik);
        System.out.println("Eddig huzott számaid/od: "+lotto);
        
        
        System.out.print("\nKérem írja be a negyedik számot: ");
        int negyedik=bemenet.nextInt();
        while(!(negyedik==1 || negyedik==2 || negyedik==3 || negyedik==4 || negyedik==5 || negyedik==6 || negyedik==7 || negyedik==8 || negyedik==9)){       
            System.out.println("1-9 között választhat!");
            System.out.print("\nKérem írja be a negyedik számot: ");
            negyedik=bemenet.nextInt();  
        }
        lotto.add(negyedik);
        System.out.println("Eddig huzott számaid/od: "+lotto);
        
        
        System.out.print("\nKérem írja be az ötödik számot: ");
        int otodik=bemenet.nextInt();
        while(!(otodik==1 || otodik==2 || otodik==3 || otodik==4 || otodik==5 || otodik==6 || otodik==7 || otodik==8 || otodik==9)){       
            System.out.println("1-9 között választhat!");
            System.out.print("\nKérem írja be az ötödik számot: ");
            otodik=bemenet.nextInt();  
        }
        lotto.add(otodik);
        System.out.println("Eddig huzott számaid/od: "+lotto);
       
        
        System.out.println("\nA nyerő számok: ");
        
        while(s.size()!=5){
            s.add((int)(Math.random()*8)+1);
        }
        System.out.println(s);
        
        if(lotto==s){
        System.out.println("\nGratulálunk Nyertél!");
        }
        else{
            System.out.println("\nSajnáljuk, most nem nyertél.");
        }

    }
    
}