package controleestoque;


import java.util.Scanner;

import javax.swing.JOptionPane;

public class cadastrando {

public static void main(String[] args) {
	Scanner string = new Scanner(System.in);
	salvando valor = new salvando();

	while(true) {
		System.out.println("     Escolha uma opção abaixo      ");
		System.out.println("-----------------------------------");
		System.out.println("-    ( 1 ) Cadastrar Produto      -");
		System.out.println("-    ( 2 ) Ver Estoque            -");
		System.out.println("-    ( 3 ) Sair                   -");
		System.out.println("-----------------------------------");
		
		double valorMenu = string.nextDouble();
		
		if(valorMenu == 1) {
			valor.setNomeProduto(
					JOptionPane.showInputDialog("Informe o Nome do Produto"));
			
			valor.setvalorproduto(Float.parseFloat(
					JOptionPane.showInputDialog("Informe o Valor do Produto")));
			
			
			valor.setestoque(Float.parseFloat(
					JOptionPane.showInputDialog("Informe a Quantidade do Produto")));
			valor.somar();
		}

		else if(valorMenu == 2) {
			System.out.println(valor.getResultados());
		}
		
		else if(valorMenu == 3) {
			break;
		}
		
		else if(valorMenu != 1) {
			System.err.println("\nInforme um número do Menu Valído!!!\n");
		}
		else if(valorMenu != 'a') {
			System.err.println("\nInforme um número do Menu Valído!!!\n");
		}
		
	} 
	System.out.println("Obrigado por usar nosso sistemas!");
	string.close();
}
}