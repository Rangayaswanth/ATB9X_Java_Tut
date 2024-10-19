package Oct.ex_10192024;

public class ternary_grade {
    public static void main(String[] args) {
        int score = 85;
        String grade = (score >=90)? "A" : (score >=80)? "B":(score >=70)? "C":(score >=60)? "D":"Fail";
        System.out.println("Your Grade is ->" +grade);
    }
}
