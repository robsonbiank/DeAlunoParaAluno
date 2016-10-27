package Aula007;

public class TiposPrimitivosDeVariaveis {
	
	public static void main(String[] args){
		
		
		byte b; // até 127
		short s; //suporta até o valor 32.767
		int idade; //4bytes de informação, até 2.147.483.647, 2 bilhões
		long l; // até 9 quintilhões, 9.000.000.000.000.000.000
		float salario; 
		double aumento; // até 1.7976931348623157E+308
		char sexo; //um caractere
		//void;
		boolean casado; // um valor, verdadeiro ou falso
		
		byte bb = 0b01010101; // representando numero binário com 0b  / 8bits, 1 byte
		short ss = 0b0101010101010101; //16bits / 2bytes
		int ii = 0b01010101010101010101010101010101; //32 bits / 4 bytes
		System.out.println(ii);
		
	}
	
	

}
