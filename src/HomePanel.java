import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePanel extends JPanel implements ActionListener {
    private MainScreen mainScreen;
    private JButton impactOfTechnologyButton;
    private JButton reducingNegativeImpactsButton;
    private JButton programsAndInitiativesButton;
    private JButton interactiveButton;
    private JButton reduceImageButton;
    private JButton programImageButton;
    private JButton impactImageButton;
    private JPanel aHomePanel;
    private ImageIcon reduceImage = new ImageIcon("reduce negative impacts image.png");
    private ImageIcon programImage = new ImageIcon("program initiatives image.png");
    private ImageIcon impactImage = new ImageIcon("impact of technology image.png");

    public HomePanel(MainScreen mainScreen){
        this.mainScreen = mainScreen;
        setLayout(new GridLayout());
        setVisible(true);
        add(aHomePanel);
        setUpButtons();
    }

    private void setUpButtons(){
        reduceImageButton.setIcon(reduceImage);
        programImageButton.setIcon(programImage);
        impactImageButton.setIcon(impactImage);

        reduceImageButton.setBorder(new EmptyBorder(0,0,0,0));
        programImageButton.setBorder(new EmptyBorder(0,0,0,0));
        impactImageButton.setBorder(new EmptyBorder(0,0,0,0));

        reducingNegativeImpactsButton.setBorder(new EmptyBorder(20,0,0,0));
        programsAndInitiativesButton.setBorder(new EmptyBorder(20,0,0,0));
        impactOfTechnologyButton.setBorder(new EmptyBorder(20,0,0,0));
        Border lineBorder = BorderFactory.createLineBorder(new Color(35,35,35), 2);
        interactiveButton.setBorder(lineBorder);

        impactImageButton.addActionListener(this);
        reduceImageButton.addActionListener(this);
        programImageButton.addActionListener(this);
        impactOfTechnologyButton.addActionListener(this);
        reducingNegativeImpactsButton.addActionListener(this);
        programsAndInitiativesButton.addActionListener(this);
        interactiveButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
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
