/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsparktikum;
import java.util.Scanner;
/**
 *
 * @author meryl
 */
public class Main {
     public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       
       Admin admin = new Admin("Admin", 1);
       Customer cust = new Customer("Customer", 2);
        
       System.out.println("Menu Reservasi");
       System.out.println("1. Admin");
       System.out.println("2. Customer");
       System.out.print("Enter No Menu: ");
       int userType = scan.nextInt();
     
     
        if (userType == 1){
            System.out.print("Nama: ");
            scan.nextLine(); 
            admin.name = scan.nextLine();
             
            System.out.print("No HP: ");
            admin.noHP = scan.nextInt();
            System.out.println();
            System.out.println("===========================");
            admin.displayInfo();
            System.out.println("===========================");
            System.out.println();
         
            System.out.println("Admin Menu:");
            System.out.println("1. Check Kamar yang Tersedia");
            System.out.println("2. Booking Kamar");
            System.out.println("3. Exit");
            System.out.print("Enter No Menu: ");
            int choice = scan.nextInt();
        
         if (choice == 1) {
            admin.Tersedia();
        } else if (choice == 2) {
            System.out.print("Enter room number to book: ");
            int roomNumber = scan.nextInt();
            admin.bookingRoom(roomNumber);
        } else if (choice == 3) {
            System.out.println("Exiting Admin...");
        } else {
            System.out.println("Invalid choice.");
        }
        } else if (userType == 2) {
            // Customer actions without a loop
            System.out.print("Nama: ");
            scan.nextLine(); 
            cust.name = scan.nextLine();
             
            System.out.print("No HP: ");
            cust.noHP = scan.nextInt();
             
            System.out.println();
            System.out.println("===========================");
            cust.displayInfo();
            System.out.println("===========================");
            System.out.println();
            
            System.out.println("Customer Menu:");
            System.out.println("1. Booking Kamar");
            System.out.println("2. Lihat Detail Pesanan ");
            System.out.println("3. Exit");
            int choice = scan.nextInt();
   if (choice == 1) {
            System.out.print("Enter nomor kamar: ");
            int roomNumber = scan.nextInt();
            cust.bookingKamar(roomNumber);
            admin.bookingRoom(roomNumber); // Update room availability in admin
        } else if (choice == 2) {
            cust.detailBooking();
        } else if (choice == 3) {
            System.out.println("Exiting Customer...");
        } else {
            System.out.println("Invalid choice.");
        }
        } else {
            System.out.println("Invalid user type.");
        }
        }
     } 

  
    

        


