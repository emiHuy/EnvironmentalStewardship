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

        nonProfitText.setText("Electronic Products Recycling Association (EPRA): " +
                "\nStewardship organization that manages government-approved programs established by businesses involving the collection and responsible recycling of electronics.\n" +
                "\nCall2Recycle:" +
                "\nStewardship organization that safely collects, transports, and recycles batteries across Canada.\n");
        privateText.setText("Best Buy’s Battery and Recycling Program:\n" +
                "Best Buy has a partnership with EPRA and Call2Recycle, promoting the recycling and disposal of electronics and batteries in-store.\n" +
                "\nStaples’s Planet-Passionate solutions: \n" +
                "Staples has made a variety of efforts to reach their goal of minimizing waste and pollution. Their products consist of recycled, eco-friendly materials and packaging. Additionally, their locations and production centres use 100% clean, renewable electricity. They have partnered with several organizations, including EPRA and Call2Recycle, for the recycling of electronics, batteries, ink and toner, writing tools, and shreddings.\n" +
                "\nEcoATM\n" +
                "A company that aims to limit e-waste by paying consumers for their used devices and then recycling them\n");
        governmentText.setText("The Canadian Environmental Protection Act Registry (CEPA):\n" +
                "An Act that prevents pollution and hazardous waste to protect the environment and human health. It regulates the disposal, recycling, and environmental impact of e-waste and is responsible for some electronic stewardship regulations.\n" +
                "\nThe Paris Agreement:\n" +
                "A legally binding international treaty on climate change that seeks to develop and transfer technology to reach goals of reducing greenhouse gas emissions and mitigating climate change.\n" +
                "\nThe City of Ottawa Better Homes - Loan Program:\n" +
                "Homes and buildings produce almost half of greenhouse gas emissions in Ottawa. With EnviroCentre as its partners, the City of Ottawa has a program that offers to homeowners, favourable, low-interest loans to cover the cost of home energy improvements (ie. insulation, windows, doors, heating and cooling systems, and solar panels). With financing, they promote energy efficient homes in hopes to reduce greenhouse gas emissions.\n" +
                "\nThe NYS Electronic Equipment Recycling and Reuse Act\n" +
                "An act in New York State that requires manufacturers to provide free, convenient recycling of e-waste to its in-state consumers.\n");
    }
}
