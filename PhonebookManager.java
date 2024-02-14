/**
 * Name: Joshua Henderson
 * Date: February 12, 2023
 * Project: Phonebook Program
 * Purpose: This file defines the PhonebookManager class, which manages the phonebook linked list structure.
 *          It provides methods to add entries at the beginning or at a specific index, delete entries based
 *          on index, and print all entries in the phonebook.
 */

 public class PhonebookManager {
    private ListNode head;
    
    public PhonebookManager () {
        head = null;
    }

    public void addEntry (String firstName, String lastName, String address, String city, String phoneNumber) {
        // intialize the linked list head
        ListNode newNode = new ListNode(firstName, lastName, address, city, phoneNumber);
        
        //append new list item
        newNode.next = head;
        head = newNode;
    }

    public void addEntryAtIndex (int index, String firstName, String lastName, String address, String city, String phoneNumber) {
        // add to an empty list
        if (index == 0) {
            addEntry(firstName, lastName, address, city, phoneNumber);
            return;
        }
        
        // adding to an existing list, checks for open entry
        ListNode current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Invalid index");
            return;
        }

        //point next index to new node
        ListNode newNode = new ListNode(firstName, lastName, address, city, phoneNumber);
        newNode.next = current.next;
        current.next = newNode;
    }

    public void deleteEntry(int index) {
        //"shorten" the list by pointing the head at the next index
        if (index == 0) {
            head = head.next;
            return;
        }

        // remove selected index by pointing to the next over the current
        ListNode current = head;
        for (int i = 0; i < index - 1 && current != null) {
            current = current.next
        }
        if (current == null || current.next == null) {
            System.out.println("Invalid index");
            return;
        }

        current.next = current.next.next;
    }

    public void printEntries () {
        ListNode current = head;
        while (current != null) {
            System.out.println("First Name: " + current.firstName);
            System.out.println("Last Name: " + current.lastName);
            System.out.println("Address: " + current.address);
            System.out.println("City: " + current.city);
            System.out.println("Phone Number: " + current.phoneNumber);
            System.out.println();
            current = current.next;
        }
    }
 }