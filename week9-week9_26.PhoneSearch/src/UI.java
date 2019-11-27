
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UI {

    private final Scanner reader;
    private final Phonebook pb;

    public UI() {
        this.reader = new Scanner(System.in);
        pb = new Phonebook();
    }

    public void start() {
        System.out.println("phone search\n"
                + "available operations:\n"
                + " 1 add a number\n"
                + " 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit");

        while (true) {
            System.out.print("\ncommand: ");
            String input = reader.nextLine();
            if (input.equals("x")) {
                break;
            }
            handleInput(input);
        }
    }

    private void handleInput(String input) {
        if (input.equals("1")) {
            System.out.print("whose number: ");
            String name = reader.nextLine();
            System.out.print("number: ");
            pb.addNumber(name, reader.nextLine());
        }
        if (input.equals("2")) {
            System.out.print("whose number: ");
            Set<String> numbers = pb.searchForNumbers(reader.nextLine());
            if (numbers == null) {
                System.out.println("  not found");
                return;
            }
            for (String number : numbers) {
                System.out.println(" " + number);
            }
        }
        if (input.equals("3")) {
            System.out.print("number: ");
            String number = reader.nextLine();
            String name = pb.searchForNameByNumber(number);
            if (name == null) {
                System.out.println(" not found");
            } else {
                System.out.println(" " + name);
            }
        }
        if (input.equals("4")) {
            System.out.print("whose address: ");
            String name = reader.nextLine();
            System.out.print("street: ");
            String address = reader.nextLine();
            System.out.print("city: ");
            address += " " + reader.nextLine();
            pb.addAddress(name, address);
        }
        if (input.equals("5")) {
            System.out.print("whose information: ");
            String name = reader.nextLine();
            if (!pb.getNumbersMap().keySet().contains(name)
                    && !pb.getAddressMap().keySet().contains(name)) {
                System.out.println("  not found");
            } else {
                Set<String> addresses = pb.searchForAddress(name);
                if (addresses == null) {
                    System.out.println("  address unknown");
                } else {
                    System.out.print("  address: ");
                    for (String address : addresses) {
                        System.out.println(address);
                    }
                }
                Set<String> setOfNumbers = pb.searchForNumbers(name);
                if (setOfNumbers == null) {
                    System.out.println("  phone number not found");
                } else {
                    System.out.println("  phone numbers:");
                    for (String number : setOfNumbers) {
                        System.out.println("   " + number);
                    }
                }
            }
        }
        if (input.equals("6")) {
            System.out.print("whose information: ");
            pb.delete(reader.nextLine());
        }
        if (input.equals("7")) {
            System.out.print("keyword (if empty, all listed): ");
            String filter = reader.nextLine();
            List<String> filteredNames = pb.filteredList(filter);
            Collections.sort(filteredNames);
            if (filteredNames.isEmpty()) {
                System.out.println(" keyword not found");
            } else {
                for (String filteredName : filteredNames) {
                    // print NAME
                    System.out.println(" " + filteredName);
                    // Print ADDRESSES
                    Set<String> addresses = pb.searchForAddress(filteredName);
                    if (addresses == null) {
                        System.out.println("  address unknown");
                    } else {
                        System.out.print("  address: ");
                        for (String address : addresses) {
                            System.out.println(address);
                        }
                    }
                    // print PHONE NUMBERS
                    Set<String> setOfNumbers = pb.searchForNumbers(filteredName);
                    if (setOfNumbers == null) {
                        System.out.println("  phone number not found");
                    } else {
                        System.out.println("  phone numbers:");
                        for (String number : setOfNumbers) {
                            System.out.println("   " + number);
                        }
                    }
                }
            }
        }
    }
}
