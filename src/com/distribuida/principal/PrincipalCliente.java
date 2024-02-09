package com.distribuida.principal;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.UsuarioDAO;
import com.distribuida.entities.Cliente;
import com.distribuida.entities.Usuario;
import com.distribuida.entities.cliente;

public class PrincipalCliente {

	private static final Usuario Pedro = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	
	ClienteDAO clienteDAO = context.getBean("clienteDAOImpl",ClienteDAO.class);
	UsuarioDAO usuarioDAO = context.getBean("usuarioDAOImpl",UsuarioDAO.class);
	
	//CRUD
	
	
//	add
//	cliente cliente1 = new cliente();
//	clienteDAO.add();
//	
//	cliente cliente2 = new cliente();
//	clienteDAO.add(cliente2);
	
//	//del
//	clienteDAO.del();
	
//	System.out.println(cliente.toString());
	
//	//findAll
//			List<cliente> clientes = clienteDAO.findAll();
//			
//	
//	
//findOne
//			Usuario usuario = usuarioDAO.findOne(1);
//			System.out.println(usuario.toString());
			
//		for (Usuario usuarios : usuario) {
//	System.out.println(usuarios.toString());
//}
//		
	Cliente cliente1 = new Cliente(1, "2112", "Rodri", "ss", "por ahi", "212212",
			"sdasds@sda.com", "Masculino",new Date(),Pedro);
	clienteDAO.add(cliente1);
	System.out.println(clienteDAO.findOne(11));

	Cliente cliente3 = new Cliente(3, "Goku", "Son", "26262662", "09550956", "dfsdf@dsf.com", "por ahi mismo", 
			 "Masculino",new Date(), Pedro);
	clienteDAO.up(cliente3);
	System.out.println(clienteDAO.findOne(11));
	try { clienteDAO.del(11); } catch (Exception e) {e.printStackTrace();	}

	for(Cliente cliente:clienteDAO.findAll()) {
		System.out.println(cliente.toString());
	
	}
	
	context.close();


}
}