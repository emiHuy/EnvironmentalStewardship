import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class ImpactsPanel extends JPanel{
    private JPanel parentImpactsPanel;
    private JScrollPane scrollPane;
    private JTabbedPane tabbedPane;
    private JLabel ePositiveImpactHeader;
    private JTextPane ePositiveImpactText;
    private JLabel ePositiveImpactImage;
    private JTextPane ePositiveImpactCaption;
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
        setupGeneralComponents();
        setupHealthImpacts();
        setupEnvironmentalImpacts();
    }

    private void setupGeneralComponents(){
        // Setup panel
        setLayout(new GridLayout());
        add(parentImpactsPanel);

        // Display intro text
        generalText.setText("Over the years, technology has become increasingly significant to our society. As technology serves a variety of uses, it positively and negatively impacts the environment and human health.");

        // Add borders
        generalText.setBorder(new EmptyBorder(0,0,50,0));
        header.setBorder(new EmptyBorder(50,0,50,0));

        // Modify scroll bar
        UIManager.put("ScrollBar.width", 25);
        scrollPane.setVerticalScrollBar(scrollPane.createVerticalScrollBar());
    }

    private void modifyComponent(JTextPane[] paneList, JLabel[] labelList){
        int count = 0;
        for(JTextPane pane : paneList){
            if(count < 2){
                pane.setBorder(new EmptyBorder(30, 0, 0, 0));
            }
            else if(count == 2){
                pane.setBorder(new EmptyBorder(50, 0, 100, 0));
            }
            else{
                // Center-align text
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
        JTextPane[] paneList = {ePositiveImpactText, eNegativeImpactText, eConclusionText, ePositiveImpactCaption, eNegativeImpactCaption, generalText};
        JLabel[] labelList = {ePositiveImpactHeader, eNegativeImpactHeader, eConclusionHeader};
        modifyComponent(paneList, labelList);

        // Set images
        ePositiveImpactImage.setIcon(new ImageIcon("positive environmental impact image.jpg"));
        eNegativeImpactImage.setIcon(new ImageIcon("negative environmental impact image.jpg"));

        // Set image captions
        ePositiveImpactCaption.setText("Wind turbines and solar panels that generate electricity from wind energy and solar energy, respectively.");
        eNegativeImpactCaption.setText("E-waste landfill filled with unwanted electronic devices.");

        // Set main text information
        ePositiveImpactText.setText("With the help of technology, clean and renewable energy sources such as the wind and sun could be harnessed to provide our energy needs, reducing greenhouse gas emissions and dependence on fossil fuels, a cause of global warming. \n" +
                "\nAdditionally, technology has helped optimize waste management by automating waste sorting and separation systems. Sensors and trackers also monitor waste streams. Thus, technology ensures safe, appropriate, and efficient waste management.\n" +
                "\nIn addition to managing waste, technology also helps manage natural resources. By applying AI and machine learning to minimize pesticides and fertilizers and track natural resources, technology optimizes the consumption and long-term sustainability of resources.\n");
        eNegativeImpactText.setText("Although technology can positively impact the environment, it can also harm it.\n" +
                "\nWith newer devices released often, older yet still functional devices are discarded. Technotrash or e-waste (unwanted and broken electronic products) is the most rapidly growing waste type. Electronic devices consist of non-biodegradable and toxic materials that can leak into the ground when improperly disposed of (ie. in landfills), contaminating water, plants, and animals. \n" +
                "\nAdditionally, factories that produce electronics take up land space, release greenhouse gas emissions, and disrupt ecosystems. On top of factories, collecting the materials required to make devices further causes environmental harm, such as deforestation and resource degradation.\n" +
                "\nIn addition to negative impacts in manufacturing, there are negative impacts that come with technology use. Servers and data banks that devices require for operation consume large amounts of energy. Energy today primarily comes from non-renewable sources that contribute to greenhouse gas emissions.");

        // Set conclusion
        eConclusionText.setText("While technology makes our lives easier and sources our energy needs for daily activities, it comes at the cost of pollution, greenhouse gases, and environmental harm.");
    }

    private void setupHealthImpacts(){
        JTextPane[] paneList = {hPositiveImpactText, hNegativeImpactText, hConclusionText, hPositiveImpactCaption, hNegativeImpactCaption};
        JLabel[] labelList = {hPositiveImpactHeader, hNegativeImpactHeader, hConclusionHeader};
        modifyComponent(paneList, labelList);

        // Set images
        hPositiveImpactImage.setIcon(new ImageIcon("positive health impact image.jpg"));
        hNegativeImpactImage.setIcon(new ImageIcon("negative health impact image.jpg"));

        // Set captions
        hPositiveImpactCaption.setText("Medical healthcare professionals looking at brain scans produced by technology.");
        hNegativeImpactCaption.setText("Person addicted to screen - the blue light emitted from his device is disrupting his sleep.");

        // Set main text information
        hPositiveImpactText.setText("Technological advancements have made huge impacts on healthcare. \n" +
                "\nPatients can now meet and communicate with healthcare professionals and access test results remotely. As such, patients do not always need to travel to doctor’s offices and clinics, minimizing the amount of greenhouse gases produced.\n" +
                "\nTechnology is used in healthcare facilities to produce images of the body, make diagnoses, assist in treatment, and monitor vital signs, improving healthcare accuracy. Technology has helped develop vaccines, cure diseases, and potentially, in the future, cure genetic disorders. \n" +
                "\nEven health applications can track illnesses, diets, exercises, mental health, and menstrual cycles, helping individuals manage their health needs.");
        hNegativeImpactText.setText("Technology is widely used today by individuals of many different ages. Overuse of technology is correlated to a variety of health issues that include and relate to musculoskeletal problems, digital eye strain, disrupted sleep, hearing issues, and physical inactivity.\n" +
                "\nThe variety of apps that electronic devices provide, like social media and video game apps, were made to be addicting, causing unnecessary reliance on electronics.\n" +
                "\nTechnology has also provided an alternative to in-person communication by making virtual and anonymous social interactions possible - everything is online. Therefore, with social media, cyberbullying, and the lack of in-person interactions, technology could lead to anxiety, depression, and stress for many individuals.");

        // Set conclusion
        hConclusionText.setText("While excessive use of technology leads to numerous physical, mental, and social health issues, technological developments have advanced healthcare, allowing doctors to make accurate diagnoses and treat patients more effectively.");
    }
}