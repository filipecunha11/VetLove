package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.Cliente;
import controller.ConsultarCliente;
import controller.RegistarCliente;

public class Menu {
	public Menu(ArrayList<Cliente> clientes){
		int menu = -1;
		while (menu != 0){
			System.out.println("MENU");
			System.out.println("1. Registar Cliente");
			System.out.println("2. Consultar");
			System.out.println("0. Sair");
			menu = new Scanner(System.in).nextInt();
			
			switch (menu)
			{
			case 1: new RegistarCliente(clientes);
				break;
			case 2: new ConsultarCliente(clientes);
				break;
			}
		}
	}
}
