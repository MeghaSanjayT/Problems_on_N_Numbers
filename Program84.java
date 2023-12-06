import java.util.*;

class Arithematic
{
    public int iSize;
    public int Arr[];
    public Scanner Sobj;

    public Arithematic(int i)
    {
        iSize = i;
        Arr = new int[iSize];
        Sobj = new Scanner(System.in);
    }

    public void Accept()
    {
        int iCnt =0;
        System.out.println("Enter the elementes of array: ");

        for(iCnt =0; iCnt<Arr.length; iCnt++)
        {
            Arr[iCnt] =Sobj.nextInt();
        }
    }

    public void Display()
    {
        int iCnt =0;

        System.out.println("Entered elements are : ");
        for(iCnt =0; iCnt< Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }

    public void Displayreverse()
    {
        int iCnt = 0;

        System.out.println("Reverse of entered numbers : ");

        for(iCnt=iSize-1; iCnt>=0; iCnt--)
        {
            System.out.println(Arr[iCnt]);
        }

    }

}

class Program84
{
    public static void main(String arf[])
    {
        int iSize =0;
        System.out.println("Enter the Size :");
        Scanner sobj =new Scanner(System.in);
        iSize =sobj.nextInt();

        Arithematic aobj = new Arithematic(iSize);

        aobj.Accept();
        aobj.Display();

        aobj.Displayreverse();

    }
}
