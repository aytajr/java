public class Main {
    public static void main(String[] args) {

        MovieViewer child = new Child("Alice", 10);
        child.displayInfo();
        child.watchMovie();
        child.buyTicket(10);

        System.out.println();

        MovieViewer young = new Young("Bob", 25);
        young.displayInfo();
        young.watchMovie();
        young.buyTicket(10);

        System.out.println();

        MovieViewer old = new Old("Charlie", 65);
        old.displayInfo();
        old.watchMovie();
        old.buyTicket(10);
    }
}