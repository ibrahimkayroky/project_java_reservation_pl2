
package room.manegement.com.kayroky;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.swing.JOptionPane;

public class ROOMMANEGEMENT extends room{

    
    public static void room_manegement() throws IOException{

     File file = new File("customer.txt");
        new File("roomm.txt");
     BufferedWriter r1 = new BufferedWriter(new FileWriter("roomm.txt",true));
     File file0 = new File("addroom.txt");
     BufferedWriter o = new BufferedWriter(new FileWriter("customer.txt",true));
     Scanner input = new Scanner(System.in);
     while(true){
     String qq1;
     ArrayList<String> qqr=new ArrayList<>();
     int jj=0;
     int h=0;
         String ee="";
        boolean try11=true;
            do {     
                try {
               System.out.println("Please Enter ID Customer\n ");
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
                    for (String s : rom1) {
                        if (s.equalsIgnoreCase(ee)) {
                            r1.append(ee).append(":ID\n");
                            try11 = false;
                        }
                    }

        } catch (InputMismatchException e) {
                    System.out.println("The Input Invalid");
            input.nextLine();}
            } while (try11);
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
             while(true){
                 String nu="";
                 String numr="";
                 boolean le =true;
                 Scanner qq = new Scanner(file0);
                 do {                     
                     try {
                          System.out.println("Enter The RoomNo");
                         int num = input.nextInt();
                        numr =String.valueOf(num);
                         qq.useDelimiter("[\r\n:]");

                         while(qq.hasNext())
                         {
                             qq1=qq.next();
                             qqr.add(qq1);
                         }
                         int uu=0;
                           for (int a =0 ; a< qqr.size() ; a++)
                             {
                                 if (qqr.get(a).equalsIgnoreCase(numr)) 
                                 {
                                 jj=1;
                                  uu=a+4;
                                 nu=qqr.get(a+6);
                                 h=1;
                                 }
                             } 
                           
                             if(qqr.get(uu).equalsIgnoreCase("avaliable")&&h==1){
                                     qqr.remove(uu);
                                     qqr.add(uu,"unavaliable");
                                     writer("addroom.txt", qqr);
                                     le=false;
                               }
                           
                     } catch (InputMismatchException e) {
                         System.out.println("The Input Invalid");
                         input.nextLine();
                     }
                 } while (le);
                 
             if(jj==1){
                 System.out.println("The ID Room Is Found !");
                 r1.append(numr).append(":RoomNo\n");
                  GregorianCalendar calender = new GregorianCalendar();
                       int day= calender.get(Calendar.DAY_OF_MONTH);
                       int year= calender.get(Calendar.YEAR);
                       int month =calender.get(Calendar.MONTH);
                       System.out.println("The Time Is :" + day +"/"+(month+1)+"/"+year);
                       r1.append(String.valueOf(day)).append("-").append(String.valueOf(month + 1)).append("-").append(String.valueOf(year)).append(":IN\n");

                       System.out.println("How Many Nights ???");
                       int cc=0;
                       boolean pop=true;
                       do {    
                           
                            try {
                           cc=input.nextInt();
                           pop=false;
                        } 
                       catch (InputMismatchException e)
                       {
                           System.out.println("The Input Is Invalid\n");
                           input.nextLine();
                        }
                     
                 } while (pop);

                       int leave =day+cc;
                       System.out.println("The Time For Leave Is : " +leave+"/"+(month+1)+"/"+year);
                       r1.append(String.valueOf(leave)).append("-").append(String.valueOf(month + 1)).append("-").append(String.valueOf(year)).append(":OUT\n");
                       int pl =Integer.parseInt(nu);
                       int st = pl*cc;
                       String str =String.valueOf(st);
                       System.out.println("The Total Cost Is "+str);
                       r1.append(str).append(":Cost\n\n");
                 break;

             }
             else
             System.out.println("This Room Is Unavaliable , Please Enter Another Room ");
             }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
             int w=0;
          System.out.println("""
                  If You Are Assign Room To Guest Enter (  1  )\s
                  If Not Enter (  2  )


                  """);
              
            
                   int g;
                      do {             
                         try {
                            g=input.nextInt();       
                                if (g==1) {
                                    w=1;
                                    break;
                                }
                                else if(g==2){
                                break;
                            }
                                else{
                                 System.out.println("The Input Invalid");
                                }

                        } catch (InputMismatchException exx) {
                           System.out.println("The Input Invalid");

                           input.nextLine();}
                                   } while (true);
                        
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   if(w==1){
                       
       while(true){
                           
       System.out.println("Please Enter ID Guest\n ");
    
       while(true){
            int xx=0;
       String eee="";
        boolean try111=true;
            do {                
                try {
                    int e=input.nextInt();
               eee=String.valueOf(e);
               ArrayList<String> rom1=new ArrayList<>();
               Scanner rom = new Scanner(file);
               String rom2;
               rom.useDelimiter("[\r\n:]");
                while(rom.hasNext())
             {
                 rom2=rom.next();
                 rom1.add(rom2);

             }
                    for (String s : rom1) {
                        if (s.equalsIgnoreCase(eee)) {
                            xx = 1;
                            break;
                        }
                    }
                try111=false;
            
        } catch (InputMismatchException e) {
                    System.out.println("The Input Invalid");
            input.nextLine();}
            } while (try111);
            if(xx==1){
                System.out.println("\nThe ID  Is Found , Please Enter Another ID \n");
            }
            else{
                o.append(eee).append(":ID\n");
                r1.append(eee).append(":ID\n");
                break;
            }
       }
                       
                       
                       
                   System.out.println("Please Enter your name \n ");
                   String a = input.next();
                   o.append(a).append(":Name\n");
                   
                   System.out.println("Please Enter your age \n "); 
                    boolean try0=true;
                        do {                
                            try {
                           int bb=input.nextInt();
                           String bbb=String.valueOf(bb);
                           o.append(bbb).append(":Age\n");
                           try0=false;

                    } catch (InputMismatchException e) {

                        System.out.println("The Input Invalid");
                        input.nextLine();}
                        } while (try0);
                       
                    System.out.println("Please Select [ Male / Female ] \n ");
                    try {
                        String c = input.next();
                        do {         
                            if (c.equalsIgnoreCase("male")||c.equalsIgnoreCase("female")) {
                            o.append(c).append(":Gender\n\n");
                            break;
                            }
                            else{
                            System.out.println("The Input is Invalid\n\n");
                            c=input.next();
                        }
                        } while (true);

                    } catch (InputMismatchException e) {

                        input.next();}
                  
                 boolean go=true;
                 String ids="";
                 String nu1="";
                 int uu=0;
                     do {                         
                         try {
                              System.out.println("Enter The RoomNo");
                             Scanner qq = new Scanner(file0);
                             qqr=new ArrayList<>();
                             int ID = input.nextInt();
                             ids =String.valueOf(ID);
                             qq.useDelimiter("[\r\n:]");

                             while(qq.hasNext())
                             {
                                 qq1=qq.next();
                                 qqr.add(qq1);

                             }
                               for (int ff =0 ; ff< qqr.size() ; ff++)
                                 {
                                     if (qqr.get(ff).equalsIgnoreCase(ids)) 
                                     {
                                         uu=ff+4;
                                     nu1=qqr.get(ff+6);
                                     }
                                 }  
                               if(qqr.get(uu).equalsIgnoreCase("avaliable")){
                                     qqr.remove(uu);
                                     qqr.add(uu,"unavaliable");
                                     writer("addroom.txt", qqr);
                                     go=false;
                                     
                               }
                         } catch (InputMismatchException e) {
                             System.out.println("The Input Invalid\n\n");
                         }
                     } while (go);


                 
                     System.out.println("The ID Room Is Found !\n\n");
                     r1.append(ids).append(":RoomNo\n");
                      GregorianCalendar calender = new GregorianCalendar();
                           int day= calender.get(Calendar.DAY_OF_MONTH);
                           int year= calender.get(Calendar.YEAR);
                           int month =calender.get(Calendar.MONTH);
                           System.out.println("The Time Is :" + day +"/"+(month+1)+"/"+year);
                           r1.append(String.valueOf(day)).append("-");
                           r1.append(String.valueOf(month + 1)).append("-");
                           r1.append(String.valueOf(year)).append(":IN\n");
                           System.out.println("How Many Nights ???\n\n");
                           int cc=0;
                           boolean ccc=true;
                           do {                         
                               try {
                               cc=input.nextInt();
                               ccc=false;
                            } 
                           catch (InputMismatchException e)
                           {
                               System.out.println("The Input Is Invalid\n\n");
                               input.nextLine();
                            }
                              } while (ccc);
                           
                           int leave =day+cc;
                           System.out.println("The Time For Leave Is : " +leave+"/"+(month+1)+"/"+year);
                           r1.append(String.valueOf(day)).append("-");
                           r1.append(String.valueOf(month + 1)).append("-");
                           r1.append(String.valueOf(year)).append(":OUT\n");
                           int p2 =Integer.parseInt(nu1);
                           int st1 = p2*cc;
                           String str1 =String.valueOf(st1);
                           System.out.println("The Total Cost Is "+str1);
                           r1.append(str1).append(":Cost\n\n");
                     
                 
 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                   System.out.print("""
                           IF YOU ARE ENTER ANOTHER GUEST (  1  )\s
                            TO CONTINUE ENTER (  2  )

                           """);
                 boolean try1=true;
                 int yu=0;
                    do {                
                         try {
                       int ggg=input.nextInt();  
                        if (ggg==1) {
                           try1=false;
                                  }
                        else if(ggg==2){
                          try1=false;
                          yu=ggg;
                            }
                        else{
                            System.out.println("The Input Invalid");
                        }

                } catch (InputMismatchException e) {
                        System.out.println("The Input Invalid");
                   input.nextLine();}

                    } while (try1);
                    if(yu==2){
                        break;
                    }
                   }
                 }
   /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                 System.out.print("""
                         IF YOU ARE CONTINOUS ENTER (  1  )\s
                         IF YOU ARE END THE PROJECT ENTER (  2  )

                         """);
                 boolean try1=true;
                    do {                

                         try {
                        int gg=input.nextInt();  
                        if (gg==1) {
                           try1=false;
                                  }
                        else if(gg==2){
                           r1.close();
                           o.close();
                          System.exit(0);
                            }
                        else{
                            System.out.println("The Input Invalid");
                        }

                } catch (InputMismatchException e) {
                         System.out.println("The Input Invalid");
                   input.nextLine();}

                    } while (try1);
                            
                }
    }
    
