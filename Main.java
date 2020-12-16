public class Main {
   
    public static void main(String[] args) {
        String role = "admin";

        switch (role) {
            case "admin":
            System.out.println("you're an admin");
            break;
            case "moderator":
            System.out.println("youre a moderator");
            default:
            System.out.println("you're a guest");
        }

     
      
    } 
}
