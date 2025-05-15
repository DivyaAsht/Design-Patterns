public class WinFactory extends GuiFactory{
    public Button createButton(){
        return new WinButton();
    }
    public Checkbox createCheckbox(){
        return new WinCheckbox();
    }
}
