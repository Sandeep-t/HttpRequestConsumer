/**
 * 
 */
package com.pramati.consumer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * @author sandeep-t
 * 
 */

// Extend HttpServlet class

@WebServlet("/DataConsumer")
public class DataConsumer extends HttpServlet {

	/**
	 * 
	 */
	
	//private static Logger logger= Logger.getLogger(DataConsumer.class);

	
	
	private final static String userName = "username";
	private static final long serialVersionUID = 4760298010348230582L;
	private AtomicInteger hitCount = new AtomicInteger();
	//private int hitCount;

	public void init() throws ServletException {
		
		
		
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//PrintWriter out = response.getWriter();
		hitCount.incrementAndGet();
		System.out.println( request.getParameter(userName) + "Hits " + hitCount.get());
		
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter(userName));
		hitCount.incrementAndGet();
		System.out.println(" Hit-Count "+hitCount.get());
	}

	public void destroy() {
		// do nothing.
	}

}
