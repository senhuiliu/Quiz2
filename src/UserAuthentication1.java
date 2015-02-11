import java.util.Scanner;

public class UserAuthentication1 {
   public static String correctUsername = "senhui";
   public static String correctPassword = "12345";
   public static String username;
   public static String password;

   public static void main(String[] args) {
	   Scanner kbd = new Scanner(System.in);
	   System.out.println("Enter username");
	   username = kbd.nextLine();
           System.out.println( "enter password");
           password = kbd.nextLine();
	   
	   authenciation(username, password);
		  System.out.println("Welcome " + username);
	   //else
		   //System.out.println("Wrong Username Or Password");
   }

   
   public static boolean authenciation(String username, String password){
       //authentication
       boolean status = false;
       if (username.equalsIgnoreCase(correctUsername)){
           if (password.equals(correctPassword)){
               //System.out.println("Welcome " + correctUsername);
               status  = true;
           }else{
               status = false;
               //System.out.println("Wrong password!");
           }return status;
       }else{
           status = false;
           //System.out.println("Wrong username!");
       }
       return false;
   }
}
