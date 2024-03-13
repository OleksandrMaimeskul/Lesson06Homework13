import java.util.Arrays;
import java.util.Random;

public class Homework13 {
    public static void main(String[] args) {
        int[] orgOfLottery = new int[7];
        int[] playerFigures = new int[7];

        Random rand = new Random();

        for (int i = 0; i < 7; i++) {
            orgOfLottery[i] = rand.nextInt(10);
            playerFigures[i] = rand.nextInt(10);
        }
        Arrays.sort(orgOfLottery);
        Arrays.sort(playerFigures);

        System.out.println("Figures of Lottery's  Organizers : " + Arrays.toString(orgOfLottery));
        System.out.println("Figures of Player : " + Arrays.toString(playerFigures));

        int count = 0;
        for (int i = 0; i < 7; i++) {
            if (orgOfLottery [i] == playerFigures[i])  {
                count++;
            }
        }
        System.out.println("Number of matches : " + count);
    }

}
