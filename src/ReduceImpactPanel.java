import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ReduceImpactPanel extends JPanel {
    private JPanel parentPanel;
    private JTextPane healthText;
    private JTextPane environmentText;
    private JLabel header;

    public ReduceImpactPanel(){
        setupComponents();
        setTextInfo();
    }
    private void setupComponents(){
        setLayout(new GridLayout());
        add(parentPanel);
        setBackground(new Color(210,224,221));

        header.setBorder(new EmptyBorder(80,0,80,0));
        environmentText.setBorder(new EmptyBorder(20,0,20,0));
        healthText.setBorder(new EmptyBorder(20,0,20,0));
    }

    private void setTextInfo(){
        // Reducing negative impacts on the environment information
        environmentText.setText("Technology largely contributes to pollution and carbon emissions. Each and every one of us can play our part in helping the environment. To reduce the negative impacts of technology on the environment, we should:\n" +
                "\t- Turn off lights and electronic devices when they are not in use\n" +
                "\t- Use energy-efficient appliances\n" +
                "\t- Use devices and appliances made from environmentally friendly materials\n" +
                "\t- Delete old emails regularly\n" +
                "\t- Unsubscribe to unnecessary and unwanted emails\n" +
                "\t- Use devices for their entire lifespan or for as long as possible\n" +
                "\t- Recycle devices and dispose of them properly\n" +
                "\t- Use renewable sources of energy (ie. solar panels).\n");

        // Reducing negative impacts on human health information
        healthText.setText("Overuse of technology leads to a variety of health issues. To avoid complications, we should:\n" +
                "\t- Get at least 150 minutes of moderate physical activity a week for physical activity\n" +
                "\t- Take regular breaks away from the screen to move around. Stretch every 20-30 minutes.\n" +
                "\t- Reduce the screen’s glare to avoid eye strain\n" +
                "\t- Set screen time limits to avoid spending too much time on electronic devices\n" +
                "\t- Apply ergonomics to prevent musculoskeletal issues\n" +
                "\t\t- Correct posture: straight and supported back, arms relaxed, knees bent at 90 degrees\n" +
                "\t\t- Adjust the screen to eye level\n" +
                "\t- Dim screens in the evenings\n" +
                "\t- Stop using devices an hour before bedtime to minimize sleep disruption from blue light\n");
    }
}