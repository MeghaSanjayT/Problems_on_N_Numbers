import java.lang.*;
import java.util.*;

class Arithematic
{
    public int iCnt;
    public int iSize;
    public int Arr [];
    public Scanner sobj;

    public Arithematic( int i)
    {
        iSize = i;
        Arr = new int[iSize];
        sobj = new Scanner(System.in);
    }

    public void Accept()
    {
        System.out.println("Enter the elements :");

        for(iCnt = 0; iCnt< Arr.length; iCnt++)
        {
            Arr[iCnt] =sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Entered numbers are : ");

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }

    public int Summation()
    {
        int iSum =0;

        for(iCnt = 0; iCnt<Arr.length; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }
        return iSum;

    }
}

class Program71
{
    public static void main(String Am[])
    {
        int iCnt = 0;
        int iRet = 0;
        int iSize = 0;

         Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the elements:");
       
        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

       

        Arithematic aobj =new Arithematic(iSize);

        aobj.Accept();
        aobj.Display();
        iRet = aobj.Summation();

        System.out.println("The Sum of the Entered numbers is : " + iRet);

    }
}