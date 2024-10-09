/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsparktikum;

/**
 *
 * @author meryl
 */
public class User {
    String name;
    int noHP;
    int role;
    
    User (String name, int role){
        this.name = name;
        this.noHP = noHP;
        this.role = role;
    }
    
    String getName(){
        return name;
    }
    
  void setName(String newName){
        name = newName;
        
    }
  
  int getNoHP (){
      return noHP;
  }
  
  void setNoHP(int newnoHP){
      noHP = newnoHP;
  }

    int getRole(){
      return role;
  }
    


   void displayInfo(){
     System.out.println("Nama: "+name);
     System.out.println("Nomor HP: "+noHP);
   }
}
