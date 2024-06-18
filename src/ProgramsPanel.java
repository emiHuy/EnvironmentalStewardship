import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ProgramsPanel extends JPanel {
    private JPanel parentPanel;
    private JTabbedPane tabbedPane1;
    private JTextPane nonProfitText;
    private JTextPane governmentText;
    private JTextPane privateText;

    public ProgramsPanel(){
        setLayout(new GridLayout());
        add(parentPanel);
        nonProfitText.setBorder(new EmptyBorder(25,0,25,0));
        privateText.setBorder(new EmptyBorder(25,0,25,0));
        governmentText.setBorder(new EmptyBorder(25,0,25,0));

        nonProfitText.setText("Electronic Products Recycling Association (EPRA): \n" +
                "Canadian non-profit, stewardship organization that manages government-approved programs established by companies and businesses that involve the collection and responsible recycling of electronics.\n" +
                "\n" +
                "Call2Recycle:\n" +
                "Non-profit, stewardship organization that safely collects, transports, and recycles batteries across Canada.\n");
        privateText.setText("These stores are found near our homes. Their programs allow us to dispose of waste properly.\n" +
                "\n" +
                "Best Buy’s Battery and Recycling Program:\n" +
                "Best Buy has a partnership with EPRA and Call2Recycle, promoting the recycling and disposal of electronics and batteries in-store.\n" +
                "\n" +
                "Staples Planet-Passionate solutions: \n" +
                "Staples has made a variety of efforts to reach their goal of minimizing waste, hazards, pollution, and natural resource depletion. Their products consist of recycled, eco-friendly materials and packaging. Additionally, their locations and production centres use 100% clean, renewable electricity. They have partnered with several organizations, including EPRA and Call2Recycle, for the recycling of electronics, batteries, ink and toner, writing tools, and shreddings.\n" +
                "\n" +
                "Quantum Lifecycle Partners:\n" +
                "A Canadian company that focuses on picking up, breaking down, reusing, recycling, and safely disposing electronic equipment, ensuring that all hazards are removed\n");
        governmentText.setText("The Canadian Environmental Protection Act Registry (CEPA):\n" +
                "An Act that prevents pollution and hazardous waste to protect the environment and human health. It regulates the disposal, recycling, and environmental impact of e-waste and is responsible for some electronic stewardship regulations.\n" +
                "\n" +
                "Paris Agreement:\n" +
                "A legally binding international treaty on climate change that was adopted by 196 parties. It seeks to develop and transfer technology to reach goals of reducing greenhouse gas emissions and mitigating climate change.\n" +
                "\n" +
                "City of Ottawa Better Homes - Loan Program:\n" +
                "Homes and buildings produce almost half of greenhouse gas emissions in Ottawa. With EnviroCentre as its partners, the City of Ottawa has a program that offers to homeowners, favourable, low-interest loans to cover the cost of home energy improvements (ie. insulation, windows, doors, heating and cooling systems, and solar panels). With financing, they promote energy efficient homes in hopes to reduce greenhouse gas emissions.\n");
    }
}
