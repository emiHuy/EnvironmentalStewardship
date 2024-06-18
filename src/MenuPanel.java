import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPanel extends JPanel implements ActionListener {
    private MainScreen mainScreen;
    private JPanel buttonPanel;
    private JButton homeButton;
    private JButton impactOfTechnologyButton;
    private JButton reducingImpactsButton;
    private JButton programsAndInitiativesButton;
    private JButton interactiveButton;

    public MenuPanel(MainScreen mainScreen){
        this.mainScreen = mainScreen;
        setupComponents();
    }

    private void setupButton(JButton button){
        button.setBorder(new EmptyBorder(0,0,0,0));
        button.addActionListener(this);
    }

    private void setupComponents(){
        // Setup parent panel
        setLayout(new GridLayout());
        setVisible(true);
        add(buttonPanel);
        setBorder(BorderFactory.createLineBorder(new Color(109, 158, 114), 15));

        // Set up buttons
        setupButton(homeButton);
        setupButton(impactOfTechnologyButton);
        setupButton(reducingImpactsButton);
        setupButton(programsAndInitiativesButton);
        setupButton(interactiveButton);
    }

    public void updateButtonColor(String buttonText){
        JButton buttonList[] = {homeButton, impactOfTechnologyButton, reducingImpactsButton, programsAndInitiativesButton, interactiveButton};
        for(JButton button : buttonList){
            if(button.getText().equals(buttonText)){
                button.setBackground(new Color(77, 112, 81));
                button.setForeground(new Color(250, 250, 250));
            }
            else{
                button.setBackground(new Color(109, 158, 114));
                button.setForeground(new Color(35,35,35));
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Go to corresponding screens (panels) when button is clicked
        if(e.getSource() == homeButton){
            mainScreen.updatePanel(new HomePanel(mainScreen), "Home");
        }
        if(e.getSource() == impactOfTechnologyButton){
            mainScreen.updatePanel(new ImpactsPanel(), "Impact of Technology");
        }
        else if(e.getSource() == reducingImpactsButton){
            mainScreen.updatePanel(new ReduceImpactPanel(), "Reducing Negative Impacts");
        }
        else if(e.getSource() == programsAndInitiativesButton){
            mainScreen.updatePanel(new ProgramsPanel(), "Programs and Initiatives");
        }
        else if(e.getSource() == interactiveButton){
            mainScreen.updatePanel(new InteractivePanel(), "Interactive");
        }
    }
}