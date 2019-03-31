public abstract class WizardPanel extends javax.swing.JPanel implements java.awt.event.FocusListener
 {
    private javax.swing.JLabel wizardLabel = null;
    private String stepText = null;
    private java.awt.Component firstFocusable = null;
    public WizardPanel(String stepText)
 {       
        this.stepText = stepText;
        initComponents();
    }           
    
  
    private void initComponents()
 {	
        setLayout(new java.awt.BorderLayout());
 }

    public void focusGained(java.awt.event.FocusEvent focusEvent)
 {                
        //javax.swing.JOptionPane.showMessageDialog(this,"Gain");
        if( wizardLabel == null ) return;               
        wizardLabel.setFont(wizardLabel.getFont().deriveFont(java.awt.Font.BOLD));
        if( firstFocusable != null ) firstFocusable.requestFocus();
           
    }    
    
    public void focusLost(java.awt.event.FocusEvent focusEvent) {      
        //javax.swing.JOptionPane.showMessageDialog(this,"Loss");
        if( wizardLabel == null ) return;        
        wizardLabel.setFont(wizardLabel.getFont().deriveFont(java.awt.Font.PLAIN));        
    }    
    
    public abstract boolean doValidation();
    
   
    public javax.swing.JLabel getWizardLabel() {
        return wizardLabel;
    }
    
   
    public void setWizardLabel(javax.swing.JLabel wizardLabel)
 {
        this.wizardLabel = wizardLabel;
    }
    
    
    public java.lang.String getStepText() {
        return stepText;
    }
    
   
    public void setStepText(java.lang.String stepText)
 {
        this.stepText = stepText;
    }
    
    
    public java.awt.Component getFirstFocusable()
 {
        return firstFocusable;
    }
    
    
    public void setFirstFocusable(java.awt.Component firstFocusable)
 {
        this.firstFocusable = firstFocusable;
    }
    
   
}
