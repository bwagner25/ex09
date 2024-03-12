public class Main {
    public static void main(String[] args) {
        Phone john = new Phone("John",1234567890);
        Email otherJohn = new Email("Other John","john@johnmail.john");
        john.contact();
        otherJohn.contact();
    }
}

abstract class Contact{
    private String name;

    public Contact(String name) {
        this.name = name;
    }

    abstract public void contact();
}

class Email extends Contact{
    private String email;

    public Email(String name, String email) {
        super(name);
        this.email = email;
    }

    @Override
    public void contact() {
        System.out.println("Emailing "+email+"...");
    }
}

class Phone extends Contact{
    private int phoneNumber;

    public Phone(String name, int phoneNumber) {
        super(name);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void contact() {
        System.out.println("Calling "+phoneNumber+"...");
    }
}