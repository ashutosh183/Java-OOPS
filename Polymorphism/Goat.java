public class Goat implements Animal, Grazeable, Legs{
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

    @Override
    public void walk(){
        System.out.println("Goat walking on 4 legs");
    }
}
