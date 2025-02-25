class Young extends MovieViewer {

    public Young(String name, int age) {
        super(name, age);
    }

    @Override
    public void watchMovie() {
        System.out.println(getName() + " is watching an action movie.");
    }
}