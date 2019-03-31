
public class GuiUtils {
    
    public GuiUtils() {
    }
    public static javax.swing.JFileChooser getImageFileChooser(){
        javax.swing.JFileChooser chooser = new javax.swing.JFileChooser(".");
        chooser.setFileFilter( new javax.swing.filechooser.FileFilter(){
            public boolean accept(java.io.File file){
                if( file.isDirectory())  return true;
                if(file.getName().endsWith(".wav"))  return true;
                return false;
            }
            public String getDescription(){
                return "wav files";
            }
            
        });
        return chooser;
    }  
     
}
