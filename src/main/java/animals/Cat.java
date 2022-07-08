package animals;

public class Cat extends Animals {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Meow!");
    }

    @Override
    public void run() {
        System.out.println("Fast run");
    }

}
