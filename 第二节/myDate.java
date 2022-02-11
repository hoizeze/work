package come.java.demo.date;
import java.time.Year;
import java.util.Date;
public class myDate {


    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        Date date1 = new Date(0);//有参构造从1970 1.1 午夜开始（格林时间 ）
        Date date2 = new Date(2022,1,5);
        System.out.println(date.getYear()+1900);//get()方法
        System.out.println(date.getMonth()+1);
        System.out.println(date.getDate());
        date.setDate(23);
        System.out.println(date);
    }
}
