package come.java.demo.admin;

public class SendsAdmin extends Admin{


    public SendsAdmin(String name, String number, String address, String email) {
        super(name, number, address, email);


    }


    public static void main(String[] args) {
        String name = "TOM",number="142341",address="朝阳区",email = "123@163.com";
        SendsAdmin S = new SendsAdmin( name,number,address,email);
        System.out.println(S.toString());

    }

}