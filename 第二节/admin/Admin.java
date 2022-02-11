package come.java.demo.admin;

public class Admin {
    private String name,number,address,email;
    public Admin(String name,String number,String address,String email ){
        this.name = name;
        this.number = number;
        this.address = address;
        this.email = email;

    }

    public void change(){

    }
    public void LOGIN() {
        Admin A = new Admin("TEE","11532","翻斗花园155号","1145222@163.com");
        System.out.println(A.toString());
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {

    }
}
