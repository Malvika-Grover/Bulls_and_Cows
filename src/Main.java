import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String secretCode = "9305";
        int bull = 0;
        int cow = 0;
        String guess = scanner.next();

        for (int i =0;i<secretCode.length();i++){
            if (guess.charAt(i) == secretCode.charAt(i)){
                bull = bull+1;
            }else if (secretCode.contains(Character.toString(guess.charAt(i)))){
                cow = cow+1;
            }
        }
        if (bull!=0 && cow ==0){
            System.out.printf("Grade: %d bull(s). The secret code is %s.", bull, secretCode);
        }else if(cow!=0 && bull ==0){
            System.out.printf("Grade: %d cow(s). The secret code is %s.", cow, secretCode);
        }else {
            System.out.printf("Grade: %d bull(s) and %d cow(s). The secret code is %s.", bull, cow, secretCode);
        }

    }
}