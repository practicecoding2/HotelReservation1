import java.util.Scanner;
import java.util.UUID;


public class CreateAccount<JSONObject> {
    private String email, phone, location;

    public CreateAccount() {
    }

    public CreateAccount(String email, String phone, String location) {
        this.email = email;
        this.phone = phone;
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user email: ");
        email = sc.nextLine();

        System.out.println("Enter phone number: ");
        phone = sc.nextLine();
        System.out.println("Enter location: ");
        location = sc.nextLine();

    }
    private static String createNewAccount(Scanner scanner) {
        System.out.println("You don't have an account. Let's create one.");


        String newAccountNumber = "acc_" + UUID.randomUUID().toString();



        System.out.println("Account created successfully. Your new account number is: " + newAccountNumber);
        return newAccountNumber;
    }

public void WriteToFile(String filename)
    {

        String jsonObject = null;
        jsonObject.equals("Email");
        jsonObject.equals("Phone");
        jsonObject.equals("Location");



    }

}