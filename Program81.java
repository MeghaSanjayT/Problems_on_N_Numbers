import java.util.*;


class Arithematic
{
    public int iSize;
    public int Arr[];
    public Scanner sobj;
    int iValue;

    public Arithematic(int i, int j)
    {
        iSize = i;
        iValue = j;
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

    public int CheckOccurence()
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt<iSize; iCnt++)
        {
            if(Arr[iCnt] == iValue)
            {
                break;
            }
        }

        if(iCnt == iSize)
        {
            return -1;
        }
        else
        {
            return iCnt;
        }

    }
}
class Program81
{
    public static void main(String ar[])
    {
        int iSize = 0;
        int iNo = 0;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Size:");
        iSize = sobj.nextInt();

        System.out.println("Enter the No. whose frequency to be calculated:");
        iNo = sobj.nextInt();

        Arithematic aobj = new Arithematic(iSize,iNo);
        aobj.Accept();
        aobj.Display();
        iRet = aobj.CheckOccurence();
        if(iRet == -1)
        {
            System.out.println("No. is not occured in array");
        }
        else
        {
            System.out.println("No. is occured in array at index : "+iRet);
        }
        
    }
}