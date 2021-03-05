package entities5;

public class Account {

	/*Wrapper Classes - deixar pronto para usar em banco de dados futuramente,
	 * os tipos primitivos como Wrapper Classes tem acesso a Heren�a, Polimorfismo ... (POO) 
	 */
	private Integer number; //encapsulamento - private - manter a integridade
	private String holder; /
	private Double balance;
	
	
	public Account (Integer number, String holder) { //d� para criar autom�tico em Bot�o direito > Source
		this.number = number;
		this.holder = holder;
	}
	
	public Account (Integer number, String holder, Double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public Integer getNumber() { //encapsulamento - decidir at� onde � interessante que tenham acesso
		return number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public Double getBalance() {
		return balance;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	/* Beneficio de M�todo dentro da classe - encapsulamento -
	 * - Reaproveitamento do c�digo - se precisar mudar algo no calculo, muda apenas aqui e n�o em v�rios locais
	 * - Delega��o de responsabilidade - organiza��o
	 */
	
	public void deposit(Double amount) { 
		balance += amount; //boas pr�ticas ao inv�s de balance = balance + amount;
	}
	
	public void withdraw (Double amount) {
		balance -= amount + 5;
	}
	
	//Se fosse maior, usar o String Builder que ocupa menos espa�o na mem�ria
	
	public String toString() {  //converte o Object para String
		return "Account "		//determinando a apresenta��o da classe Account como String
				+ number
				+ ", Holder: "
				+ holder
				+", Balance: $ "
				+ String.format("%.2f%n", balance);
	}
	
}
