public class MyRecursionClass
{
    public static void main(String[] args)
    {
        counting(3);
    }//driving method
    public static void counting(int num)
    {
        if (num > 0)
        {
            counting(num-1); //this is recursive call

        }//end if to get to base case
        switch(num)
        {
            case 1: //enacts with num contains 1
                System.out.println ("One");
                break;
            case 2:
                System.out.println ("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
        }//end the switch block
    }//recursive method with switch/case
}
