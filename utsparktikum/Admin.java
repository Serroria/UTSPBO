/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsparktikum;

/**
 *
 * @author meryl
 */
public class Admin extends User implements interfaceRoom {
    private Kamar kamar1, kamar2, kamar3, kamar4, kamar5;
    
    public Admin(String name, int role) {
        super(name, 1);
        kamar1 = new Kamar("Regular", 101);
        kamar2 = new Kamar("Family", 102);
        kamar3 = new Kamar("Medium", 103);
        kamar4 = new Kamar("Silver", 104);
        kamar5 = new Kamar("Premium", 105);
    }
    
    
    @Override
     void displayInfo(){
     System.out.println("Nama Admin: "+name);
     System.out.println("Nomor HP: "+noHP);
   }
   

   

    @Override
    public void Tersedia() {
   
    System.out.println("Kamar yang Tersedia: ");
    
    if (kamar1.isTersedia()) {
            System.out.println("Kamar 101, Regular");
        }
        if (kamar2.isTersedia()) {
            System.out.println("Kamar 102, Family");
        }
        if (kamar3.isTersedia()) {
            System.out.println("Kamar 103, Medium");
        }
        if (kamar4.isTersedia()) {
            System.out.println("Kamar 104, Silver");
        }
        if (kamar5.isTersedia()) {
            System.out.println("Kamar 105, Premium");
        }
    }

    @Override
    public void bookingRoom(int noKamar) {
  if (noKamar == 101 && kamar1.isTersedia()) {
            kamar1.setTersedia(false);
            System.out.println("Kamar 101 berhasil di booking.");
        } else if (noKamar == 102 && kamar2.isTersedia()) {
            kamar2.setTersedia(false);
            System.out.println("Kamar 102 berhasil di booking.");
        } else if (noKamar == 103 && kamar3.isTersedia()) {
            kamar3.setTersedia(false);
            System.out.println("Kamar 103 berhasil di booking.");
        } else if (noKamar == 104 && kamar4.isTersedia()) {
            kamar4.setTersedia(false);
            System.out.println("Kamar 104 berhasil di booking.");
        } else if (noKamar == 105 && kamar5.isTersedia()) {
           kamar5.setTersedia(false);
            System.out.println("Kamar 105 berhasil di booking.");
        } else {
            System.out.println("Kamar " + noKamar + " tidak tersedia.");
        }
    }

   
}
