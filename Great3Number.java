import java.util.*;
class Great3Number
{
    Scanner s=new Scanner(System.in);
    int num1,num2,num3;
    public void Great3Number()
    {
        System.out.println("Enter 3 Integer Value");
        num1=s.nextInt();
        num2=s.nextInt();
        num3=s.nextInt();

        if(num1==num2 && num2==num3)
        {
            System.out.println("all are equal");
        }
        else
        {
            int temp=num1>num2 && num1>num3 ? num1 :num2>num3 ? num2:num3;
            System.out.println(temp+" is largest");
        }
    }
}
