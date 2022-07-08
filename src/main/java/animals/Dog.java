package animals;

public class Dog extends Animals {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Woof!");
    }

    @Override
    public void run() {
        System.out.println("Just run");
    }
}
