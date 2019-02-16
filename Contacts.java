import java.util.ArrayList;

public class Contacts {
    private ArrayList<String> contactList=new ArrayList<>();
    private ArrayList<String> phoneNumber=new ArrayList<>();

    public void addContacts(String data, String num){
        contactList.add(data);
        phoneNumber.add(num);
    }

    public void getContact(){
        System.out.println("You have "+contactList.size()+" contacts saved. ");
        for(int i=0;i<contactList.size();i++){
            System.out.println(i+1+". "+contactList.get(i)+" - "+phoneNumber.get(i));
        }
    }
    public int searchContacts(String item){
        int position=contactList.indexOf(item);
        return position;
    }
    public void removeContacts(String item){
        int index=searchContacts(item);
        if(index>0) {
            contactList.remove(index);
            phoneNumber.remove(index);
        }
        else
            System.out.println("Contacts does not exist");
        System.out.println("The contact has been removed.");
    }

    public void modifyNumber(String item,String num){
        int index=searchContacts(item);
        contactList.set(index,item);
        phoneNumber.set(index,num);
        System.out.println("The contact has been modified.");

    }






}
