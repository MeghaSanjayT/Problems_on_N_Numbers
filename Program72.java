import java.lang.*;
import java.util.*;

class Arithematic
{
    public int iCnt;
    public int Arr[];
    public int iSize;
    public Scanner sobj;

    public Arithematic(int i)
    {
        iSize = i;
        Arr = new int [iSize];
        sobj = new Scanner(System.in);
    }

    public void Accept()
    {
        System.out.println("Enter the elements:");
        for(iCnt = 0; iCnt <Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("The Entered elements are:");
        for(iCnt = 0; iCnt <Arr.length; iCnt++)
        {
        System.out.println(Arr[iCnt]);
        }
    }

    public float Average()
    {
        int iSum = 0;
        
        for(iCnt = 0;iCnt<Arr.length;iCnt++)
        {
            iSum = iSum+Arr[iCnt];
        }

        return (iSum/iSize);
    }
}

class Program72
{
    public static void main(String Am[])
    {
        int iSize = 0;
        int iCnt = 0;
        float fRet =0.0f;

        System.out.println("Enter the Size : ");
        Scanner Sobj = new Scanner(System.in);

        iSize = Sobj.nextInt();

        Arithematic aobj = new Arithematic(iSize);

        aobj.Accept();
        aobj.Display();
        fRet = aobj.Average();
        System.out.println("Average is : " + fRet);

    }
}