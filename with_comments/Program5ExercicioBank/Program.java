package Program5ExercicioBANK;

import java.util.Locale;
import java.util.Scanner;

import entities5.Account;


public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); //Garantir que todos os números decimais usem pontos ao invés de vírgula ou misturar.
		Scanner sc = new Scanner(System.in); //Ler comando digitado pelo usuário
		Account account; //declaração - composição
		
		System.out.print("Enter account number: ");
		Integer number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine(); //consumir a quebra de linha gerada pelo nextInt anterior
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		
		/* Usaria um _do-while_ se o pedido fosse para deixar a possibilidade de em todo _Update account data_  
		 * fazer um novo deposito
		 */
		
		char response = sc.next().charAt(0);
		if(response == 'y') {
			System.out.print("Enter initial deposit value: ");
			Double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit); 
		} else {
			account = new Account(number, holder); //sobrecarga - quando há a necessidade de criar um construtor opcional
		}
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		Double depositValue = sc.nextDouble();
		account.deposit(depositValue); //utilizando método criado na classe Account
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		Double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue); //utilizando método criado na classe Account
		System.out.println("Updated account data:");
		System.out.println(account);
		
		
		sc.close();		
	}

}
