package application;

import java.util.ArrayList;
import java.util.Scanner;

import controller.ConsultarCliente;
import controller.RegistarCliente;
import javafx.application.Application;
import model.Cliente;
import view.Menu;

public class Principal {
	
	public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public static void main(String[] args) {
		new Menu(clientes);
	}

}
