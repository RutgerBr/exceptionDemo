package school.oose.dea;

import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App{

    public static final int FIZZ = 3;
    public static final int BUZZ = 5;
    public static final int FIZZBUZZ = 15;

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        var main = new App();
        main.streamingFizzBuzz();
    }

    public void streamingFizzBuzz()
    {
        IntStream.range(1, 1001).forEach(number ->
        {
            try
            {
                doFizzBuzz(number);
            } catch (UglyNumberException e)
            {
                System.out.println("lelijk");
            }
        });
    }

    private void doFizzBuzz(int number) throws UglyNumberException
    {
        var e1 = new UglyNumberException();

        if (number == 3)
        {
            throw e1;
        }
        else if (number % FIZZBUZZ == 0)
        {
            System.out.println("fizzbuzz" + number);
        }
        else if (number % FIZZ == 0)
        {
            System.out.println("fizz" + number);
        }
        else if (number % BUZZ == 0)
        {
            System.out.println("fizzbuzz" + number);
        }

    }
}
