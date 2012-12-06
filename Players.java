/*
 * John Ko
 * CSC-18A 
 * 47376
 */
package blackjack;

/**
 *
 * @author usb
 */
public abstract class Players {
	
	 private int handTotal;
    
    public void setHandTotal(int total) {
        handTotal = total;
    }
    
    public int getHandTotal() {
        return handTotal;
    }
            
    public Boolean isHandGreater(Players a) {
        if (handTotal > a.handTotal) {
            return true;
        }
        return false;
    }
    
    public Boolean isHandEqual(Players a) {
        if(handTotal == a.handTotal) {
            return true;
        }
        return false;
    }
    
    public Boolean isBust() {
        if(handTotal > 21) {
            return true;
        }
        return false;
    }
}
