package ducks;

// Abstract Duck class
public abstract class Duck {
     flyBehavior fl;
     quackBehavior quac;

    // Constructor with correct parameter types
   /*  public Duck(flyBehavior fl, quackBehavior quac) {
        this.fl = fl;
        this.quac = quac;
    }*/
    public Duck(){}

    public abstract void display();
    
    public void performFly() {
        fl.fly();
    }

    public void performQuack() {
        quac.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
