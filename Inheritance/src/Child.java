class Child extends MovieViewer {

    public Child(String name, int age) {
        super(name, age);
    }

    @Override
    public void watchMovie() {
        System.out.println(getName() + " is watching a cartoon movie.");
    }

    @Override
    public void buyTicket(double price) {
        double discountedPrice = price * 0.5;
        System.out.println(getName() + " is buying a ticket for $" + discountedPrice + " (Child discount applied).");
    }
}