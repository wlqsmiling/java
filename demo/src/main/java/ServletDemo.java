
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/demo")
public class ServletDemo implements Servlet {
    public void init(javax.servlet.ServletConfig arg0) throws javax.servlet.ServletException{

    }
  
    public javax.servlet.ServletConfig getServletConfig(){
        return null;
    }
    
    public void service(javax.servlet.ServletRequest arg0, javax.servlet.ServletResponse arg1) throws javax.servlet.ServletException, java.io.IOException {
        System.out.println("servlet hello world");
    }
    
    public java.lang.String getServletInfo(){
        return null;
    }
    
    public void destroy(){

    }
}
