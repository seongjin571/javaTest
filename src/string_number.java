import java.util.Scanner;
public class string_number {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        String number_input = number.nextLine();
        String new_string="";
        int count=1;

        for (int i = 0; i < number_input.length()-1; i++){
                if(number_input.charAt(i)==number_input.charAt(i+1))
                    count++;
                else if(number_input.charAt(i)!=number_input.charAt(i+1) ){
                   new_string+=number_input.charAt(i);
                   new_string+=count;
                   count=1;
                }
//                else if(number_input.charAt(i+1)==null){
//                    new_string+=number_input.charAt(i);
//                    new_string+=count;
//                }
        }

        System.out.println(new_string);
    }
}
