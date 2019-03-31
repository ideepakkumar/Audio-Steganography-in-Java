
public class ShowProcessDetails extends WizardPanel {
    
    public ShowProcessDetails(String details) {
        super(details);
        initComponents();
    }
    
    
    public void setDisplayText(String text){
        embedLabel.setText(text);
    }
    
    public void addOutputLine(String line){
        outputTextArea.append(line+"\n");
    }
    
    private void initComponents() {
        outputScrollPane = new javax.swing.JScrollPane();
        outputTextArea = new javax.swing.JTextArea();
        embedLabel = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        outputTextArea.setEditable(false);
        outputScrollPane.setViewportView(outputTextArea);

        add(outputScrollPane, java.awt.BorderLayout.CENTER);

        embedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        embedLabel.setText("Embedding Data In Audio...");
        add(embedLabel, java.awt.BorderLayout.NORTH);

    }

    public boolean doValidation() {
        return true;
    }    
    
    
    private javax.swing.JTextArea outputTextArea;
    private javax.swing.JScrollPane outputScrollPane;
    private javax.swing.JLabel embedLabel;
    
}
