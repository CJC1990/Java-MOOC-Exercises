


import mooc.logic.ApplicationLogic;
import mooc.ui.TextUserInterface;
import mooc.ui.UserInterface;


public class Main {
    
    public static void main(String[] args) {
        UserInterface ui = new TextUserInterface();
        ApplicationLogic apLogic = new ApplicationLogic(ui);
        apLogic.execute(3);
    }
    
}
