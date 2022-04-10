package phonebook;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add();
        phonebook.add();
        phonebook.add();
        System.out.println(phonebook.find("Cheran Denys"));
        System.out.println(phonebook.findAll("Cheran Denys"));
    }
}