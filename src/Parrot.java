class Parrot extends Animal implements Pet, Bird {
    private String color;

    public Parrot(String name, int age, String color, String eye) {
        super(name, age, AnimalType.BIRD, eye);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void makeSound() {
        System.out.println("boom!");
    }

    public void fly() {
        System.out.println(getName() + " is flying!");
    }

    public void playWith() {
        System.out.println(getName() + " with red eye!");
    }
}