package exceptions;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import exceptions.dao.UserDao;
import exceptions.exception.EmptyStorageException;
import exceptions.exception.UserNotFindException;
import exceptions.model.UserModel;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    private final static UserDao dao = new UserDao();

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("\nWelcome to the user registration process; please select the desired option.");
                System.out.println("1 - Sign up");
                System.out.println("2 - Update");
                System.out.println("3 - Exclude");
                System.out.println("4 - Find by ID");
                System.out.println("5 - List");
                System.out.println("6 - Exit");

                var userInput = scanner.nextInt();
                scanner.nextLine();

                if (userInput < 1 || userInput > 6) {
                    System.out.println("Invalid option. Please choose between 1 and 6.");
                    continue;
                }

                var selectedOption = MenuOption.values()[userInput - 1];

                switch (selectedOption) {
                    case SAVE -> {
                        UserModel saved = dao.save(requestToSave());
                        System.out.println("User registered successfully! Assigned ID: " + saved.getId());
                    }
                    case UPDATE -> {
                        try{
                        dao.update(requestetoUpdate());
                        System.out.println("User updated successfully!");
                    }catch(UserNotFindException | EmptyStorageException ex ){
                        System.out.println(ex.getMessage());
                    }
                    }
                    case DELETE -> {
                        try{
                        dao.delete(requestId());
                        System.out.println("User deleted successfully!");
                    }catch(UserNotFindException | EmptyStorageException ex ){
                        System.out.println(ex.getMessage());
                    }
                    }
                    case FIND_BY_ID -> {
                        try{
                        UserModel user = dao.findById(requestId());
                        var id = requestId();
                        System.out.println("User ID: " + id);
                        System.out.println(user);
                    }catch(UserNotFindException | EmptyStorageException ex ){
                        System.out.println(ex.getMessage());
                    }finally{
                        System.out.println("========================");
                    }
                    }
                    case FIND_ALL -> {
                        var allUsers = dao.findAll();
                        if (allUsers.isEmpty()) {
                            System.out.println("No users registered yet.");
                        } else {
                            System.out.println("--- Registered Users ---");
                            allUsers.forEach(System.out::println);
                        }
                    }
                    case EXIT -> {
                        System.out.println("Exiting system. Goodbye!");
                        System.exit(0);
                    }
                }
            } catch (UserNotFindException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (DateTimeParseException e) {
                System.out.println("Error: Invalid date format. Please use dd/MM/yyyy.");
            } catch (Exception e) {
                System.out.println("An unexpected error occurred. Restarting menu option.");
                scanner.nextLine(); 
            }
        }
    }

    private static UserModel requestToSave() {
        System.out.println("Enter the username.");
        String name = scanner.nextLine();
        System.out.println("Enter the email.");
        String email = scanner.nextLine();
        System.out.println("Enter the birthday. (dd/MM/yyyy)");
        String birthdayString = scanner.nextLine();

        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var birthday = LocalDate.parse(birthdayString, formatter).atStartOfDay().atOffset(ZoneOffset.UTC);

        var user =  new UserModel(0, name, email, birthday);
        VerifyModel(user);
        return validateInput(0, name, email, birthday);
    }
    private static UserModel validateInput(final long id, final String name,
                            final String email, final OffsetDateTime birthday){
        var user = new UserModel(id, name, email, birthday);
        VerifyModel(user);
        return user;
    }

    private static void VerifyModel(UserModel user) {
        throw new UnsupportedOperationException("Unimplemented method 'VerifyModel'");
    }

    private static UserModel requestetoUpdate() {
        long id = requestId();
        System.out.println("Enter the new username.");
        String name = scanner.nextLine();
        System.out.println("Enter the new email.");
        String email = scanner.nextLine();
        System.out.println("Enter the new birthday. (dd/MM/yyyy)");
        String birthdayString = scanner.nextLine();

        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var birthday = LocalDate.parse(birthdayString, formatter).atStartOfDay().atOffset(ZoneOffset.UTC);

        return validateInput(0, name, email, birthday);
    }

    private static long requestId() {
        System.out.println("Enter the User ID:");
        long id = scanner.nextLong();
        scanner.nextLine();
        return id;
    }

    
}
