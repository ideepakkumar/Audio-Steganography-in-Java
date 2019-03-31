
public class EnterPassword extends WizardPanel {
    
    private java.io.File outputDirectory;
    private String password;
    
    public EnterPassword(String stepText) {
        super(stepText);
        initComponents();
        setFirstFocusable(passwordField);
    }
    
 
    private void initComponents() {
        selectFileLabel = new javax.swing.JLabel();
        selectFilePanel = new javax.swing.JPanel();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();

        setLayout(new java.awt.BorderLayout());

        selectFileLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectFileLabel.setText("Enter the password and click next to start the extraction");
        selectFileLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2));
        add(selectFileLabel, java.awt.BorderLayout.CENTER);

        selectFilePanel.setLayout(new java.awt.BorderLayout());

        selectFilePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2));
        passwordLabel.setText("  Password  ");
        selectFilePanel.add(passwordLabel, java.awt.BorderLayout.WEST);

        selectFilePanel.add(passwordField, java.awt.BorderLayout.CENTER);

        add(selectFilePanel, java.awt.BorderLayout.SOUTH);

    }
        
    public boolean doValidation() {
        password = new String(passwordField.getPassword());
        
        
        if( password.trim().length() == 0 ){
            javax.swing.JOptionPane.showMessageDialog(this,"Enter a password");
            passwordField.requestFocus();
            return false;
        }
        return true;
    }
    
   
    public java.io.File getOutputDirectory() {
        return outputDirectory;
    }        
    
    
   
    public String getPassword() {
        return password;
    }        
    
    
    private javax.swing.JLabel selectFileLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPanel selectFilePanel;
    
}
