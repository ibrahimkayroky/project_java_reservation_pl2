
package room.manegement.com.kayroky;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;



public class customers extends room{
    
    public static void add_customers() throws IOException{
   
       boolean z;
       while ( z =true) {            
       File file = new File("customer.txt");
       BufferedWriter r = new BufferedWriter(new FileWriter("customer.txt",true));
       Scanner input = new  Scanner(System.in);
       
       System.out.println("Please Enter ID Empolyee\n ");
       int x=0;
       String ee="";
       while(true){
        boolean try11=true;
            do {                
                try {
               x=0;
               int e=input.nextInt();
               ee=String.valueOf(e);
               ArrayList<String> rom1=new ArrayList<>();
               Scanner rom = new Scanner(file);
               String rom2;
               rom.useDelimiter("[\r\n:]");
                while(rom.hasNext())
             {
                 rom2=rom.next();
                 rom1.add(rom2);

             }
                for (int y =0 ; y< rom1.size() ; y++)
                 {
                     if (rom1.get(y).equalsIgnoreCase(ee)) 
                     {
                       x=1;
                     }
                 }
               try11=false;
            
        } catch (InputMismatchException e) {
            input.nextLine();}
            } while (try11);
            if(x==1){
                System.out.println("\nThe ID  Is Found , Please Enter Another ID \n");
                continue;
            }
            else{
                r.append(ee+":ID\n");
                break;
            }
       }
       
       System.out.println("Please Enter your name \n ");
       String xx = input.next();
       r.append(xx+":Name\n");
       
       System.out.println("Please Enter your age \n "); 
        boolean try0=true;
            do {                
                try {
               int b=input.nextInt();
               String bb=String.valueOf(b);
               r.append(bb+":Age\n");
               try0=false;
            
        } catch (InputMismatchException e) {
        

            input.nextLine();}
            } while (try0);
            
        System.out.println("Please Select [ Male / Female ] \n ");
        try {
            String c = input.next();
            do {         
                if (c.equalsIgnoreCase("male")||c.equalsIgnoreCase("female")) {
                r.append(c +":Gender\n\n");
                break;
                }
                else{
                System.out.println("The Input is Invalid");
                c=input.next();
            }
            } while (true);
            
        } catch (InputMismatchException e) {
            
            input.next();}
           
              System.out.print("IF YOU ARE CONTINOUS ENTER (  1  ) \n"
                + "IF YOU ARE END THE PROJECT ENTER (  2  )");
                 boolean try1=true;
                    do {                

                         try {
                        int g=input.nextInt();  
                        if (g==1) {
                           try1=false;
                             r.close();
                                  }
                        else if(g==2){
                           r.close();
                          System.exit(0);
                            }
                        else{
                            System.out.println("The Input Invalid");;
                        }

                } catch (InputMismatchException e) {

                   input.nextLine();}

                    } while (try1);
    }
        
        
    }
    
