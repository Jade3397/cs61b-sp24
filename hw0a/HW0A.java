public class HW0A
{
    //2.5 star Triangle
    public static void starTriangle(int n)
    {
        for(int i = 1;i <= n;i++)
        {
            for(int j = 1;j <= i;j++)
                System.out.print("*");

            System.out.println();
        }
    }

    //3.23 printIndexed
    public static void printIndexed(String s)
    {
        int len = s.length();
        for(int i = 0;i < len;i++)
        {
            char c = s.charAt(i);
            int index = len - 1 - i;
            System.out.print(c + "" + index);
        }
        System.out.println();
    }

    //4.19 quadrant
    public static int quadrant(int x,int y)
    {
        if(x>0)
        {
            if(y>0)
                return 1;
            else if(y<0)
                return 4;
        }
        else if(x<0)
        {
            if(y>0)
                return 2;
            else if(y<0)
                return 3;
        }
        return 0;
    }

    public static void main(String[] args)
    {
        starTriangle(5);

        printIndexed("Hello!");

        int Add = quadrant(1,1);
        System.out.println("The address of (x,y) is " + Add);
    }
}