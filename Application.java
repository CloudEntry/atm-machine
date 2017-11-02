import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import javax.swing.SwingUtilities;


public class Application extends JFrame {

    
    //Default constructor - set header "Cash Machine"
    public Application() {
        super("Cash Machine");
    }
    
    //Main method
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                runApp();
            }
        });
        
        
    }
    
    public static void runApp() {
        
        //Create an object of ATMView class and use it to call method to create the GUI
        ATMModel model = new ATMModel();
        ATMView view = new ATMView(model);
        
        ATMController controller = new ATMController(view, model);
        
        view.setLoginListener(controller);
        
        view.ATMView();
    }
    
}