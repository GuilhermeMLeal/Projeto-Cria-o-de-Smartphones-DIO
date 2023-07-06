package projetoCriaçãoIphone;

public class AparelhoTelefonico  extends Iphone{
	 private boolean Atender = false;
	    
	    public String atender() {
	    	
	        if (Atender == true) {
	            return "Olá"+ super.getDono();
	        } 
	        else 
	        	return "Olá, obrigado por me ligar!! Se tiver tempo eu te respondo";
	    }
	    
	    public void ligar() {
	        Atender = true;
	        for (int i = 0; i < 5; i++) {
                System.out.println("Trim Trim"); 
            }
	    }
	    
}
