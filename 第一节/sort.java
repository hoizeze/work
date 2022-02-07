package come.java.demo;

import java.util.Arrays;

public class sort {
    public static void main(String[] args)
    {
        int i=0;
        int [] a = new int[] {6,5,3,2,1,15,23,89,77};
        Arrays.sort(a);
        for(;i<a.length;i++)
        {
            System.out.print(a[i] +"\n");
        }
        System.out.println("最大的数字是");
        System.out.print(a[8]);
    }
}
