import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class ImpactsPanel extends JPanel{
    private JPanel parentImpactsPanel;
    private JScrollPane scrollPane;
    private JPanel scrollPanel;
    private JTabbedPane tabbedPane;
    private JLabel ePositiveImpactHeader;
    private JTextPane ePositiveImpactText;
    private JLabel ePositiveImpactImage;
    private JTextPane ePositiveImpactCaption;
    private JPanel generalPanel;
    private JLabel header;
    private JTextPane generalText;
    private JLabel eNegativeImpactImage;
    private JTextPane eNegativeImpactCaption;
    private JTextPane eNegativeImpactText;
    private JTextPane eConclusionText;
    private JLabel eConclusionHeader;
    private JTextPane hPositiveImpactText;
    private JLabel hPositiveImpactHeader;
    private JLabel hNegativeImpactHeader;
    private JLabel hPositiveImpactImage;
    private JTextPane hPositiveImpactCaption;
    private JLabel hNegativeImpactImage;
    private JTextPane hNegativeImpactCaption;
    private JTextPane hNegativeImpactText;
    private JLabel hConclusionHeader;
    private JTextPane hConclusionText;
    private JLabel eNegativeImpactHeader;

    public ImpactsPanel(){
        setLayout(new GridLayout());
        add(parentImpactsPanel);
        header.setBorder(new EmptyBorder(50,0,50,0));
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        StyledDocument styledDocument = generalText.getStyledDocument();
        styledDocument.setParagraphAttributes(0, styledDocument.getLength(), center, false);
        generalText.setBorder(new EmptyBorder(0,0,50,0));
        generalText.setText("Technology has grown and advanced over the years, becoming much more prominent in today's society. As it is, technology presents beneficial and negative impacts on the environment and human health.");
        tabbedPane.setBorder(new EmptyBorder(0 ,0 ,0 ,0));

        setupHealthImpacts();
        setupEnvironmentalImpacts();

        UIManager.put("ScrollBar.width", 25);
        scrollPane.setVerticalScrollBar(scrollPane.createVerticalScrollBar());
    }

    private void generalUpdate(JTextPane[] paneList, JLabel[] labelList){
        int count = 0;
        for(JTextPane pane : paneList){
            if(count < 2){
                pane.setBorder(new EmptyBorder(30, 0, 0, 0));
            }
            else if(count == 2){
                pane.setBorder(new EmptyBorder(50, 0, 100, 0));
            }
            else{
                SimpleAttributeSet center = new SimpleAttributeSet();
                StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
                StyledDocument styledDocument = pane.getStyledDocument();
                styledDocument.setParagraphAttributes(0, styledDocument.getLength(), center, false);
            }
            count++;
        }

        for(JLabel label : labelList){
            label.setBorder(new EmptyBorder(50, 0, 50, 0));
        }
    }
    
    private void setupEnvironmentalImpacts(){
        JTextPane[] paneList = {ePositiveImpactText, eNegativeImpactText, eConclusionText, ePositiveImpactCaption, eNegativeImpactCaption};
        JLabel[] labelList = {ePositiveImpactHeader, eNegativeImpactHeader, eConclusionHeader};
        generalUpdate(paneList, labelList);
        ePositiveImpactImage.setIcon(new ImageIcon("positive environmental impact image.jpg"));
        ePositiveImpactCaption.setText("Wind turbines and solar panels that generate electricity from wind energy and solar energy, respectively.");
        ePositiveImpactText.setText("With technology, renewable resources could provide us with energy. These cleaner sources of energy help reduce greenhouse gas emissions and non-renewable fossil fuel dependence, a large factor in global warming.\n" +
                "\nTechnology has also helped optimize waste management. In waste management, technology is used to automate sorting and waste separation systems. Sensors and tracking technologies are also used to monitor waste streams. With technology, safe, appropriate, and efficient waste management is ensured.\n" +
                "\nIn addition to waste management, technology is also used to manage natural resources. By applying AI and machine learning to minimize pesticides and fertilizers, and tracking natural resources, technology optimizes consumption and long-term sustainability of resources.");
        eNegativeImpactText.setText("With newer technologies being released often, older technologies are being discarded. 50 million tons of e-waste is generated globally each year - most of which end up in landfills or are burned. Technotrash - unwanted and broken electronic devices - is the most rapidly growing waste type. With this non-biodegradable technotrash, technology’s toxic materials (ie. lead, mercury, and arsenic) leak into the ground, contaminating the water, plants, and animals. \n" +
                "\nAnimal and plant habitats and ecosystems are disrupted, as lands are cleared to build manufacturing factories that make the technology we use. Plus, material collection for manufacturing causes deforestation and resource degradation. This greatly affects the environment’s natural cycles.\n" +
                "\nServers and data banks that many technologies require to operate consume  a lot of energy. Energy used today mostly comes from non-renewable sources, contributing to greenhouse gas emissions.");
        eNegativeImpactImage.setIcon(new ImageIcon("negative environmental impact image.jpg"));
        eNegativeImpactCaption.setText("E-Waste landfill filled with unwanted electronic devices.");

        eConclusionText.setText("While technology makes our lives easier and helps us manage the environment around us and provide us energy for our daily activities, it comes at the cost of pollution, greenhouse gas emission,and the destruction of natural habitats.");
    }

    private void setupHealthImpacts(){
        JTextPane[] paneList = {hPositiveImpactText, hNegativeImpactText, hConclusionText, hPositiveImpactCaption, hNegativeImpactCaption};
        JLabel[] labelList = {hPositiveImpactHeader, hNegativeImpactHeader, hConclusionHeader};
        generalUpdate(paneList, labelList);

        hPositiveImpactCaption.setText("Medical healthcare professionals looking at brain scans produced by technology.");
        hNegativeImpactCaption.setText("Person addicted to screen - the blue light emitted from his device is disrupting his sleep.");
        hPositiveImpactImage.setIcon(new ImageIcon("positive health impact image.jpg"));
        hNegativeImpactImage.setIcon(new ImageIcon("negative health impact image.jpg"));
        hPositiveImpactText.setText("Technological advancements have positively improved healthcare. Through technology, patients are able meet with healthcare professionals remotely and access test results. As such, transportation to offices are minimized, reducing greenhouse gases. Technology is used in hospitals and healthcare facilities to produce imaging of problem areas, to make diagnoses, and to monitor vital signs, improving healthcare accuracy and efficiency. Technology has even provided us a way to cure diseases.\n");
        hNegativeImpactText.setText("Technology is widely used today by individuals of different ages. When technology is overused or used for a prolonged amount of time, individuals may experience physical inactivity and its related issues, Carpal Tunnel Syndrome, musculoskeletal issues, digital eye strain, disrupted sleep, and hearing issues.\n" +
                "\nDue to the variety of apps, social media, games, and internet that technology provides are addicting and may negatively impact our daily lives. Technology has also provided an alternative to in-person communication, creating a reliance on virtual social interactions and increased anxiety in in-person interactions. Social media, cyber bullying, and information overload could also lead to anxiety, depression, and stress.");
        hConclusionText.setText("The overuse of technology leads to numerous physical, mental, and social health issues.. However, technological developments have advanced healthcare, allowing doctors to make accurate diagnoses and treat patients as necessary.");
    }
}
