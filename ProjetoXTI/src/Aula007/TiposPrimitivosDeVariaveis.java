package Aula007;

public class TiposPrimitivosDeVariaveis {
	
	public static void main(String[] args){
		
		
		byte b; // at� 127
		short s; //suporta at� o valor 32.767
		int idade; //4bytes de informa��o, at� 2.147.483.647, 2 bilh�es
		long l; // at� 9 quintilh�es, 9.000.000.000.000.000.000
		float salario; 
		double aumento; // at� 1.7976931348623157E+308
		char sexo; //um caractere
		//void;
		boolean casado; // um valor, verdadeiro ou falso
		
		byte bb = 0b01010101; // representando numero bin�rio com 0b  / 8bits, 1 byte
		short ss = 0b0101010101010101; //16bits / 2bytes
		int ii = 0b01010101010101010101010101010101; //32 bits / 4 bytes
		System.out.println(ii);
		
	}
	
	

}
