/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supereroi;
import java.io.*;
import java.util.Scanner;


public class Supereroi {
	public static void main(String args[]) {
		Avengers IronMan = new Avengers(100,"Iron Man","Rosso",0,10);
		Avengers Thanos = new Avengers(1000000,"Thanos","Viola",10,10000000);
		Avengers DocStrange = new Avengers(5,"Doctor Strange","Sherlock",2,100);
		Avengers eroe = new Avengers();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci i parametri del tuo eroe");
		eroe.setHP(input.nextInt());
		eroe.setNome(input.next());
		eroe.setColore(input.next());
		eroe.setArma(input.nextInt());
		eroe.setPotere(input.nextInt());
                
                System.out.println("Chi vuoi attaccare? Scegli tra IronMan:1, Thanos:2, Docstrange:3");
                
                int s;
                do {
                s=input.nextInt();
                }
                while(0<=s && s>4);

                switch (s) {
                  case 1:  s = 1;
                        eroe.attacco(IronMan);
                         break;
                case 2:  s = 2;
                        eroe.attacco(Thanos);
                         break;
                case 3:  s = 3;
                        eroe.attacco(DocStrange);
                         break;
                }                
	}

}
