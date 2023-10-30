public class Dog implements Animal{
    @Override
    public void speak(){
        System.out.println("Bark... Bark...");
    }

    @Override
    public void move(){
        System.out.println("Dog is moving...");
    }
}