    public static void view() throws FileNotFoundException{
        Scanner input = new Scanner(System.in);
        File file1 = new File("roomm.txt");
       System.out.println("Please Enter ID Customer\n ");
       int x=0;
       String ee;
       while(true){
        boolean try11=true;
            do {                
                try {
                    int e=input.nextInt();
               ee=String.valueOf(e);
               ArrayList<String> rom1=new ArrayList<>();
               Scanner rom = new Scanner(file1);
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
                     System.out.println("The ID Customer Is  "+rom1.get(y)+"\n");
                     System.out.println("The RoomNo Is  "+rom1.get(y+2)+"\n");
                     System.out.println("The CheckIn is ["+rom1.get(y+4)+"]\n");
                     System.out.println("The CheckOut is ["+rom1.get(y+6)+"]\n");
                     System.out.println("The Total Cost Is  "+rom1.get(y+8)+"\n");
                     x=1;
                       break;
                     }
                 }
               try11=false;
            
        } catch (InputMismatchException e) {
            input.nextLine();}
            } while (try11);
            if(x==1){
                break;
            }
            else{
                System.out.println("\nThe ID  Is Found , Please Enter Another ID \n");
            }
       }
    }
    
    
     public static void writer(String name ,ArrayList<String>data) throws IOException{
        
        FileWriter fww = new FileWriter(name);
        BufferedWriter bww = new BufferedWriter(fww);
         for (String datum : data) {
             int u = 0;
             if (datum.equals("RoomNo") || datum.equals("TypeRoom") || datum.equals("CaseOfRoom")) {
                 bww.write(datum);
                 u = 1;
                 bww.write("\n");
             }
             if (datum.equals("Cost")) {
                 bww.write(datum);
                 u = 1;
                 bww.write("\n\n");
             }

             if (datum.equals("")) {
                 u = 1;
             }
             if (u != 1) {
                 bww.write(datum);
                 bww.write(":");
             }
         }
        bww.close();
    }
    
                   
}

    
