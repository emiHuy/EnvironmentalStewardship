import javax.swing.*;
import java.awt.*;

public class MainScreen extends JFrame{
    private JPanel mainPanel;
    private MenuPanel menuPanel;
    private JFrame window;
    private JPanel currentPanel;

    public MainScreen(){
        initializeFrame();
        setupPanels();
    }

    private void initializeFrame(){
        window = new JFrame();
        window.setSize(1920, 1080);
        window.add(mainPanel);
        window.setContentPane(mainPanel);
        window.setVisible(true);
        window.setTitle("Environmental Stewardship");
        window.setLocationRelativeTo(null);
        window.setExtendedState(MAXIMIZED_BOTH);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void setupPanels(){
        mainPanel.setLayout(new BorderLayout());
        menuPanel = new MenuPanel(this);
        mainPanel.add(menuPanel, BorderLayout.WEST);

        HomePanel homePanel = new HomePanel(this);
        mainPanel.add(homePanel, BorderLayout.CENTER);
        currentPanel = homePanel;
        menuPanel.updateButtonColor("Home");
    }

    public void updatePanel(JPanel newPanel, String buttonText){
        mainPanel.remove(currentPanel);
        mainPanel.add(newPanel, BorderLayout.CENTER);
        menuPanel.updateButtonColor(buttonText);
        mainPanel.repaint();
        mainPanel.revalidate();
        currentPanel = newPanel;
    }

    public JFrame getJFrame(){
        return window;
    }

}
