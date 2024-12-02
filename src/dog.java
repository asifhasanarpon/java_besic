public class dog {
    private String name;
    private String breed;

    public dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String bark() {
        return name + " says Woof!";
    }

    public static void main(String[] args) {
        dog myDog = new dog("Buddy", "Golden Retriever");
        System.out.println(myDog.bark());
    }
}
