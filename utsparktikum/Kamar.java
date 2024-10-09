/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsparktikum;

/**
 *
 * @author meryl
 */
public class Kamar  {
    private int noKamar;
      private boolean tersedia;
    
    Kamar (String KamarType, int noKamar){

        this.noKamar = noKamar;
        this.tersedia =  true;
    }
    
    
    
   int getnoKamar (){
       return noKamar;
   }
   
   void setnoKamar (int newnoKamar){
       noKamar = newnoKamar;
   }
   
  public  boolean isTersedia(){
       return tersedia;
   }
   public void  setTersedia(boolean newTersedia){
       tersedia = newTersedia;
   }

   
}
