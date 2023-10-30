public class Buffalo implements Animal, Grazeable{
    @Override
    public void speak(){
        System.out.println("Meh... Meh...");
    }

    @Override
    public void move(){
        System.out.println("Goat moving...");
    }
    @Override
    public void graze(){
        System.out.println("Goat is grazing...");
    }
}
