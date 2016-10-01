package Lista001;

public class ContaCorrente {
	
		int numeroConta;
		String correntista;
		Float saldo;
		
		public ContaCorrente(int numeroConta, String correntista){
			this.numeroConta = numeroConta;
			this.correntista = correntista;
			
			if(correntista != null ){
				this.correntista = correntista;
			}else{
				System.out.println("Campo n�o pode ser nulo.");
			}
			
			if(saldo > 0){
				this.saldo=saldo;
			}else{
				System.out.println("Saldo n�o pode ser menor que zero.");
			}
			
		}
		
		public int getNumeroConta(){
			return numeroConta;
		}
		
		public void setNumeroConta(int NumeroConta){
			if(numeroConta >= 0 ){
				this.numeroConta = numeroConta;
			}else{
				System.out.println("N�mero da Conta n�o pode ser menor que zero.");
			}
		}

}
