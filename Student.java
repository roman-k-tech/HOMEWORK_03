import java.util.Scanner;

/**
 * Created by Роман on 15.10.2017.
 */
public class Student extends Human
{

    public Student(){}

    public Student(boolean b)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Input name: ");
        String input = s.next();

        super.setName(input);
    }

    @Override
    public void print_human()
    {
        super.print_human();
        System.out.println("Student.");
    }
}
