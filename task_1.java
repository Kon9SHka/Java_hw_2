import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;


public class task_1 {
    public static void main(String[] args) {
        // Создаем массив
        int [] array = {23, 4, 6, 12, 7, 10, 1};
        // переводим массив в строку, печатаем его
        StringBuilder number = new StringBuilder();
        for (int numb: array) {
            number.append(numb);
            }
        System.out.println(number.toString());
        // создаем файл для логирования
        String file_name = "Log_task_1.txt";
        File log = new File(file_name);
        // проверка на законченность сортировки
        boolean isbubble = false;
        // запускаем цикл на "пузырьки"
        while(!isbubble)
        {
            isbubble = true;
            for (int i = 0; i < array.length - 1; i++)
            {   // если текущее значенеи больше следующего - меняем местами
                if (array[i]>array[i+1]) 
                {
                    isbubble = false;
                    int temp_pos = array[i];
                    array[i]= array[i+1];
                    array[i+1] = temp_pos;
                    // приводим к строке для логирования
                    StringBuilder number_2 = new StringBuilder();
                    for (int numb: array) {
                        number_2.append(numb);
                        }
                    String for_logs = number_2.toString();
                    // делаем логирование
                    try {
                        FileWriter writer = new FileWriter(log,true);
                        writer.write(LocalDateTime.now().toString());
                        writer.write("  ");
                        writer.write(for_logs);
                        writer.write("\n");
                        writer.close();
                    }
                    catch (Exception m) 
                    {
                        System.out.print("Ошибка");
                    }
                }
            }
        }

        StringBuilder number_2 = new StringBuilder();
        for (int numb: array) {
            number_2.append(numb);
            }
        System.out.println(number_2.toString());

    }
    
}