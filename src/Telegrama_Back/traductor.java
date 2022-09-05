/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telegrama_Back;

/**
 *
 * @author USUARIO
 */
public class traductor {
   String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "--.--", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..","|"};
String[] palabras= {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"," "};
	
    
    String traduccion = "";
  
    public String traducir(String dato){
        String traduccion = "";
        String mayuscula = "";
        String letra = "";
        
        mayuscula = dato.toUpperCase();
        
        for(int i=1; i<dato.length();i++){
            letra = mayuscula.substring(i-1,i);
            
            for(int j=0; j<palabras.length;j++){
                if(letra.equals(palabras [j])){
                    traduccion = traduccion + morse[j]+"|";
                    
                }
            }
        }
        return traduccion;
    }
    
    public String traducirEspañol(String dato){
        String[] palabra;
        
        palabra = dato.split(" ");
        
        for(int i=0; i<palabra.length; i++){
            for(int j=0; j<morse.length; j++){
                if(palabra[i].equals(morse[j])){
                    traduccion = traduccion + palabras[j]+ "";
                }
            }
        }
        return traduccion;
    }
 }
