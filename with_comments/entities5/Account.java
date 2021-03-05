package entities5;

public class Account {

	/*Wrapper Classes - deixar pronto para usar em banco de dados futuramente,
	 * os tipos primitivos como Wrapper Classes tem acesso a Herença, Polimorfismo ... (POO) 
	 */
	private Integer number; //encapsulamento - private - manter a integridade
	private String holder; /
	private Double balance;
	
	
	public Account (Integer number, String holder) { //dá para criar automático em Botão direito > Source
		this.number = number;
		this.holder = holder;
	}
	
	public Account (Integer number, String holder, Double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public Integer getNumber() { //encapsulamento - decidir até onde é interessante que tenham acesso
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
	
	/* Beneficio de Método dentro da classe - encapsulamento -
	 * - Reaproveitamento do código - se precisar mudar algo no calculo, muda apenas aqui e não em vários locais
	 * - Delegação de responsabilidade - organização
	 */
	
	public void deposit(Double amount) { 
		balance += amount; //boas práticas ao invés de balance = balance + amount;
	}
	
	public void withdraw (Double amount) {
		balance -= amount + 5;
	}
	
	//Se fosse maior, usar o String Builder que ocupa menos espaço na memória
	
	public String toString() {  //converte o Object para String
		return "Account "		//determinando a apresentação da classe Account como String
				+ number
				+ ", Holder: "
				+ holder
				+", Balance: $ "
				+ String.format("%.2f%n", balance);
	}
	
}
