import java.util.Scanner;

public class MusicPlayer {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean onRepeatButton = true;

        while(onRepeatButton){
            System.out.println("Repeating the song");
            System.out.println("Do you want to repeat the song");
            String userInput = sc.next();
            if(userInput.equals("no")){
                onRepeatButton = false;
            }
        }
        System.out.println("Playing the next song");
    }
}
