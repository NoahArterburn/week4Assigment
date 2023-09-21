package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.StatisticsUsername;

/**
 * Servlet implementation class DisplayName
 */
@WebServlet("/DisplayName")
public class DisplayName extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayName() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String FirstandLast = request.getParameter("FandL");
		String[] splitStr = FirstandLast.split("\\s+");
		PrintWriter writer = response.getWriter();
		String FirstName = splitStr[0];
		splitStr[0]=(splitStr[0].substring(0,1));
		String LastName = splitStr[1];
		String DisplayName = splitStr[0]+splitStr[1];
		//writer.println(splitStr[0]+splitStr[1]);
		//writer.close();
				
		StatisticsUsername stats = new StatisticsUsername(FirstandLast);
		stats.setDisplayName(DisplayName);
		stats.setFirstName(FirstName);
		stats.setLastName(LastName);
		request.setAttribute("stats", stats);
		getServletContext().getRequestDispatcher("/response2.jsp").forward(request, response);
		
	}

}
