package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Cliente;

public class ConsultarCliente {
	public ConsultarCliente(ArrayList<Cliente> cliente)
	{
		int id;
		System.out.print("Insira o ID do cliente: ");
		id = new Scanner(System.in).nextInt();
		
		for (int i = 0 ; i < cliente.size() ; i++)
		{
			if (cliente.get(i).getId() == id)
			{
				System.out.println("ID: " + cliente.get(i).getId());
				System.out.println("Nome: " + cliente.get(i).getNome());
				System.out.println("Morada: " + cliente.get(i).getMorada());
				System.out.println("Telefone: " + cliente.get(i).getTelefone());
				System.out.println("Email: " + cliente.get(i).getEmail());
				System.out.println("Animais: ");
				if (cliente.get(i).getAnimais().size() > 0)
					for ( int j = 0 ; j < cliente.get(i).getAnimais().size() ; j++)
					{
						System.out.println("\n - Classificação: " + cliente.get(i).getAnimais().get(j).getClassificacao());
						System.out.println(" - Raça: " + cliente.get(i).getAnimais().get(j).getRaca());
						System.out.println(" - Data Nascimento: " + cliente.get(i).getAnimais().get(j).getData_nasc());
					}
			}
		}
	}
}
