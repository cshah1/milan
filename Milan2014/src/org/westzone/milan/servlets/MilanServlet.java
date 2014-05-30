package org.westzone.milan.servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MilanServlet
 */
@WebServlet(description = "Main Controller Servlet", urlPatterns = { "/MilanServlet" })
public class MilanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	private static final Map<String, String> viewMap;

	static {
		viewMap =  new HashMap<String, String>();
		viewMap.put("home.do", "index.jsp");
		viewMap.put("searchRegistrant.do", "searchRegistrant.jsp");
	};
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MilanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            //get the request's url
            String url = request.getRequestURL().substring(request.getRequestURL().lastIndexOf("/") + 1, request.getRequestURL().length());
            //get Controllers name from request
            String controller = url.substring(0, url.indexOf("."));
            System.out.println("URL: " + url);
            System.out.println("View: " + viewMap.get(url));
            RequestDispatcher requestDispatcher = request.getRequestDispatcher(viewMap.get(url));
            requestDispatcher.forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           
        }
    }
	
	


}
