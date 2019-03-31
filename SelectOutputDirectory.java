
public class SelectOutputDirectory extends WizardPanel {

    java.io.File outputDirectory;

    public SelectOutputDirectory(String stepText) {
        super(stepText);
        initComponents();
        setFirstFocusable(selectButton);
    }

 
    private void initComponents() {
        selectFileLabel = new javax.swing.JLabel();
        selectFilePanel = new javax.swing.JPanel();
        imageTextField = new javax.swing.JTextField();
        selectButton = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());
        selectFileLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectFileLabel.setText("Select the output directory");
        selectFileLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2));
        add(selectFileLabel, java.awt.BorderLayout.CENTER);

        selectFilePanel.setLayout(new java.awt.BorderLayout());

        selectFilePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2));
        selectFilePanel.add(imageTextField, java.awt.BorderLayout.CENTER);

        selectButton.setMnemonic('D');
        selectButton.setText("Select Directory");
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });

        selectFilePanel.add(selectButton, java.awt.BorderLayout.EAST);

        add(selectFilePanel, java.awt.BorderLayout.SOUTH);

    }

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {
       
        javax.swing.JFileChooser chooser = new javax.swing.JFileChooser(".");
        if(imageTextField.getText() != null)
            chooser.setSelectedFile(new java.io.File(imageTextField.getText()));
        chooser.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        if( chooser.showOpenDialog(this) == javax.swing.JFileChooser.APPROVE_OPTION){
            outputDirectory = chooser.getSelectedFile();
            imageTextField.setText(outputDirectory.getAbsolutePath());
        }
    }

    public boolean doValidation() {
        if( imageTextField.getText().length() == 0 ) {
            javax.swing.JOptionPane.showMessageDialog(this,"Select an output directory");
            selectButton.requestFocus();
            return false;
        }else if( new java.io.File(imageTextField.getText()) == null ){
            javax.swing.JOptionPane.showMessageDialog(this,"Select an valid directory/path");
            selectButton.requestFocus();
            return false;
        }else if( ! new java.io.File(imageTextField.getText()).exists()  ){
            javax.swing.JOptionPane.showMessageDialog(this,"Directory does not exist!");
            selectButton.requestFocus();
            return false;
        }else if( ! new java.io.File(imageTextField.getText()).isDirectory()  ){
            javax.swing.JOptionPane.showMessageDialog(this,"File is not a directory!");
            selectButton.requestFocus();
            return false;
        }
        return true;
    }

  
    public java.io.File getOutputDirectory() {
        return outputDirectory;
    }

    private javax.swing.JLabel selectFileLabel;
    private javax.swing.JTextField imageTextField;
    private javax.swing.JButton selectButton;
    private javax.swing.JPanel selectFilePanel;

}
