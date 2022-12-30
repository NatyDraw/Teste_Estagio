package provedor;  

/**
 * Classe criada para implementar o endereco e poder usar os metodos, 
 * de separar o numero do nome da rua
 * @author ~~{ Natalia Souza }~~
 * @since Classe criada em: 29 Dez. 2022.
 */
public class TesteEndereco {

	public static void main(String[] args) {
		String endCompleto;
    	Endereco endereco1 = new Endereco();
    	Endereco endereco2 = new Endereco();
    	Endereco endereco3 = new Endereco();
    	
    	//test 1 
    	endCompleto = "Miritiba 339";
    	endereco1.separarEnd(endCompleto);
    	endCompleto = "Babaçu 500";
    	endereco1.separarEnd(endCompleto); 
    	endCompleto = "Cambuí 804B";
    	endereco1.separarEnd(endCompleto);
    	
    	//test 2
    	endCompleto = "Rio Branco 23";
    	endereco2.separarEnd(endCompleto);
    	endCompleto = "Quirino dos Santos 23 b";
    	endereco2.separarEnd(endCompleto); 
    	
    	//test obciol 3
    	endCompleto = "4, Rue de la République";
    	endereco3.separarEnd(endCompleto);
    	endCompleto = "100 Broadway Av";
    	endereco3.separarEnd(endCompleto);
    	endCompleto = "Calle Sagasta, 26";//falhou
    	endereco3.separarEnd(endCompleto);
    	endCompleto = "Calle 44 No 1991";
    	endereco3.separarEnd(endCompleto);
    	
	}
}
/*
 * Starlight Draw
 */
