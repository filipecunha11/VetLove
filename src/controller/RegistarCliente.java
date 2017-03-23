package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import model.Animais;
import model.Cliente;

public class RegistarCliente {
	
	String nome, morada, email, telefone;
	int id, opc;
	
	String classificacao, raca, data_nasc;
	
	public RegistarCliente(ArrayList<Cliente> clientes)
	{
		ArrayList<Animais> animais = new ArrayList<Animais>();
		id = clientes.size();
		System.out.print("Insira o nome do cliente: ");
		nome = new Scanner(System.in).nextLine();
		System.out.print("Insira a morada do cliente: ");
		morada = new Scanner(System.in).nextLine();
		System.out.print("Insira o email do cliente: ");
		email = new Scanner(System.in).nextLine();
		System.out.print("Insira o telefone do cliente: ");
		telefone = new Scanner(System.in).nextLine();
		
		System.out.println("Pretende adicionar animais ao cliente? [1 para sim]");
		opc = new Scanner(System.in).nextInt();
		
		while (opc == 1)
		{
			System.out.print("Insira a classificacao do animal: ");
			classificacao = new Scanner(System.in).nextLine();
			System.out.print("Insira a raça do animal: ");
			raca = new Scanner(System.in).nextLine();
			System.out.print("Insira a data nascimento do animal: ");
			data_nasc = new Scanner(System.in).nextLine();
			
			Animais animal = new Animais(classificacao, raca, data_nasc);
			animais.add(animal);
			System.out.print("Pretende inserir outro animal? [1 para sim]");
			opc = new Scanner(System.in).nextInt();
		}
		
		Cliente cliente = new Cliente(id, nome, morada, email, telefone, animais);
		
		clientes.add(cliente);
	}
}
