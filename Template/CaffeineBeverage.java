public abstract class CaffeineBeverage{
    final void prepareRecipe(){
        Boilwater();
        Brew();
        PourInCup();
        addCondiments();
    }
    abstract void Brew();
    abstract void addCondiments();

    void Boilwater(){
        System.out.println("Boiling Water");
    }
    void PourInCup(){
        System.out.println("Pouring into cup");
    }
}