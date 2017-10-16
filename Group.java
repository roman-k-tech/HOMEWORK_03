/**
 * Created by Роман on 15.10.2017.
 */
public class Group
{
    private Student[] students = new Student[10];

    public void add_student (Student student) throws NoSpace
    {
        for (int i = 0; i < students.length; i++)
        {
            if (students[i] == null)
            {
                students[i] = student;
                return;
            }
        }
        throw new NoSpace();
    }

    public Integer search_student(String name)
    {
        Integer position = 0;

        for (Student student : students)
        {
            if (student == null){}
            else if (student.getName().equalsIgnoreCase(name))
            {
                return position;
            }
            position++;
        }
        return null;
    }

    public void remove_student (Integer i)
    {
        if (students[i] != null)
        {
            students[i] = null;
        }
        else
        {
            System.out.println("Student does not exist");
        }
    }

    public void self_print_alph()
    {
        Student[] sorted = students.clone();
        boolean swapped = true;
        Integer i, j;
        while (swapped){
            swapped = false;
            for (i = 0, j = 1; j < sorted.length; i++, j++)
            {
                if (sorted[i] == null && sorted[j] == null){}
                else if (sorted[i] != null && sorted[j] == null) {}
                else if (sorted[i] == null && sorted[j] != null)
                {
                    sorted[i] = sorted[j];
                    sorted[j] = null;
                    swapped = true;
                }
                else if (sorted[i] != null && sorted[j] != null)
                {
                    int comp = sorted[i].getName().compareTo(sorted[j].getName());
                    if (comp <= 0){}
                    else if (comp > 0)
                    {
                        Student temp = sorted[i];
                        sorted[i] = sorted[j];
                        sorted[j] = temp;
                        swapped = true;
                    }
                }
            }
        }
        Integer q = 0;
        for (Student student : sorted)
        {
            if ( student == null)
            {
                return;
            }
            System.out.println(q + ". " + student.getName());
            q++;
        }
    }

    public void print_self ()
    {
        Integer i = 0;
        for (Student student : students)
        {
            System.out.print(i + ". ");
            if (student == null)
            {
                System.out.println("Empty");
            }
            else
            {
                System.out.println(student.getName());
            }

            i++;
        }
    }

}

class NoSpace extends Exception
{
    @Override
    public String getMessage()
    {
        return "GROUP IS FULL!";
    }
}