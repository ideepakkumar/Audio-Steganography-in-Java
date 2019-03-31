
public class ShowEmbeddedFile extends WizardPanel {

    java.io.File inputFile,outputFile;

    public ShowEmbeddedFile(String display) {
        super(display);
        initComponents();
        imageSplitPane.setDividerLocation(0.5);
        imageSplitPane.
        revalidate();

        choiceButtonGroup.add(inputImageRadioButton);
        choiceButtonGroup.add(outputImageRadioButton);
    }


    public void setImageFiles(java.io.File inputFile,java.io.File outputFile){
        this.inputFile = inputFile;
        this.outputFile = outputFile;

        inputImageLabel.setIcon( new javax.swing.ImageIcon(inputFile.getAbsolutePath()));
        inputFileNameLabel.setText("Input File : "+inputFile.getAbsolutePath());
        outputImageLabel.setIcon( new javax.swing.ImageIcon(outputFile.getAbsolutePath()));
        outputFileNameLabel.setText("Output File : "+outputFile.getAbsolutePath());
    }
  
    private void initComponents() {
        choiceButtonGroup = new javax.swing.ButtonGroup();
        imageSplitPane = new javax.swing.JSplitPane();
        inputImagePanel = new javax.swing.JPanel();
        inputImageScrollPane = new javax.swing.JScrollPane();
        inputImageLabel = new javax.swing.JLabel();
        inputFileNameLabel = new javax.swing.JLabel();
        outputImagePanel = new javax.swing.JPanel();
        outputImageScrollPane = new javax.swing.JScrollPane();
        outputImageLabel = new javax.swing.JLabel();
        outputFileNameLabel = new javax.swing.JLabel();
        optionsPanel = new javax.swing.JPanel();
        inputImageRadioButton = new javax.swing.JRadioButton();
        outputImageRadioButton = new javax.swing.JRadioButton();

        setLayout(new java.awt.BorderLayout());

        imageSplitPane.setDividerLocation(100);
        imageSplitPane.setOneTouchExpandable(true);
        inputImagePanel.setLayout(new java.awt.BorderLayout());

        inputImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inputImageScrollPane.setViewportView(inputImageLabel);

        inputImagePanel.add(inputImageScrollPane, java.awt.BorderLayout.CENTER);

        inputImagePanel.add(inputFileNameLabel, java.awt.BorderLayout.NORTH);

        imageSplitPane.setRightComponent(inputImagePanel);

        outputImagePanel.setLayout(new java.awt.BorderLayout());

        outputImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        outputImageScrollPane.setViewportView(outputImageLabel);

        outputImagePanel.add(outputImageScrollPane, java.awt.BorderLayout.CENTER);

        outputImagePanel.add(outputFileNameLabel, java.awt.BorderLayout.NORTH);

        imageSplitPane.setLeftComponent(outputImagePanel);

        add(imageSplitPane, java.awt.BorderLayout.CENTER);

        inputImageRadioButton.setMnemonic('O');
        inputImageRadioButton.setText("Play Output Audio");
        inputImageRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputImageRadioButtonActionPerformed(evt);
            }
        });

        optionsPanel.add(inputImageRadioButton);

        outputImageRadioButton.setMnemonic('i');
        outputImageRadioButton.setText("Play Input Audio");
        outputImageRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputImageRadioButtonActionPerformed(evt);
            }
        });

        optionsPanel.add(outputImageRadioButton);

        add(optionsPanel, java.awt.BorderLayout.SOUTH);

    }

    private void outputImageRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("Code to play..");
        System.out.println("Code to Play Audio...");
    System.out.println("AudioFile Path"+ outputFile.getParent());
    System.out.println("AudioFile Name..."+ outputFile.getName());
    String url="file:///"+inputFile.getParent()+"//";
    System.out.println("URL.."+ url);
    new SoundApplication(url,outputFile.getName());
    }

    private void inputImageRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
 
        System.out.println("Code to play..");
        System.out.println("Code to Play Audio...");
    System.out.println("AudioFile Path"+ inputFile.getParent());
    System.out.println("AudioFile Name..."+ inputFile.getName());
    String url="file:///"+inputFile.getParent()+"//";
    System.out.println("URL.."+ url);
    new SoundApplication(url,inputFile.getName());

    }

    public boolean doValidation() {
        return true;
    }


    private javax.swing.JLabel outputImageLabel;
    private javax.swing.JScrollPane inputImageScrollPane;
    private javax.swing.JLabel inputFileNameLabel;
    private javax.swing.JRadioButton inputImageRadioButton;
    private javax.swing.JRadioButton outputImageRadioButton;
    private javax.swing.JPanel inputImagePanel;
    private javax.swing.JScrollPane outputImageScrollPane;
    private javax.swing.JLabel outputFileNameLabel;
    private javax.swing.ButtonGroup choiceButtonGroup;
    private javax.swing.JPanel outputImagePanel;
    private javax.swing.JSplitPane imageSplitPane;
    private javax.swing.JPanel optionsPanel;
    private javax.swing.JLabel inputImageLabel;

}
