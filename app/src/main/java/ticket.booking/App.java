package ticket.booking;
import java.io.IOException;
import java.util.*;

public class App{

    public static void main(String[] args) {
        System.out.printn("Running Train Booking System");
        Scanner scanner = new Scanner(System.in);
    }

    int option = 0;
    UserBookingService userBookingService;
    
    try{
        UserBookingService = new UserBookingService();
    }catch(IOException ex){
        System.out.println("There is something wrong");
        return;
    }

    while(option != 7){
        System.out.println("Choose option");
        System.out.println("1.Sign up");
        System.out.println("2.Login");
        System.out.println("3.Fetch Bookings");
        System.out.println("4.Search Trains");
        System.out.println("5.Book a Seat");
        System.out.println("6.Cancel my booking");
        System.out.println("7.Exit the App");

        option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Enter your username to signup");
                String nameToSignUp = scanner.next();
                System.out.println("Enter the password to sign up");
                String passwordToSignUp = scanner.next();
                User userToSignup = new User(nameToSignUp,passwordToSignUp,UserServiceUtil.hashPassword(passwordToSignUp),new ArrayList<>(),UUID.randomUUID().toString());
                userBookingService.signUp(userToSignup);
                break;
            case 2:
                System.out.println("Enter your username to login");
                String nameToLogin = scanner.next();
                System.out.println("Enter the password to login");
                String passwordToLogin = scanner.next();
                User userToLogin = new User(nameToLogin,passwordToLogin,UserServiceUtil.hashPassword(passwordToLogin),new ArrayList<>(),UUID.randomUUID().toString());
                try{
                    UserBookingService = UserBookingService(userToLogin);
                }catch(IOException ex){
                    return;
                }
                break;
            case 3:
                System.out.println("Fetching your bookings");
                UserBookingService.fetchBooking();
                break;
            case 4:
                
            default:
                break;
        }
    }







}
