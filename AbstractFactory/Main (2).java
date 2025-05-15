public class Main {
	public static void main(String[] args) {
		Button b =  Application.getButton(new WinFactory());
		b.paintb();
		Checkbox c =  Application.getCheckbox(new MacFactory());
		c.paintc();
	}
}
