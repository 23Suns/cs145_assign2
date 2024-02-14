/**
 * Name: Joshua Henderson
 * Date: February 12, 2024
 * Project: Phonebook Program
 * Purpose: This file defines the ListNode class, which represents a single node in the linked list structure
 *          used to store phonebook entries. Each node contains fields for first name, last name, address,
 *          city, phone number, and a reference to the next node in the list.
 */

public class ListNode {
    String firstName;
    String lastName;
    String address;
    String city;
    String phoneNumber;
    ListNode next;

    public ListNode (
        String firstName, String lastName, String address,
        String city, String phoneNumber
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.next = null;
    }
}