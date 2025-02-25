class Old extends MovieViewer {

    public Old(String name, int age) {
        super(name, age);
    }

    @Override
    public void watchMovie() {
        System.out.println(getName() + " is watching a classic movie.");
    }

    @Override
    public void buyTicket(double price) {
        double discountedPrice = price * 0.8;
        System.out.println(getName() + " is buying a ticket for $" + discountedPrice + " (Senior discount applied).");
    }
}