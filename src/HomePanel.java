import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePanel extends JPanel implements ActionListener {
    private final MainScreen mainScreen;
    private JPanel parentPanel;
    private JButton impactOfTechnologyButton;
    private JButton reducingNegativeImpactsButton;
    private JButton programsAndInitiativesButton;
    private JButton interactiveButton;
    private JButton reduceImageButton;
    private JButton programImageButton;
    private JButton impactImageButton;

    public HomePanel(MainScreen mainScreen){
        this.mainScreen = mainScreen;
        setupComponents();
    }

    private void createImageButton(JButton button, String filename){
        ImageIcon image = new ImageIcon(filename);
        button.setIcon(image);
        button.setBorder(new EmptyBorder(0,0,0,0));
        button.setFocusPainted(false);
        button.setContentAreaFilled(false);
        button.addActionListener(this);
    }

    private void createButton(JButton button){
        button.setBorder(new EmptyBorder(20,0,0,0));
        button.addActionListener(this);
        button.setContentAreaFilled(false);
        button.addActionListener(this);
    }

    private void setupComponents(){
        // Setup panel
        setLayout(new GridLayout());
        setVisible(true);
        add(parentPanel);

        // Create image buttons
        createImageButton(impactImageButton, "impact of technology image.png");
        createImageButton(reduceImageButton, "reduce negative impacts image.png");
        createImageButton(programImageButton, "program initiatives image.png");

        // Create regular buttons
        createButton(impactOfTechnologyButton);
        createButton(reducingNegativeImpactsButton);
        createButton(programsAndInitiativesButton);

        // Create interactive button
        Border lineBorder = BorderFactory.createLineBorder(new Color(35,35,35), 2);
        interactiveButton.setBorder(lineBorder);
        interactiveButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Go to corresponding screens (panels) when button is clicked
        if(e.getSource() == impactImageButton || e.getSource() == impactOfTechnologyButton){
            mainScreen.updatePanel(new ImpactsPanel(), "Impact of Technology");
        }
        else if(e.getSource() == reduceImageButton || e.getSource() == reducingNegativeImpactsButton){
            mainScreen.updatePanel(new ReduceImpactPanel(), "Reducing Negative Impacts");
        }
        else if(e.getSource() == programImageButton || e.getSource() == programsAndInitiativesButton){
            mainScreen.updatePanel(new ProgramsPanel(), "Programs and Initiatives");
        }
        else if(e.getSource() == interactiveButton){
            mainScreen.updatePanel(new InteractivePanel(), "Interactive");
        }
    }
}