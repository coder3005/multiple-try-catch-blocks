/* multiple try-catch */
class Handling
{
    public static void main(String[] args) {
        
        try
        {
            int a=10,b=2,c;
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException a)
        {
            System.out.println("can't divide by zero");
        }

        try 
        {
            int a[]={10,20,30,40};
            System.out.println(a[5]);
        }
        catch(ArrayIndexOutOfBoundsException b)
        {
            System.out.println("beyond the array limit");
        }
    }
}
