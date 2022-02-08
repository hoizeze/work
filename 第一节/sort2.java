public class sort2 {
    public static void main(String[] args) {
        int j,t;
        int [] a =new int[] {6,5,3,2,1,15,23,89,77};
        for(int i = 0;i<9;i++)
        {
            for (j=0;j<i;j++)
            {
                if (a[j]>a[j+1])
                {
                    t=a[j+1];
                    a[j+1]=a[j];
                    a[j]=t;
                }
            }
        }
        for (j=0;j<9;j++)
        {
            System.out.print(a[j]+"\t");
        }
        System.out.println("最大的数字是"+a[8]);
    }

}
