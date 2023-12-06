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

    public void CountEven()
    {
        int iEvenCnt =0;
        int iOddCnt =0;
        for(iCnt = 0; iCnt <Arr.length; iCnt++)
        {
            if((Arr[iCnt]) % 2 == 0)
            {
                iEvenCnt++;
            }

            else
            {
                iOddCnt++;
            }

           
        }
        System.out.println("Even number of elements are: " +iEvenCnt);
        System.out.println("Odd number of elements are: " +iOddCnt);
    }
    
}

class Program75
{
    public static void main(String Am[])
    {
        int iSize = 0;
        int iCnt = 0;
        float iRet =0.0f;

        System.out.println("Enter the Size : ");
        Scanner Sobj = new Scanner(System.in);

        iSize = Sobj.nextInt();

        Arithematic aobj = new Arithematic(iSize);

        aobj.Accept();
        aobj.Display();
        aobj.CountEven();


    }
}