
public class VerifyOptions extends WizardPanel {
    
    javax.swing.JTable choiceTable;
    public VerifyOptions(String display) {
        super(display);
        initComponents();
        
    }
    
    public void showChosenOptions(EmbedExtractOptions eo){
        javax.swing.JScrollPane viewPane=null;
        if(choiceTable==null && viewPane==null) {
            choiceTable = new javax.swing.JTable(eo);
            viewPane = new javax.swing.JScrollPane(choiceTable);
            add(viewPane,java.awt.BorderLayout.CENTER);
        }else{
            choiceTable.setModel(eo);
        }        
        
    }
    

    private void initComponents() {
        messageLabel = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        messageLabel.setText("Click next to start the embedding process");
        add(messageLabel, java.awt.BorderLayout.SOUTH);

    }    
    public boolean doValidation() {
        return true;
    }
    
    
    private javax.swing.JLabel messageLabel;
    
}
