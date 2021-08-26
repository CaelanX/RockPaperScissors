/**
 * Rock Paper Scissors - .
 * 
 * @author (Caelan) 
 * @version (August 25 2021)
 */
// Standard import for the Scanner class
import java.util.*;
public class RockPaperScissors {
    public static void main (String [] args) {
        // Create a Scanner object attached to the keyboard
        Scanner in = new Scanner (System.in);
         ArrayList<String> npc = new ArrayList<String>();
        npc.add("Rock");
        npc.add("Paper");
        npc.add("Scissors");

    String player = null;
    boolean status = true;
    Random random = new Random();
    
    while (status) 
        {
            System.out.println("Rock, Paper, Scissors!");
            System.out.println("Enter 9 to stop playing");
            player = in.nextLine();
            
            int  index =  random.nextInt(3);
            String npcChoice = npc.get(index);
            
            if (player.equalsIgnoreCase(npcChoice)){
                System.out.println(player + " vs " + npcChoice + " Tie!");
            }

            if (player.equalsIgnoreCase("Rock") && npcChoice.equalsIgnoreCase("Scissors")){
                System.out.println(player + " vs " + npcChoice + " You win!");
            }
            else if(player.equalsIgnoreCase("Rock") && npcChoice.equalsIgnoreCase("Paper")){
                System.out.println(player + " vs " + npcChoice + " You Lose!");
            }
            else if(player.equalsIgnoreCase("Scissors") && npcChoice.equalsIgnoreCase("Paper")){
                System.out.println(player + " vs " + npcChoice + " You Win!");
            }
            else if(player.equalsIgnoreCase("Scissors") && npcChoice.equalsIgnoreCase("Rock")){
                System.out.println(player + " vs " + npcChoice + " You Lose!");
            }
            else if(player.equalsIgnoreCase("Paper") && npcChoice.equalsIgnoreCase("Rock")){
                System.out.println(player + " vs " + npcChoice + " You Win!");
            }
            else if(player.equalsIgnoreCase("Paper") && npcChoice.equalsIgnoreCase("Scissors")){
                System.out.println(player + " vs " + npcChoice + " You Lose!");
            }else if(player.equals("9")){
                System.exit(1);
            
            }

    }
}
}