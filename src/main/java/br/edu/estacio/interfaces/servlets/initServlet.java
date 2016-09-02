package br.edu.estacio.interfaces.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.estacio.domain.model.convidados.Convidado;
import br.edu.estacio.infrastructure.memory.ConvidadosRepository;
import br.edu.estacio.interfaces.facade.ConvidadoServiceFacade;
import br.edu.estacio.interfaces.facade.ConvidadoServiceFacadeImpl;

/**
 * Servlet implementation class initServlet
 */
@WebServlet(value="/cadastrar", name="initServlet")
public class initServlet extends HttpServlet {
	
	private ConvidadoServiceFacade convidadoServiceFacade = new ConvidadoServiceFacadeImpl();
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @throws IllegalAccessException 
     * @throws InstantiationException 
     * @see HttpServlet#HttpServlet()
     */
    public initServlet() throws InstantiationException, IllegalAccessException {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("/servletApp/cadastrar.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		//Sending to expression language ${nome} via session 
		request.getSession().setAttribute("nome", nome);
		convidadoServiceFacade.addConvidados(nome);
		getServletContext().setAttribute("convidadoFacade",convidadoServiceFacade);
		response.sendRedirect("/servletApp/mostrarNome.jsp");
	}

	public ConvidadoServiceFacade getConvidadoServiceFacade(){
		return convidadoServiceFacade;
	}
	
}
