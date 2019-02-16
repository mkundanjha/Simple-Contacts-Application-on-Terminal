import java.util.Scanner;

public class MobilePhone {
    private static Scanner scanner = new Scanner(System.in);
    public static Contacts contacts = new Contacts();


    public static void main(String[] args) {
        int choice = 0;
        boolean quit = true;
        instruction();

        while (quit) {
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    instruction();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    removeItem();
                    break;
                case 4:
                    getitem();
                    break;
                case 5:
                    modify();
                    break;
                case 6:
                    quit = false;
                    break;
            }
        }
    }



    private static void instruction(){
        System.out.println("Press for respected function:");
        System.out.println("1. To view instruction");
        System.out.println("2. To Add contacts");
        System.out.println("3. To Remove contacts");
        System.out.println("4. To View contacts");
        System.out.println("5. To Modify existing contacts");
        System.out.println("6. To Quit");
    }
    private static void add(){
        System.out.println("Enter the Contact name you want to add:");
        String data=scanner.nextLine();
        //2scanner.nextLine();
        System.out.println("Enter the phone number:");
        String num=scanner.nextLine();
        contacts.addContacts(data,num);
    }
    private static void removeItem(){
        System.out.println("Enter the Contact you want to remove");
        String item=scanner.nextLine();
        contacts.removeContacts(item);
    }
    private static void getitem(){
        contacts.getContact();
    }
    private static void modify(){
        System.out.println("Enter the Contact you want to change:");
        String item=scanner.nextLine();
        System.out.println("Enter the phone no:");
        String num=scanner.nextLine();
        contacts.modifyNumber(item,num);
    }

}