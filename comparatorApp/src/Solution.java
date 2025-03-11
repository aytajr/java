import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        Player[] player = {
                new Player("amy", 100, true),
                new Player("david", 100, false),
                new Player("heraldo", 50, false),
                new Player("aakansha", 75, true),
                new Player("aleksa", 150, true),
                new Player("aakansha", 75, false)
        };

        Checker checker = new Checker();

        Arrays.sort(player, checker);

        for (int i = 0; i < player.length; i++) {
            System.out.printf("%s %s %s\n", player[i].name, player[i].score,
                    player[i].isFemale ? "(female)" : "(male)");
        }
    }
}