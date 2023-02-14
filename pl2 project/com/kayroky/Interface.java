
package room.manegement.com.kayroky;
import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;

public class Interface {
    
    public static void main(String[] args) throws IOException {
        
           room r1 = new room();
           empolyee e1 = new empolyee();
           customers c1 = new customers();
           ROOMMANEGEMENT r2 = new ROOMMANEGEMENT();
           
           Scanner input = new Scanner(System.in);
        
           boolean lolo=true; 
        
           System.out.println("HOTEL MANAGEMENT\n");
           System.out.println("select 1 to add room\n select 2 to updata room \n select 3 delete room\n");
           System.out.println("select 4 to add empolyee\n select 5 to updata  empolyee\n select 6 delete  empolyee\n");
           System.out.println("select 7 to add customer\n select 8 to updata customer \n select 9 delete customer\n");
           System.out.println("select 10 to room mangement \n select 11 to view  \n ");
          
        do { 
            try {
                
                 int a=input.nextInt();
           
           if(a==1){
               room.add_room();
           }
           
           if(a==2){
               room.updata_room();
           }
           
           if(a==3){
               room.delete_room();
           }
           if(a==4){
               empolyee.add_empolyee();
           }
           if(a==5){
               empolyee.updata_empolyee();
           }
           if(a==6){
               empolyee.delete_empolyee();
           }
           if(a==7){
               customers.add_customers();
           }
           if(a==8){
               customers.updata_customer();
           }
           if(a==9){
               customers.delete_customer();
           }
           if(a==10){
               ROOMMANEGEMENT.room_manegement();
           }
           if(a==11){
               ROOMMANEGEMENT.view();
           }
           lolo=false;
                
            } catch (InputMismatchException e) {
                System.out.println("The Input Invalid , try again ....\n");
                input.nextLine();
            }
            
        } while (lolo);
          
    }
    
}
