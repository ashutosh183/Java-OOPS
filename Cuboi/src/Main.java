class Cuboid{
    int length;
    int breadth;
    int height;
    Cuboid(){
        this(1);
    }

    Cuboid(int side){
        this(side, side, side);
        System.out.println(this.length+" "+this.breadth+" "+this.height);
    }

    Cuboid(int length, int breadth){
       this(length, breadth, 1);
    }

    Cuboid(int length, int breadth, int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
}

public class Main {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        System.out.println(cuboid.length+" "+ cuboid.breadth+" "+ cuboid.height);
        Cuboid cuboid1 = new Cuboid(10);
        System.out.println(cuboid1.length+" "+ cuboid1.breadth+" "+ cuboid1.height);
        Cuboid cuboid2 = new Cuboid(10, 5);
        System.out.println(cuboid2.length+" "+ cuboid2.breadth+" "+ cuboid2.height);
    }
}