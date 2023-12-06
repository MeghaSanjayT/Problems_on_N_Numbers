import java.util.*;

class Arithematic
{
    public int iSize;
    public int iNo;
    public Scanner Sobj;
    public int Arr[];

    public Arithematic(int i ,int j)
    {
        iSize = i;
        iNo =j;
        Sobj = new Scanner(System.in);
        Arr = new int[iSize];
    }

    public void Accept()
    {
        int iCnt =0;
        System.out.println("Enter the numbers in array: ");
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = Sobj.nextInt();
        }
    }

    public void Display()
    {
        int iCnt =0;

        System.out.println("The Entered Elements of Array Are :");

        for(iCnt = 0; iCnt < Arr.length; iCnt++ )
        {
            System.out.println(Arr[iCnt]);
        }
    }

    public boolean CheckOccurence()
    {
        int iCnt =0;
        int iFrequency = 0;

        for(iCnt =0; iCnt< Arr.length; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                iFrequency++;
            }
        }

        if(iFrequency == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}

class Program79
{
    public static void main(String arg[])
    {
        int iSize = 0;
        int iValue =0;
        boolean bRet =false;

        System.out.println("Enter the number :");
        Scanner Sobj = new Scanner(System.in);
        iSize = Sobj.nextInt();

        System.out.println("Enter the number Whose frequency you want to check : ");
        iValue = Sobj.nextInt();

        Arithematic Aobj = new Arithematic(iSize, iValue);

        Aobj.Accept();
        Aobj.Display();
        bRet = Aobj.CheckOccurence();

        if(bRet == true)
        {
            System.out.println("Entered number is Present in Array");
        }
        else
        {
            System.out.println("Entered number is not present in Array");
        }

        

    }
}