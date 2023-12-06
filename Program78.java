import java.lang.*;
import java.util.*;

class Arithematic
{
    public int iSize;
    public int Arr[];
    public Scanner sobj;
    int iNo;
 
   

    public Arithematic(int i ,int j)
    {
       iSize = i;
       iNo = j;
       Arr= new int[iSize];
       sobj = new Scanner(System.in); 
    }

    public void Accept()
    {
        int iCnt =0;
        System.out.println("Enter the elements");

        for(iCnt = 0; iCnt <Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }
 
    public void Display()
    {
                int iCnt =0;

        System.out.println("Entered elements are");

        for(iCnt =0; iCnt< Arr.length; iCnt++)
        {
        System.out.println(Arr[iCnt]);
        }
    }

    public int CountFrequency()
    {
                int iCnt =0;

        int iFrequency =0;
        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt]== iNo)
            {
                iFrequency++;
            }
        }
        return iFrequency;
    }


}

class Program78
{
    public static void main(String srg[])
    {
        int iSize = 0;
        int iValue = 0;
        int iRet = 0;


        System.out.println("Enter the Size : ");
        Scanner Sobj = new Scanner(System.in);

        iSize = Sobj.nextInt();

        System.out.println("Enter the No whose Frequency is to be calculated : ");
        iValue = Sobj.nextInt();

        Arithematic aobj = new Arithematic(iSize, iValue);

        aobj.Accept();
        aobj.Display();
        iRet =aobj.CountFrequency();

        System.out.println("The frequency of" + iValue  +" is : "+iRet);

    }
}