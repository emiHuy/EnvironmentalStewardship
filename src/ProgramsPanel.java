import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class ProgramsPanel extends JPanel {
    private JPanel parentPanel;
    private JTextPane nonProfitText;
    private JTextPane governmentText;
    private JTextPane privateText;

    public ProgramsPanel(){
        setupComponents();
        setTextInfo();
    }

    private void setupComponents(){
        // Setup panel
        setLayout(new GridLayout());
        add(parentPanel);

        // Set empty borders around components for display
        nonProfitText.setBorder(new EmptyBorder(25,0,25,0));
        privateText.setBorder(new EmptyBorder(25,0,25,0));
        governmentText.setBorder(new EmptyBorder(25,0,25,0));
    }

    private void styleText(JTextPane pane, String... texts){
        StyledDocument doc = pane.getStyledDocument();

        Style bold = pane.addStyle("BoldStyle", null);
        StyleConstants.setBold(bold, true);

        Style regular = pane.addStyle("RegularStyle", null);
        StyleConstants.setBold(regular, false);

        try{
            for(int x = 0; x < texts.length; x++){
                String text = texts[x];
                // Set only certain parts of text to bold
                if(x%2 != 0){
                    doc.insertString(doc.getLength(), text, bold);
                }
                else{
                    doc.insertString(doc.getLength(), text, regular);
                }
            }
        }
        catch (BadLocationException e){
            e.printStackTrace();
        }
    }

    private void setTextInfo(){
        // Non-profit organizations
        styleText(nonProfitText,"There are many non-profit organizations that aim to protect the environment by recycling and reusing products. Popular Canadian non-profits that work with other businesses include: ",
                "\n\nElectronic Products Recycling Association (EPRA): ",
                "Stewardship organization that operates regulated government-approved recycling programs involving the collection and responsible recycling of electronics. They ensure that end-of-life electronics are handled safely.",
                "\n\nCall2Recycle: ",
                "Stewardship organization that safely collects, transports, and recycles batteries across Canada.");

        // Private business programs/initiatives
        styleText(privateText,
                "Some more well-known private businesses in the area that promote environmental stewardship, especially when it comes to e-waste, include: ",
                "\n\nBest Buy's Battery and Recycling Program: ",
                "Best Buy has a partnership with EPRA and Call2Recycle, promoting the recycling and disposal of electronics and batteries in-store.",
                "\n\nStaples’s Planet-Passionate solutions: ",
                "Staples has made a variety of efforts to reach their goal of minimizing waste and pollution. Their products consist of recycled, eco-friendly materials and packaging. Additionally, their locations and production centres use 100% clean, renewable electricity. They have partnered with several organizations, including EPRA and Call2Recycle, for the recycling of electronics, batteries, ink and toner, writing tools, and shreddings.",
                "\n\nEcoATM: ",
                "A company that aims to limit e-waste by paying consumers for their used devices and then recycling them.");

        // Government programs and initiatives
        styleText(governmentText,
                "Governments, of different levels, are trying to mitigate climate change and promote environmental stewardship. Some governmental programs and initiatives include: ",
                "\n\nThe Canadian Environmental Protection Act Registry (CEPA): ",
                "An Act that prevents pollution and hazardous waste to protect the environment and human health. It regulates the disposal, recycling, and environmental impact of e-waste and is responsible for some electronic stewardship regulations.",
                "\n\nThe Paris Agreement: ",
                "A legally binding international treaty on climate change that seeks to develop and transfer technology to reach goals of reducing greenhouse gas emissions and mitigating climate change.",
                "\n\nThe City of Ottawa Better Homes - Loan Program: ",
                "Homes and buildings produce almost half of greenhouse gas emissions in Ottawa. With EnviroCentre as its partners, the City of Ottawa has a program that offers to homeowners, favourable, low-interest loans to cover the cost of home energy improvements (ie. insulation, windows, doors, heating and cooling systems, and solar panels). Through financing, they promote energy efficient homes in hopes to reduce greenhouse gas emissions.",
                "\n\nThe NYS Electronic Equipment Recycling and Reuse Act: ",
                "An act in New York State that requires manufacturers to provide free, convenient recycling of e-waste to its in-state consumers.");
    }
}
