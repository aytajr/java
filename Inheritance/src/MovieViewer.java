abstract class MovieViewer {
    private String name;
    private int age;

    public MovieViewer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void watchMovie();

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void buyTicket(double price) {
        System.out.println(name + " is buying a ticket for $" + price);
    }

    protected int getAge() {
        return age;
    }

    protected String getName() {
        return name;
    }
}