package br.edu.estacio.interfaces.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.estacio.interfaces.facade.ConvidadoServiceFacade;

/**
 * Servlet implementation class nomesCadastrados
 */
@WebServlet(value="/listar", name="nomesCadastrados")
public class nomesCadastrados extends HttpServlet {
	
	//private ConvidadoServiceFacade convidadoServiceFacade =new ConvidadoServiceFacadeImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public nomesCadastrados() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ConvidadoServiceFacade convidadosFacade = (ConvidadoServiceFacade) getServletContext().getAttribute("convidadoFacade");
		if (convidadosFacade!=null){
			request.getSession().setAttribute("convidados",convidadosFacade.getAllConvidados());
		}	
		response.sendRedirect("/servletApp/listar.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
