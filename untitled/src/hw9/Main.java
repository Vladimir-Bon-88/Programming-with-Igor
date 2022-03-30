package hw9;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Petrov", "1111");
        phoneBook.add("Sidorov", "2222");
        phoneBook.add("Vasichkin", "3333");
        phoneBook.add("Sidorov", "2223");
        phoneBook.add("Erokhin", "4444");

        phoneBook.showInformation();
        phoneBook.get("Petrov");
        phoneBook.get("Sidorov");

    }
}
