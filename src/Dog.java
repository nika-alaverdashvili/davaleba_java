class Dog extends Animal {
    private String colour;

    public Dog(String name, int age, String colour, String eye) {
        super(name, age, AnimalType.MAMMAL, eye);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void makeSound() {
        System.out.println("Blue!");
    }

    public void fetch() {
        System.out.println(getName() + " red Dog with Blue eyes!");
    }
}