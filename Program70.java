import java.lang.*;
import java.util.*;

class Arithematic
{
    public int iCnt;
    public int iSize;
    public int Arr[];
    public Scanner sobj;

    public Arithematic(int i)
    {
        iSize =i;
        Arr = new int [iSize];
        sobj = new Scanner(System.in);
    }

    public void Accept()
    {
        int iCnt = 0;

        System.out.println("Enter the Elements : ");

        for(iCnt = 0; iCnt<Arr.length;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display()
    {
    System.out.println("Entered Elements are : ");

        for(iCnt = 0; iCnt<Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}

class Program70
{
    public static void main(String Arf[])
    {
        int iSize = 0;

        System.out.println("Enter the Size of Array:");

        Scanner Sobj = new Scanner(System.in);

        iSize =Sobj.nextInt();

        Arithematic aobj =new Arithematic(iSize);
        aobj.Accept();
        aobj.Display();

    }
}