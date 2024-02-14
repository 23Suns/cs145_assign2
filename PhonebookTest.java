/**
 * Name: Joshua Henderson
 * Date: February 12, 2023
 * Project: Phonebook Program
 * Purpose: This file defines the PhoneBookTest class, which contains the main method and serves as a testing
 *          and demonstration platform for the functionality of the PhonebookManager class. It creates
 *          a phonebook object, adds entries, deletes entries, and prints the entries to showcase the
 *          program's capabilities.
 */

 public class PhonebookTest {
    public static void main(String[] args) {
        PhonebookManager phonebook = new PhonebookManager();
        
        //adding entries
        phonebook.addEntry("John", "Smith", "456 Cedar Rd", "Citytown", "123-4567");
        phonebook.addEntry("Jane", "Smith", "453 Oak St", "Towncity", "765-4321");
        //adding entries at index
        phonebook.addEntryAtIndex(1, "Seth", "Smith", "373 Vine Ave", "909-8081");

        // print index
        phonebook.printEntries();

        // delete index
        phonebook.deleteEntry(1);

        // print new linked list
        System.out.println("Deleting entry at index 1...");
        phonebook.printEntries();
    }
 }