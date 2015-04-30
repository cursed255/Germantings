/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package german;

import java.io.*;
import javax.servlet.http.*;
/**
 *
 * @author Daniel
 */
public class loginServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String input = request.getParameter("user");
        String docType = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
        "Transitional//EN\">\n";
        out.println(docType +
        "<HTML>\n" +
        "<HEAD>\n<TITLE>Logged In</TITLE>\n</HEAD>\n" +
        "<BODY>\n" +
        "<H2>Hello user "+input+". You are now logged into the system.</H2>\n" +
        "</BODY></HTML>");
    }
}
