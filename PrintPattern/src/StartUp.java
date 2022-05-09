public class StartUp {

    private static StringBuffer sb = new StringBuffer();;
    private void printPat(int N)
    {
        int noOfPatterns = N,value = N;
        while(noOfPatterns>0)
        {
            value = N;
            while(value>0)
            {
                append(noOfPatterns,value);
                value--;
            }
            sb.append('$');
            noOfPatterns--;
        }
    }
    private void append(int N,int value)
    {
        for(int index=0;index<N;index++)
        {
            sb.append(String.valueOf(value));
        }
    }
    public static void main(String args[])
    {
		// debanka 101
        StartUp su = new StartUp();
        su.printPat(3);
        System.out.println(sb);

    }
}
