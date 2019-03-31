
public class EnterOtherOptions extends WizardPanel {
    
    private int quality;
    private String comment,password;
    
   
    public EnterOtherOptions(String display) {
        super(display);
        initComponents();
        setFirstFocusable(passwordField);
    }
    
    private void initComponents() {
        passwordPanel = new javax.swing.JPanel();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        commentPanel = new javax.swing.JPanel();
        commentLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        commentTextArea = new javax.swing.JTextArea();
        qualityPanel = new javax.swing.JPanel();
        qualityLabel = new javax.swing.JLabel();
        qualitySlider = new javax.swing.JSlider();

        setLayout(new java.awt.BorderLayout());

        passwordPanel.setLayout(new javax.swing.BoxLayout(passwordPanel, javax.swing.BoxLayout.X_AXIS));

        passwordLabel.setText(" Password ");
        passwordPanel.add(passwordLabel);

        passwordPanel.add(passwordField);

        add(passwordPanel, java.awt.BorderLayout.NORTH);

        commentPanel.setLayout(new javax.swing.BoxLayout(commentPanel, javax.swing.BoxLayout.X_AXIS));

        commentLabel.setText(" Comment  ");
        commentLabel.setMaximumSize(new java.awt.Dimension(58, 16));
        commentLabel.setMinimumSize(new java.awt.Dimension(58, 16));
        commentPanel.add(commentLabel);

        jScrollPane1.setViewportView(commentTextArea);

        commentPanel.add(jScrollPane1);

        add(commentPanel, java.awt.BorderLayout.CENTER);

        qualityPanel.setLayout(new javax.swing.BoxLayout(qualityPanel, javax.swing.BoxLayout.X_AXIS));

        qualityLabel.setText(" Quality    ");
        qualityLabel.setMaximumSize(new java.awt.Dimension(58, 16));
        qualityLabel.setMinimumSize(new java.awt.Dimension(58, 16));
        qualityPanel.add(qualityLabel);

        qualitySlider.setMajorTickSpacing(10);
        qualitySlider.setMinorTickSpacing(1);
        qualitySlider.setPaintLabels(true);
        qualitySlider.setPaintTicks(true);
        qualitySlider.setSnapToTicks(true);
        qualitySlider.setValue(80);
        qualityPanel.add(qualitySlider);

        add(qualityPanel, java.awt.BorderLayout.SOUTH);

    }
    
    public boolean doValidation() {
        password = new String(passwordField.getPassword());
        quality = qualitySlider.getValue();
        comment = commentTextArea.getText();
        
        if( password.trim().length() == 0 ){
            javax.swing.JOptionPane.showMessageDialog(this,"Enter a password");
            passwordField.requestFocus();
            return false;
        }else if( quality < 40 ){
            javax.swing.JOptionPane.showMessageDialog(this,"Warning! Lower quality values will distort the image");                        
        }        
        return true;
    } 
   
    public java.lang.String getComment() {
        return comment;
    }       
       
    
    public java.lang.String getPassword() {
        return password;
    }       
    
    
    public int getQuality() {
        return quality;
    }    
    
    
    private javax.swing.JLabel qualityLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel passwordPanel;
    private javax.swing.JPanel commentPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextArea commentTextArea;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel commentLabel;
    private javax.swing.JPanel qualityPanel;
    private javax.swing.JSlider qualitySlider;
    
}
