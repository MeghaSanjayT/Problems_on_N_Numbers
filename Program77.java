import java.util.*;


class Arithematic
{
    public int iSize;
    public int Arr[];
    public Scanner sobj;
    public Arithematic(int i)
    {
        iSize = i;
        Arr = new int[iSize]; 
        sobj = new Scanner(System.in);
    }

    public void Accept()
    {
        int iCnt = 0;
        
        System.out.println("Enter the elements :");
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display()
    {
        int iCnt = 0;

        System.out.println("Elements from array are:");
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

    }

    public void DisplayEvenOddSum()
    {
        int iEvenSum = 0;
        int iOddSum = 0;
        int iCnt = 0;

        for(iCnt =0; iCnt< Arr.length; iCnt++)
        {
            if((Arr[iCnt])%2==0)
            {
                iEvenSum = iEvenSum+ Arr[iCnt];
            }

            else
            {
                iOddSum = iOddSum +Arr[iCnt];
            }
        }   
    System.out.println("Sum of Even no. of elements in array are : "+iEvenSum);
    System.out.println("Sum of Odd no. of elements in array are : "+iOddSum);

  
    }
}
class Program77
{
    public static void main(String ar[])
    {
        int iSize = 0;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Size:");
        iSize = sobj.nextInt();

        Arithematic aobj = new Arithematic(iSize);
        aobj.Accept();
        aobj.Display();
        aobj.DisplayEvenOddSum();
        
        
    }
}