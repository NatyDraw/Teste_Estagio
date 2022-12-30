package provedor;

/**
 * Classe criada para implementar o endereco e poder usar os metodos, 
 * de separar o numero do nome da rua
 * @author ~~{ Natalia Souza }~~
 * @since Classe criada 29/12/2022
 */
public class Endereco {

	//Atributos
	private String endCompleto;
	
	//Construtores
    public Endereco () {
        this.endCompleto = "";
    }
    public Endereco (String endCompleto) {
        this.endCompleto = endCompleto;
    }
	
	//Gets
    public String getendCompleto() {
        return this.endCompleto;
    }
    
	//Sets
    public void setendCompleto(String endCompleto) {
        this.endCompleto = endCompleto;
    }
    
    //metodos
    public void separarEnd(String endCompleto) {
        int i, cont=0;
    	char ch;
    	//String endCompleto;
       // String [] word = new String [1];      
       // String [] num = new String [1];
      	//endCompleto = "30 DAE";
      	//System.out.println(endCompleto.length());
      	
      	
    	for (i = 0; i < endCompleto.length(); i++) {
        	ch = endCompleto.charAt(i);
          	if (ch == ' ') {
          		cont ++;
        	}
        }
    	
    	String [] result = new String[2];
    	result = endCompleto.split(" ");
        //You can also use Pattern.quote method if you find escaping escape characters
        //String[] output = string1.split(Pattern.quote("."));

    	switch (cont) {
    	case 1://Espacos na String endCompleto
    		
    		if(result[0]!= null && result[0].matches("[0-9]*")) {
    			//Se a primeira palavra for um numero
        		System.out.println("{'" + result[1] + 
	        			"', '" + result[0] + "'}");
    		}
		    else {
		    	//Se não
        		System.out.println("{'" + result[0] + 
	        			"', '" + result[1] + "'}");
	        	break;
    		}
		    	
    	case 2://Espacos na String endCompleto
    		
    		if (result[0] != null && result[0].matches("[0-9]*")) {
    			//Se a primeira palavra for um numero
	        		System.out.println("{'" + result[1] + " " + result[2] +
		        			"', '" + result[0] + "'}");
	        		break;
	        }
    		else {
    			if (result[1] != null && result[1].matches("[A-z,]*")) {
    				//Se segunda palavra ter uma ","
    	        	System.out.println("{'" + result[0] + " " + 
    	        			result[1].substring(0, result[1].length()-1) + "', '" + result[2] + "'}");
    	            break;
    	        }
    			else if (result[2] != null && result[2].matches("[0-9]*")) {
    				//Se terceira palavra for um numero
    	        	System.out.println("{'" + result[0] + " " + result[1] +
    	        			"', '" + result[2] + "'}");
    	        	break;
	            }
    		}
    		
    	case 3://Espacos na String endCompleto

    		if (result[1] != null && result[1].matches("[0-9]*") && 
    				result[3] != null && result[3].matches("[0-9]*") ) {
    			// se a segunda e a quarta palavra forem numeros
	        	System.out.println("{'" + result[0] + " " + result[1] + "', '" + result[2] +
	        			" " + result[3] + "'}");
	            break;
	        }
    		else {
    			if (result[2] != null && result[2].matches("[0-9]*") && result[3].matches("[A-z]*")) {
    				//Se terceira palavra é um numero e a quarta palavra for uma letra	
		        	System.out.println("{'" + result[0] + " " + result[1] +
		        			"', '" + result[2] + " " + result[3] + "'}");
		            break;
    			}
    			else
    				if(result[0]!= null && result[0].matches("[0-9]*")) {
    					//Se a primeira palavra é um numero"
			        	System.out.println("{'" + result[1] + " " + result[2] +
			        			" " + result[3] + "', '" + result[0] + "'}");
			            break;
	        		}
    				else 
    					if(result[2]!= null && result[2].matches("[A-z,]*")) {
	    					//Se a segunda palavra contenha uma ","
				        	System.out.println("{'" + result[0] + " " + result[1] +
				        			" " + result[2].substring(0, result[2].length()-1) + "', '" + result[3] + "'}");
				            break;
	        		}
	        }

    	case 4://Espacos na String endCompleto
    		
    		if (result[0] != null && result[0].matches("[0-9]*")) {
    			//Se a primeira palavra tenha um numero 
    				System.out.println("{'" + result[1] + " " + result[2] + " " + result[3] + " " + result[4] +
    	        			"', '" + result[0] + "'}");
    				break;				
	        }
    		else 
    			if(result[0].matches("[0-9,]*")) {
    				//Se a primeira palavra é um numero e tenha "," 
		        	System.out.println("{'" + result[1] + " " + result[2] + " " + result[3] + " " + result[4] +
		        			"', '" + result[0].substring(0, result[1].length()-1) + "'}");
		        	break;
				}
    			else
 		        	if(result[3] != null && result[3].matches("[0-9]*") || result[4] != null && result[4].matches("[A-z]*")) {
 		        		//Se a quarta palavra é um numero e a quinta palavra é uma letra 
			        	System.out.println("{'" + result[0] + " " + result[1] +
			        			" " + result[2] + "', ' " + result[3] + " " + result[4] + "'}");
			            break;	
 		        	}
     
    	}
    }
    
}
/*
 * Starlight Draw
 */