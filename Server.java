import java.net.*;
import java.io.*;


class Server
{
   public static void main(String A[]) throws Exception
   {
       System.out.print("Server process is running...\n");

       ServerSocket ssobj = new ServerSocket(2103);
       System.out.print("Server is waiting for Client port number 2103\n");


       Socket sobj = ssobj.accept();  
       System.out.print("Connection established with the Client\n");

       PrintStream ps = new PrintStream(sobj.getOutputStream());

       BufferedReader br1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
       BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

       String str1 , str2;
       System.out.println("Marvellous chat application started ..");
       while((str1 = br1.readLine()) != null)
       {
        System.out.println("Clients says : "+str1);
        System.out.println("Enter message for client : ");
        str2 = br2.readLine();
        ps.println(str2);
        
       }
       System.out.println("Thank you marvellous..");
   }
}