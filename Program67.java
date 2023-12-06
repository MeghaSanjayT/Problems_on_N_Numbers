import java.lang.*;
import java.util.*;

class Program68
{
    public static void main(String Am[])
    {
        int iCnt = 0;
        int Arr[] = new int[5];
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements :");
        for(iCnt = 0; iCnt <Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Elements from array are : ");
        for(iCnt = 0; iCnt< Arr.length;iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}