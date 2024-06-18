import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ReduceImpactPanel extends JPanel {
    private JPanel parentPanel;
    private JPanel generalPanel;
    private JTabbedPane tabbedPane;
    private JTextPane healthText;
    private JTextPane environmentText;
    private JLabel header;

    public ReduceImpactPanel(){
        setLayout(new GridLayout());
        add(parentPanel);
        setBackground(new Color(210,224,221));
        header.setBorder(new EmptyBorder(80,0,80,0));
        environmentText.setBorder(new EmptyBorder(20,0,20,0));
        healthText.setBorder(new EmptyBorder(20,0,20,0));
        environmentText.setText("Technology plays a large role in environmental pollution and carbon emissions. Although regular individuals cannot control the amount of greenhouse gasses released or the amount of e-waste created on a large scale, each and every one of us can play our own parts in helping the environment.\n\n" +
                "To reduce these negative impacts we can:\n" +
                "\t- Turn off lights and electronic devices when not in use\n" +
                "\t- Use energy-efficient appliances\n" +
                "\t- Use devices and appliances made from environmentally friendly materials\n" +
                "\t- Delete old emails regularly\n" +
                "\t- Unsubscribe to unnecessary and unwanted emails\n" +
                "\t- Use devices for their full lifespan or as long as possible\n" +
                "\t- Recycle devices and dispose of them properly\n" +
                "\t- Use renewable sources of energy (ie. solar panels).\n");
        healthText.setText("Overuse of technology leads to a variety of health issues. However, they are easily prevented.\n\n" +
                "To avoid complications, you can:\n\n" +
                "\t- Get at least 150 minutes of moderate physical activity a week for physical activity\n" +
                "\t- Take regular breaks away from the screen to move around (every 20-30 minutes)\n" +
                "\t- Reduce the screen’s glare to avoid eye strain\n" +
                "\t- Set screen time limits to avoid spending too much time on electronic devices\n" +
                "\t- Apply ergonomics to prevent musculoskeletal issues\n" +
                "\t\t- Correct posture issues\n" +
                "\t\t- Adjust the screen to eye level\n" +
                "\t- Dim screens in the evenings\n" +
                "\t- stop using devices an hour before bedtime to minimize sleep disruption from blue light\n");
    }
}
