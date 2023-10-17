import java.io.PrintStream;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Fizzbuzz{
  public static void fizzbuzz(){
    Scanner console = new Scanner(System.in);
    int num;
    System.out.println("Enter a number");
    num = console.nextInt();

IntStream.rangeClosed(0, num)
        .mapToObj(
                i -> i % 3 == 0 ? 
                        (i % 5 == 0 ? "FizzBuzz" : "Fizz") : 
                        (i % 5 == 0 ? "Buzz" : i))
        .forEach(System.out::println);
  }

public static void printFizzBuzz(int from, int to, PrintStream out){
    if(from <= to){
        if(from % 3 == 0 && from % 5 == 0){
            System.out.println("FizzBuzz");
        } else if(from % 3 == 0){
            System.out.println("Fizz");
        } else if(from % 5 == 0){
            System.out.println("Buzz"); 
        } else {
            System.out.println(from);
        }
         printFizzBuzz(++from, to, out);
    }
}

  public static void main(String[] args){
    fizzbuzz();

  }

}