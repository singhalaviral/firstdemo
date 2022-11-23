public class Example {
    public static void main(String[] args){
        try{
            System.out.println("Started");
            int n1=Integer.parseInt(args[0]);
            int n2=Integer.parseInt(args[1]);
            System.out.println("We have got 2 numbers");
            int res=n1/n2;
	    System.out.println("Division is" +res);
        
        }
        catch (ArithmeticException e){
            System.out.println("n2 cannot be 0");
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("i am in finally block");
            System.out.println("closing all the resources...");
        }
        System.out.println("Terminated..");
    }
}
