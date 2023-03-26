import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;

public class task_2 {
    public static void main(String[] args) {
        try{
        File grade = new File("/Users/kirillkalinin/Desktop/Java_homework/java_2_hw/grade.txt");
        FileReader fr = new FileReader(grade);
        BufferedReader reader = new BufferedReader(fr);

        String line = reader.readLine();
        while (line != null) 
        {
            String [] line_for_parsing = line.split("\"");
            System.out.println("Студент "+line_for_parsing[3]+" получил оценку "+line_for_parsing[7]+" по предмету "+line_for_parsing[11]);
            line = reader.readLine();
        }
        reader.close();

        }
        catch (Exception e) {
        e.printStackTrace();
        } 
    }
}
