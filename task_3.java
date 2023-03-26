
public class task_3 {
    public static void main(String[] args) {
        String word = input_class.Str("Введите слово: ");
        String [] word_for_parsing = word.split("");
        int n = word_for_parsing.length;
        boolean isTrueFlag = true;
           for (int i = 0; i < word_for_parsing.length/2; i++) 
           {
            if (word_for_parsing[i].equals(word_for_parsing[n-i-1])) 
            {
                isTrueFlag = true;
            }
            else 
            {
                isTrueFlag = false;
                break;
            }
            }
        System.out.println(isTrueFlag);
        //int mid_letter = word_for_parsing.length
    }
    
}
