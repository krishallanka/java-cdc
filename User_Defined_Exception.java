import java.io.*;
import java.util.*;
class InvalidAgeException extends Exception
{
    public InvalidAgeException(String str)
    {
        super(str);
    }
}
public class TestCustomException
{
    static void validate (int age) throws InvalidAgeException
    {
        if(age<18)
        {
            throw new InvalidAgeException("age is a not valid to vote");
        }
        else{
            System.out.println("Welcome to vote");
        }
    }
    public static void main(String args[]){
        try{
            validate(13);
        }
        catch(InvalidAgeException ex)
        {
            System.out.println("Caught the Exception");
            System.out.println("Exception occured: "+ex);
        }
        finally{
            System.out.println("In finally block");
        }
        System.out.println("Rest of code....");
    }
}
