import java.util.Scanner;

public class Main {

    /*Foo Bar
    Return the result of "foo," "bar," or "foobar" depending on the input.
    Return "foo" if the number is dividable by 3
    Return "bar" if the number is dividable by 5
    Return "foobar" if the number is dividable by 15
    Return the same number if no other requirement is met.*/
    public static void main(String[] args) {
        int input;
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Enter an integer please.");
        input = keyBoard.nextInt();
        if(input % 15 == 0){
            System.out.println("foobar");

        }
        else if(input % 5 == 0){
                System.out.println("bar");
            }
        else if(input % 3 == 0){
                System.out.println("foo");
            }
        else{
            System.out.println(input);
        }
    }
}
