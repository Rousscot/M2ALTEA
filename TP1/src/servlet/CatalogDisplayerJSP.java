package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.bcel.internal.generic.NEW;

import bean.Catalog;

/**
 * Servlet implementation class CatalogDisplayerJSP
 */
@WebServlet(name = "catalog", urlPatterns = { "/displayCatalog" })
public class CatalogDisplayerJSP extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("catalog", Catalog.getInstance());
		try {
			this.getServletContext().getRequestDispatcher("/JSPs/displayCatalog.jsp").forward(request, response);
		} catch (IOException | ServletException e) {
			e.printStackTrace();// TODO write in response that the request did
								// not succeeded and why. Change the status
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
