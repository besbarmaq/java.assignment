package Animals;

public class Animal {
    public String food;
    public String location;

    public Animal(String food, String location){
        this.food=food;
        this.location=location;
    }
    public void makeNoise(String voice){
        System.out.println("Voice: "+voice);
    }
    public void eat(String breed, String food){
        System.out.println(breed+" is eating "+ food);
    }
    public void sleep(String location, String breed){
        System.out.println(breed+" is sleeping in "+location);
    }
    public static void testAnimal(Animal animal) {
        System.out.println("Food: " + animal.food);
        System.out.println("Location: " + animal.location);
    }
    public static void main(String[] args){
        Dog dog=new Dog("Pekines", "Dvornyaga", "Taksa", "Volkodav", "Senbernar");
        Cat cat=new Cat("York", "Gavana", "Korat", "Mein Kun", "Home");
        Horse horse=new Horse("Bityug", "Gidran", "Gonter", "Kinski", "Morgan");
        Animal[] animal={
                new Dog("Woof", "German Shepherd", "50", "Bones", "Yard"),
                new Cat("Purr", "Siamese", "15", "Fish", "Couch"),
                new Horse("Neigh", "Arabian", "400", "Hay", "Barn")
        };
        dog.makeNoise(dog.voice);
        cat.eat(cat.breed, cat.food);
        horse.sleep(horse.location, horse.breed);
        for (Animal animals : animal) {
            testAnimal(animals);
            System.out.println(" ");
        }
    }
}
