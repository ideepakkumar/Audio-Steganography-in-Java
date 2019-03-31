
public class SelectDataToEmbed extends WizardPanel {
    
    private java.io.File selectedFile;
    private boolean textOrFile;
    private String embeddedText;
    
    public SelectDataToEmbed(String display) {
        super(display);
        initComponents();
        choiceButtonGroup.add(selectFileRadioButton);
        choiceButtonGroup.add(enterTextRadioButton);        
        setFirstFocusable(selectFileRadioButton);
    }
    
   
    private void initComponents() {
        choiceButtonGroup = new javax.swing.ButtonGroup();
        choicePanel = new javax.swing.JPanel();
        selectFileRadioButton = new javax.swing.JRadioButton();
        enterTextRadioButton = new javax.swing.JRadioButton();
        optionsPanel = new javax.swing.JPanel();
        selectFilePanel = new javax.swing.JPanel();
        selectFileLabel = new javax.swing.JLabel();
        chooseFilePanel = new javax.swing.JPanel();
        embedFileTextField = new javax.swing.JTextField();
        selectButton = new javax.swing.JButton();
        enterTextPanel = new javax.swing.JPanel();
        enterTextScrollPane = new javax.swing.JScrollPane();
        embedTextArea = new javax.swing.JTextArea();
        embedLabel = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        choicePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2));
        selectFileRadioButton.setMnemonic('S');
        selectFileRadioButton.setSelected(true);
        selectFileRadioButton.setText("Select File");
        selectFileRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFileRadioButtonActionPerformed(evt);
            }
        });

        choicePanel.add(selectFileRadioButton);

        enterTextRadioButton.setMnemonic('E');
        enterTextRadioButton.setText("Enter Text");
        enterTextRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterTextRadioButtonActionPerformed(evt);
            }
        });

        choicePanel.add(enterTextRadioButton);

        add(choicePanel, java.awt.BorderLayout.NORTH);

        optionsPanel.setLayout(new java.awt.CardLayout());

        optionsPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2));
        selectFilePanel.setLayout(new java.awt.BorderLayout());

        selectFileLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectFileLabel.setText("Select the file to embed");
        selectFileLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2));
        selectFilePanel.add(selectFileLabel, java.awt.BorderLayout.CENTER);

        chooseFilePanel.setLayout(new java.awt.BorderLayout());

        embedFileTextField.setEditable(false);
        chooseFilePanel.add(embedFileTextField, java.awt.BorderLayout.CENTER);

        selectButton.setMnemonic('F');
        selectButton.setText("Select File");
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });

        chooseFilePanel.add(selectButton, java.awt.BorderLayout.EAST);

        selectFilePanel.add(chooseFilePanel, java.awt.BorderLayout.SOUTH);

        optionsPanel.add(selectFilePanel, "card3");

        enterTextPanel.setLayout(new java.awt.BorderLayout());

        enterTextScrollPane.setViewportView(embedTextArea);

        enterTextPanel.add(enterTextScrollPane, java.awt.BorderLayout.CENTER);

        embedLabel.setText("Enter the text to be embedded into the image");
        enterTextPanel.add(embedLabel, java.awt.BorderLayout.SOUTH);

        optionsPanel.add(enterTextPanel, "card2");

        add(optionsPanel, java.awt.BorderLayout.CENTER);

    }
    
    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {
        javax.swing.JFileChooser chooser = new javax.swing.JFileChooser(".");
        if(  embedFileTextField.getText() != null)
            chooser.setSelectedFile(new java.io.File(embedFileTextField.getText()));
        if( chooser.showOpenDialog(this) == javax.swing.JFileChooser.APPROVE_OPTION){
            selectedFile = chooser.getSelectedFile();
            embedFileTextField.setText(selectedFile.getAbsolutePath());
        }
    }
    
    private void enterTextRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        ((java.awt.CardLayout)optionsPanel.getLayout()).previous(optionsPanel);
        textOrFile = true;
    }
    
    private void selectFileRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        ((java.awt.CardLayout)optionsPanel.getLayout()).next(optionsPanel);
        textOrFile = false;
    }
    
    public boolean doValidation() {        
        embeddedText = embedTextArea.getText().trim();
        if( selectFileRadioButton.isSelected() ){
            if( embedFileTextField.getText().length() == 0 ) {
                javax.swing.JOptionPane.showMessageDialog(this,"Select an input file");
                selectButton.requestFocus();
                return false;
            }else if( ! new java.io.File(embedFileTextField.getText()).exists()  ){
                javax.swing.JOptionPane.showMessageDialog(this,"File not found! Select an valid file");
                selectButton.requestFocus();
                return false;
            }
        }else if( enterTextRadioButton.isSelected() ){
            if( embeddedText.length() == 0 ){
                javax.swing.JOptionPane.showMessageDialog(this,"Enter some text to embed");
                embedTextArea.requestFocus();
                return false;
            }
        }        
        return true;
    }
    
 
    public boolean isTextOrFile() {
        return textOrFile;
    }    
    
    public void setTextOrFile(boolean textOrFile) {
        this.textOrFile = textOrFile;
    }
    
    public java.lang.String getEmbeddedText() {
        return embeddedText;
    }
    
  
    public java.io.File getSelectedFile() {
        return selectedFile;
    }    
 
    private javax.swing.JLabel selectFileLabel;
    private javax.swing.JRadioButton enterTextRadioButton;
    private javax.swing.JPanel choicePanel;
    private javax.swing.JPanel enterTextPanel;
    private javax.swing.JLabel embedLabel;
    private javax.swing.JScrollPane enterTextScrollPane;
    private javax.swing.JTextField embedFileTextField;
    private javax.swing.JRadioButton selectFileRadioButton;
    private javax.swing.JTextArea embedTextArea;
    private javax.swing.JPanel chooseFilePanel;
    private javax.swing.JButton selectButton;
    private javax.swing.JPanel selectFilePanel;
    private javax.swing.ButtonGroup choiceButtonGroup;
    private javax.swing.JPanel optionsPanel;
       
}
