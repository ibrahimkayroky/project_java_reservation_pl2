
package room.manegement.com.kayroky;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class room {
    
    
    public static void add_room() throws IOException{
        boolean z;
        while (z = true) {            
       File file = new File("addroom.txt");
       BufferedWriter o = new BufferedWriter(new FileWriter("addroom.txt",true));
       Scanner input = new  Scanner(System.in);
       
       System.out.println("Please Enter ID Room \n ");
       int x=0;
       String aa="";
       while(true){
        boolean try0=true;
            do {                
                try {
               x=0;
               int a=input.nextInt();
               aa=String.valueOf(a);
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
                     if (rom1.get(y).equalsIgnoreCase(aa)) 
                     {
                       x=1;
                     }
                 }
               try0=false;
            
        } catch (InputMismatchException e) {
            input.nextLine();}
            } while (try0);
            
            if(x==1){
                System.out.println("\nThe ID Room Is Found , Please Enter Another ID Room\n");
                continue;
            }
            else{
                o.append(aa+":RoomNo\n");
                break;
            }
       }
       
       System.out.println("Please Select Type Room [ Single / Double / Family ] \n ");
                    try {
                        
                        String y = input.next();
                        do { 
                            
                            if (y.equalsIgnoreCase("Single")||y.equalsIgnoreCase("Double")||y.equalsIgnoreCase("Family"))
                            {
                            o.append(y +":TypeRoom\n");
                            break;
                            }
                            
                            else
                            {
                            System.out.println("The Input is Invalid");
                            y=input.next();
                            } 
                            
                        }
                        while (true);

                    } 
                    catch (InputMismatchException e) 
                    {

                        input.nextLine();
                    }
        System.out.println("Please Select [ Avaliable / Unavaliable ] \n ");
        try {
            String c = input.next();
            do {         
                if (c.equalsIgnoreCase("Avaliable")||c.equalsIgnoreCase("Unavaliable")) {
                o.append(c +":CaseOfRoom\n");
                break;
                }
                else{
                System.out.println("The Input is Invalid");
                c=input.next();
            }
            } while (true);
            
        } catch (InputMismatchException e) {
            
            input.next();}
        
        System.out.println("Please Enter The Cost \n ");
        boolean try8=true;
            do {                
                try {
               int q=input.nextInt();
               String qq=String.valueOf(q);
               o.append(qq+":Cost\n\n");
               try8=false;
            
        } catch (InputMismatchException e) {
            input.nextLine();}
            } while (try8);
        
        
            o.close();
            
                    System.out.println("IF YOU ARE ADD ANOTHER ROOM(  1  ) /n"
                + "IF YOU ARE END THE PAGE ENTER (  2  )");
        try {
            int g=input.nextInt();
            do {         
                if (g==1) {
                    break;
                }
                else{
                System.exit(0);
            }
            } while (true);
            
        } catch (InputMismatchException e) {
        
           input.nextLine();       
}
    }
    }
    
    public static void updata_room() throws FileNotFoundException, IOException{
  
         File file3 = new File("addroom.txt");
         String mm1;
         boolean ho;
         int j=0;
         Scanner input = new Scanner(System.in);
         System.out.println("Enter ID To Find The Room");
         
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
                 
                 System.out.println("Please Select [ Single / Double / Family ] \n ");
                    try {
                        
                        String newtype = input.next();
                        do { 
                            
                            if (newtype.equalsIgnoreCase("single")||newtype.equalsIgnoreCase("double")||newtype.equalsIgnoreCase("family"))
                            {
                            yyr.remove(a+2);
                            yyr.add(a+2,newtype);
                            break;
                            }
                            
                            else
                            {
                            System.out.println("The Input is Invalid");
                            newtype=input.next();
                            } 
                            
                        }
                        while (true);

                    } 
                    catch (InputMismatchException e) 
                    {
                        System.out.println("The Input is Invalid");
                        input.nextLine();
                   
                    }
                     
                 System.out.println("Please Select [ Avaliable / Unavaliable ] \n ");
                    try {
                        
                        String newcase = input.next();
                        do { 
                            
                            if (newcase.equalsIgnoreCase("avaliable")||newcase.equalsIgnoreCase("unavaliable"))
                            {
                            yyr.remove(a+4);
                            yyr.add(a+4,newcase);
                            break;
                            }
                            
                            else
                            {
                            System.out.println("The Input is Invalid");
                            newcase=input.next();
                            } 
                            
                        }
                        while (true);

                    } 
                    catch (InputMismatchException e) 
                    {
                        System.out.println("The Input is Invalid");
                        input.nextLine();
                   
                    }
                    
                 yyr.remove(a+6);
                 System.out.println(" Enter New Cost \n ");
                 boolean try4=true;
                     do {                         
                         try {
                         int newcost = input.nextInt();
                         String newcost1=String.valueOf(newcost);
                         yyr.add(a+6,newcost1);
                         try4=false;
                     } catch (InputMismatchException e) {
                         System.out.println("The Input Invalid");
                         input.nextLine();
                     }
                     } while (try4);
                    
                 writer("addroom.txt", yyr);
                 break;
                
                 }
             }
          if(j==1){
             System.out.println(" Room Is Updata\n\n");
             
                 System.out.print("IF YOU ARE CONTINOUS ENTER (  1  ) \n"
                    + "IF YOU ARE END THE PROJECT ENTER (  2  )");
             boolean try1=true;
                do {                

                     try {
                    int g=input.nextInt();  
                    if (g==1) {
                       System.out.println("Enter ID To Find The Room");
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
         System.out.println(" Room Is Not Found");
         continue;}
         
         }
    }
    
     public static void delete_room() throws FileNotFoundException, IOException{
  
         File file3 = new File("addroom.txt");
         String mm1;
         boolean ho;
         int j=0;
         Scanner input = new Scanner(System.in);
         System.out.println("Enter ID Room");
         while(ho=true){
         Scanner qq = new Scanner(file3);
         ArrayList<String> yyr=new ArrayList<>();
         String emp = input.next();
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
                 yyr.remove(a);
                 yyr.remove(a);
                 yyr.remove(a);
                 yyr.remove(a);
                 yyr.remove(a);
                 yyr.remove(a);
                 yyr.remove(a);
                 writer("addroom.txt", yyr);
                 break;
                
                 }
             }
          if(j==1){
             System.out.println(" This Room Is Deleted\n\n");
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
                            System.out.println("The Input Invalid");;
                        }

                } catch (InputMismatchException e) {

                   input.nextLine();}

                    } while (try1);  
         }
         else
         System.out.println("This Room Is Not Deleted\n\n");
         continue;
         }
    }
     public static void writer(String name ,ArrayList<String>data) throws IOException{
        
        FileWriter fww = new FileWriter(new File(name));
        BufferedWriter bww = new BufferedWriter(fww);
        for(int x=0;x<data.size();x++){
            int u=0;
            if(data.get(x).equals("RoomNo")||data.get(x).equals("TypeRoom")||data.get(x).equals("CaseOfRoom")){
                bww.write(data.get(x));
                u=1;
                bww.write("\n");
            }
            if(data.get(x).equals("Cost")){
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
    