   public static void updata_customer() throws FileNotFoundException, IOException{
  
         File file3 = new File("customer.txt");
         String mm1;
         boolean ho;
         int j=0;
         Scanner input = new Scanner(System.in);
         System.out.println("Enter ID To Find The Customer");
         
         while(ho=true){
         Scanner qq = new Scanner(file3);
         String emp = input.next();
         ArrayList<String> yyr=new ArrayList<>();
         qq.useDelimiter("[\r\n:]");
         while(qq.hasNext())
         {
             mm1=qq.next();
             yyr.add(mm1);
             
         }
           for (int a =0 ; a< yyr.size() ; a++)
             {
                 if (yyr.get(a).equalsIgnoreCase(emp)) 
                 {
                 j=1;
                 
                 yyr.remove(a);
                 System.out.println("Found !\nPlease Enter New ID \n ");
                 while(true){
                     String newid1="";
                     int x=0;
                    boolean try0=true;
                        do {                
                            try {
                           x=0;
                           int newid = input.nextInt();
                           newid1=String.valueOf(newid);
                           ArrayList<String> rom1=new ArrayList<>();
                           Scanner rom = new Scanner(file3);
                           String rom2;
                           rom.useDelimiter("[\r\n:]");
                            while(rom.hasNext())
                         {
                             rom2=rom.next();
                             rom1.add(rom2);

                         }
                            for (int y =0 ; y< rom1.size() ; y++)
                             {
                                 if (rom1.get(y).equalsIgnoreCase(newid1)) 
                                 {
                                   x=1;
                                 }
                             }
                           try0=false;

                    } catch (InputMismatchException e) {
                       System.out.println("The Input Invalid");
                        input.nextLine();}
                        } while (try0);

                        if(x==1){
                            System.out.println("\nThe ID Room Is Found , Please Enter Another ID Room\n");
                            continue;
                        }
                        else{
                               yyr.add(a,newid1);
                            break;
                        }
                   }
                 
                 yyr.remove(a+2);
                 System.out.println("Enter New Name Customer");
                 String newcus = input.next();
                 yyr.add(a+2,newcus);
                 
                 yyr.remove(a+4);
                 System.out.println(" Enter New age \n ");
                 boolean try4=true;
                     do {                         
                         try {
                         int newage = input.nextInt();
                         String newage1=String.valueOf(newage);
                         yyr.add(a+4,newage1);
                         try4=false;
                     } catch (InputMismatchException e) {
                         System.out.println("The Input Invalid");
                         input.nextLine();
                     }
                     } while (try4);
                     
                 System.out.println("Please Select [ Male / Female ] \n ");
                    try {
                        
                        String newgen = input.next();
                        do { 
                            
                            if (newgen.equalsIgnoreCase("male")||newgen.equalsIgnoreCase("female"))
                            {
                            yyr.remove(a+6);
                            yyr.add(a+6,newgen);
                            break;
                            }
                            
                            else
                            {
                            System.out.println("The Input is Invalid");
                            newgen=input.next();
                            } 
                            
                        }
                        while (true);

                    } 
                    catch (InputMismatchException e) 
                    {
                        System.out.println("The Input is Invalid");
                        input.nextLine();
                   
                    }
                 writer("customer.txt", yyr);
                 break;
                
                 }
             }
          if(j==1){
             System.out.println(" Customer Is Updata\n\n");
             
                 System.out.print("IF YOU ARE CONTINOUS ENTER (  1  ) \n"
                    + "IF YOU ARE END THE PROJECT ENTER (  2  )");
             boolean try1=true;
                do {                

                     try {
                    int g=input.nextInt();  
                    if (g==1) {
                       try1=false;

                              }
                    else if(g==2){

                      System.exit(0);
                        }
                    else{
                        System.out.println("The Input Invalid");
                    }

            } catch (InputMismatchException e) {

               input.nextLine();}

                } while (try1);
             
         }
          else{
         System.out.println(" Customer Is Not Updata");
         continue;}
         
         }
    }
    
    public static void delete_customer() throws IOException{
        
         File file3 = new File("customer.txt");
         String mm1;
         ArrayList<String> yyr=new ArrayList<>();
         boolean ho;
         int j=0;
         Scanner input = new Scanner(System.in);
         System.out.println("Enter The ID Room");
         while(ho=true){
         Scanner qq = new Scanner(file3);

         String cus = input.next();
         qq.useDelimiter("[\r\n:]");
         
         while(qq.hasNext())
         {
             mm1=qq.next();
             yyr.add(mm1);
             
         }
           for (int a =0 ; a< yyr.size() ; a++)
             {
                 if (yyr.get(a).equalsIgnoreCase(cus)) 
                 {
                 j=1;
                 yyr.remove(a);
                 yyr.remove(a);
                 yyr.remove(a);
                 yyr.remove(a);
                 yyr.remove(a);
                 yyr.remove(a);
                 yyr.remove(a);
                 yyr.remove(a);
                 
                 writer("customer.txt", yyr);
                 break;
                
                 }
             }
          if(j==1){
             System.out.println(" This Customer Is Deleted\n\n");
             System.out.print("IF YOU ARE CONTINOUS ENTER (  1  ) \n"
                + "IF YOU ARE END THE PROJECT ENTER (  2  )");
                 boolean try1=true;
                    do {                

                         try {
                        int g=input.nextInt();  
                        if (g==1) {
                           try1=false;

                                  }
                        else if(g==2){

                          System.exit(0);
                            }
                        else{
                            System.out.println("The Input Invalid");
                        }

                } catch (InputMismatchException e) {
                   System.out.println("The Input Invalid");;
                   input.nextLine();}

                    } while (try1);
             
         }
         else
         System.out.println(" This Customer Is Not Deleted\n\n");
         continue;
         }
    }
    
       public static void writer(String name ,ArrayList<String>data) throws IOException{
        
        FileWriter fww = new FileWriter(new File(name));
        BufferedWriter bww = new BufferedWriter(fww);
        for(int x=0;x<data.size();x++){
            int u=0;
            if(data.get(x).equals("Name")||data.get(x).equals("Age")||data.get(x).equals("ID")){
                bww.write(data.get(x));
                u=1;
                bww.write("\n");
            }
            if(data.get(x).equals("Gender")){
                bww.write(data.get(x));
                u=1;
                bww.write("\n\n");}
            
            if(data.get(x).equals("")){
               u = 1;
            }
            if(u!=1){
                bww.write(data.get(x));
                bww.write(":");
            }
        }
        bww.close();
    }
    
}
    
