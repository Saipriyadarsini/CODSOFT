import java.util.*;
import java.util.Arrays;
class task2
{
    public static void main(String args[])
    {   
        String sub[]=new String[10];
        int marks[]=new int[10];
        float avg,sum=0;
        System.out.println("Welcome to School Grading System");
        System.out.println("enter number of subjects");
        Scanner sc=new Scanner(System.in);
        Scanner scan=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println("enter subject and marks :"+i);
            sub[i]=sc.next();
            marks[i]=scan.nextInt();
            sum+=marks[i];
        }
        System.out.println("Subject\tmarks");
        for(int i=1;i<=n;i++)
        {
            System.out.println(sub[i]+"\t"+marks[i]);
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Your Total is "+sum);
        System.out.println("");
        avg=sum/n;
        System.out.println("Your Average is "+avg);
        System.out.println("");
       
        if (avg >= 90 && avg <= 100) {
            System.out.println("Your grade is A");
        } else if (avg >= 80 && avg < 90) {
            System.out.println("Your grade is B");
        } else if (avg >= 70 && avg < 80) {
            System.out.println("Your grade is C");
        } else if (avg >= 60 && avg < 70) {
            System.out.println("Your grade is D");
        } else if (avg >= 0 && avg < 60) {
            System.out.println("Your grade is F");
    }
}
}