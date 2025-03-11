import java.util.Comparator;

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {

        if (a.score != b.score) {
            return Integer.compare(b.score, a.score);
        }

        if (!a.name.equals(b.name)) {
            return a.name.compareTo(b.name);
        }

        if (a.isFemale && !b.isFemale) {
            return -1;
        } else if (!a.isFemale && b.isFemale) {
            return 1;
        } else {
            return 0;
        }
    }
}