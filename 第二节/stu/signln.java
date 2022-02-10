package come.java.demo.stu;

public class signln {


    String [][]s =  new String[5][2] ;
    public signln(){
        s[0][0] = "jack";
        s[0][1] = "yes";
        s[1][0] = "ted";
        s[1][1] = "no";
        s[2][0] = "marry";
        s[2][1] = "yes";
        s[3][0] = "tom";
        s[3][1] = "yes";
        s[4][0] = "jerry";
        s[4][1] = "no";
    }
    public static void main(String args[])
    {
        signln students = new signln();
        boolean a;
        for (int i = 0;i < 5;i++)
        {
            a=students.s[i][1] == "yes" ? true:false;
            student STU = new student(students.s[i][0],a);

        }
    }
}
