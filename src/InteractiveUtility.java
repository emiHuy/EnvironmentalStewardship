// Used to create and access interactive questions
public class InteractiveUtility {
    private static Question[] questionList;

    public static Question[] getQuestionList(){
        return questionList;
    }

    public static void createQuestions(){
        Question question1 = new Question("1. Technologies are used in waste management. It helps optimize waste management... ",
                "A. By increasing non-renewable resource usage",
                "B. By automating waste sorting and separation systems",
                "C. By encouraging e-waste production",
                "D. By clearing land for waste processing factories",
                "B. By automating sorting and waste separation systems");

        Question question2 = new Question("2. What is a significant negative environmental impact of technology related to its disposal?",
                "A. Reduction in greenhouse gas emissions",
                "B. Creation of renewable energy",
                "C. Generation of e-waste",
                "D. Optimization of natural resource management",
                "C. Generation of e-waste");

        Question question3 = new Question("3. Which health issue is NOT mentioned as a consequence of prolonged technology use?",
                "A. Digital eye strain",
                "B. Hearing issues",
                "C. Enhanced physical activity",
                "D. Disrupted Sleep",
                "C. Enhanced physical activity");

        Question question4 = new Question("4. How has technology positively impacted healthcare?",
                "A. By increasing the need for patient transportation",
                "B. By creating more energy-intensive servers",
                "C. By providing remote consultations and accurate diagnostics",
                "D. By causing more environmental pollution",
                "C. By providing remote consultations and accurate diagnostics");

        Question question5 = new Question("5. What should you regularly do on your devices to minimize your carbon footprint?",
                "A. Delete old emails",
                "B. Check the news or social media for latest updates",
                "C. Trash old devices",
                "D. A and C",
                "A. Delete old emails");

        Question question6 = new Question("6. How early (at the very least) should you put down your devices before bedtime?",
                "A. One and a half hours",
                "B. Two hours",
                "C. Thirty minutes",
                "D. One hour", "D. One hour");

        Question question7 = new Question("7. How can we minimize the amount of e-waste that gets dumped into landfills?",
                "A. Use devices for as long as possible",
                "B. Turn off lights when not use",
                "C. Set screen time limits",
                "D. Unsubscribe to unwanted emails",
                "A. Use devices for as long as possible");

        Question question8 = new Question("8. How often should you take breaks when using technology for longer periods of time?",
                "A. Whenever I feel like taking a break",
                "B. Twenty to thirty minutes",
                "C. One and a half hours to two hours",
                "D. About one hour", "B. Twenty to thirty minutes");

        Question question9 = new Question("9. Which Canadian, non-for-profit organization recycles batteries?",
                "A. Electronic Products Recycling Association",
                "B. Canadian Environmental Protection Act Registry",
                "C. Quantum Lifecycle Partners",
                "D. Call2Recycle",
                "D. Call2Recycle");

        Question question10 = new Question("10. How is the City of Ottawa trying to reduce greenhouse gas emissions?",
                "A. By helping homeowners cover energy improvement costs with loans",
                "B. By offering electronic recycling services",
                "C. By limiting transportation",
                "D. All of the above",
                "A. By helping homeowners cover energy improvement costs with loans");

        Question question11 = new Question("11. Which private business promotes the recycling of numerous items (ie. ink, batteries, etc)?",
                "A. Best Buy",
                "B. Staples",
                "C. Quantum Lifestyle Partners",
                "D. EnviroCentre",
                "B. Staples");

        Question question12 = new Question("12. What Canadian Act regulates and minimizes pollution and hazardous waste?",
                "A. Canadian Controlled Waste Act",
                "B. Canadian Environmental Protection Act",
                "C. Canadian Waste Disposal Act",
                "D. Canadian Going Green Act",
                "B. Canadian Environmental Protection Act");

        questionList = new Question[]{question1, question2, question3, question4, question5, question6, question7, question8, question9, question10, question11, question12};
    }
}
