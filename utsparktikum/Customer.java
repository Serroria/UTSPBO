/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsparktikum;

/**
 *
 * @author meryl
 */
public class Customer extends User{
    int bookingNoKamar;
    String bookingTypeKamar;
    
    public Customer(String name, int role) {
        super(name, 2);
        this.bookingNoKamar=0;
        this.bookingTypeKamar=bookingTypeKamar;
    }

    public void bookingKamar(int noKamar){
        this.bookingNoKamar = noKamar;
      
        
        System.out.println("No Kamar: "+noKamar);
        
    }
    
       @Override
     void displayInfo(){
     System.out.println("Nama Customer: "+name);
     System.out.println("Nomor HP: "+noHP);
   }
     
     void detailBooking(){
         if (bookingNoKamar != 0){
             System.out.println(name + "Telah memesan kamar"+bookingNoKamar);
         }else{
             System.out.println("Anda belum memesan kamar");
         }
         
         System.out.println("Tipe Kama: "+bookingTypeKamar);
     }
}
