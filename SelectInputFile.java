
import java.io.*;
public class SelectInputFile extends WizardPanel {
    private java.io.File selectedFile;

  
    public SelectInputFile(String stepText) {
        super(stepText);
        initComponents();
   
    }

    private void initComponents() {
        selectPanel = new javax.swing.JPanel();
        imageTextField = new javax.swing.JTextField("");
        selectButton = new javax.swing.JButton();
        imageScrollPane = new javax.swing.JScrollPane();
        audioLabel = new javax.swing.JLabel("" );
        imagePreviewLabel = new javax.swing.JLabel("Audio preview");
        playaudio=new javax.swing.JButton("Play Audio");

        setLayout(new java.awt.BorderLayout());

        selectPanel.setLayout(new java.awt.BorderLayout());

        selectPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2));
        imageTextField.setEditable(false);
        selectPanel.add(playaudio,java.awt.BorderLayout.NORTH);

        playaudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playaudioActionPerformed(evt);
            }
        });



        selectPanel.add(imageTextField, java.awt.BorderLayout.CENTER);

        selectButton.setMnemonic('F');
        selectButton.setText("Select File");

        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });

        selectPanel.add(selectButton, java.awt.BorderLayout.EAST);

        add(selectPanel, java.awt.BorderLayout.SOUTH);

          audioLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
          audioLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2));

          add(imageScrollPane, java.awt.BorderLayout.CENTER);

        audioLabel.setText("Play Audio");
        System.out.println(audioLabel.getText());
       
        imagePreviewLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagePreviewLabel.setText("Audio Preview");
        add(imagePreviewLabel, java.awt.BorderLayout.NORTH);

    }

    private void playaudioActionPerformed(java.awt.event.ActionEvent evt) {
    if(imageTextField.getText()==null)
         {
			javax.swing.JOptionPane.showMessageDialog(this,"Select an input file first");

           }
    else
   	{

    System.out.println("Code to Play Audio...");
    System.out.println("AudioFile Path"+ selectedFile.getParent());
    System.out.println("AudioFile Name..."+ selectedFile.getName());
    String url="file:///"+selectedFile.getParent()+"//";
    System.out.println("URL.."+ url);
    new SoundApplication(url,selectedFile.getName());
		}
    }

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {
        javax.swing.JFileChooser chooser = GuiUtils.getImageFileChooser();
        if(imageTextField.getText() != null)
            chooser.setSelectedFile(new java.io.File(imageTextField.getText()));
        if( chooser.showOpenDialog(this) == javax.swing.JFileChooser.APPROVE_OPTION){
            selectedFile = chooser.getSelectedFile();
            audioLabel.setText("Play File");
            audioLabel.show();
            audioLabel.setVisible(true);
            imageTextField.setText(selectedFile.getAbsolutePath());
        }
    }

    public boolean doValidation() {
        if( imageTextField.getText().length() == 0 ) {
            javax.swing.JOptionPane.showMessageDialog(this,"Select an input file");
            selectButton.requestFocus();
            return false;
        }else if( ! new java.io.File(imageTextField.getText()).exists()  ){
            javax.swing.JOptionPane.showMessageDialog(this,"File not found! Select an valid file");
            selectButton.requestFocus();
            return false;
        }
        return true;
    }

    public java.io.File getSelectedFile() {
        return selectedFile;
    }


    private javax.swing.JTextField imageTextField;
    private javax.swing.JPanel selectPanel;
    private javax.swing.JLabel audioLabel;
    private javax.swing.JScrollPane imageScrollPane;
    private javax.swing.JButton selectButton;
    private javax.swing.JLabel imagePreviewLabel;
    private javax.swing.JButton playaudio;



}
