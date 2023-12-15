import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
class task1
{
    public static void main(String args[])
    {   
        while(true)
        {
        int n;
        System.out.println("Enter 1: to play random number guess game\n      2:exit");
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        switch(n){
        
        case 1:{
        int x=ThreadLocalRandom.current().nextInt(1,100);
        System.out.println("enter a number from 1 to 100");
        Scanner sc=new Scanner(System.in);
        int y;
        int count=0;
        for(int i=0;i<5;i++)
        {
          y=sc.nextInt();
           if(y!=x)
        {
            if(y<x)
            {
                System.out.println("the number you have entered in lesser than the given number");
                count++;
            }
            else if(y>x)
            {
                System.out.println("the number you have entered in greater than the given number");
                count++;
            }
        }
    
        else
        
        {
            System.out.println("matched");
            break;
        }
        
    }
    System.out.println("");
    System.out.println("*****GAME OVER*****");
    System.out.println("Your Score is "+(10-count));
    System.out.println("*******************");
    System.out.println("");
    System.out.println("");
    break;
        }
        case 2: System.exit(0);
}
}
}
}

