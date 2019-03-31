
public class WizardButtonEvent extends java.util.EventObject {
    
    private int buttonType;
    
    private java.awt.Component card;
    
  
    private int cardPosition;
    
    public WizardButtonEvent(WizardFrame wf,int buttonType,
           java.awt.Component card,int cardPosition) {
        super(wf);       
        this.buttonType = buttonType;       
        this.card = card;      
        this.cardPosition = cardPosition;
    }
    
   
    public int getButtonType() {
        return buttonType;
    }
   
    public void setButtonType(int buttonType) {
        this.buttonType = buttonType;
    }
    
  
    public java.awt.Component getCard() {
        return card;
    }
    
    public void setCard(java.awt.Component card) {
        this.card = card;
    }
    
   
    public int getCardPosition() {
        return cardPosition;
    }
    
  
    public void setCardPosition(int cardPosition) {
        this.cardPosition = cardPosition;
    }
    
}
