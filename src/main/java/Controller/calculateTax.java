package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StatisticsTax;
/**
 * Servlet implementation class calculateTax
 */
@WebServlet("/calculateTax")
public class calculateTax extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calculateTax() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String usernumber = request.getParameter("usernumber");
		@SuppressWarnings("removal")
		Float mainUN = new Float(usernumber);
		double hold = 0.06 * mainUN ;
		mainUN = (float) (mainUN + hold);
		String holdf = String.format("%.02f", hold);
		String mainUN2 = String.format("%.02f", mainUN);
		//PrintWriter writer = response.getWriter();
		//writer.println("Your orginal Price before sales tax of 6%" + usernumber );
		//writer.println("Your Tax price" + holdf);
		//writer.println("Your total After Tax price" + mainUN2);
		//writer.close();
		
		StatisticsTax stats = new StatisticsTax(usernumber);
		stats.setmainUN2(mainUN2);
		stats.setholdf(holdf);
		stats.setusernumber(usernumber);
		request.setAttribute("stats", stats);
		getServletContext().getRequestDispatcher("/response1.jsp").forward(request, response);
		
	}

}
