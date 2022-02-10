package come.java.demo.stu;

public class student {
    String name;
    boolean signStatus;

    public student(String name, boolean signStatus) {
        this.name = name;
        this.signStatus = signStatus;

        printStudent ();
    }
    public student()
    {
        }
        public void printStudent ()
    {       String SIGN;
            System.out.println("名字:" + name);
            SIGN = signStatus == true ? "yes":"no";
            System.out.println("签到状态:" + SIGN);
        }
    }

