public class MacFactory extends GuiFactory{
    public Button createButton(){
        return new MacButton();
    }
    public Checkbox createCheckbox(){
        return new MacCheckbox();
    }
}
