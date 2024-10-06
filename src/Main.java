//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");
// Print "Hello"\n Then print "Goodbye"\n And finally return.\n //

// Get user input
        /* Get user input */
        char[] streetAddress = new char[20];
        String address = "123 Elm St.012345678";
        for(int i = 0; i < address.length(); i++){
            streetAddress[i] = address.charAt(i);
        }

        for(int i = 0; i < address.length(); i++){
            System.out.print(streetAddress[i]);
        }
    }
}