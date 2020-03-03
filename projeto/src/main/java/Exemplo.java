import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;

@WebServlet(urlPatterns={"/exemplo"})
public class Exemplo extends HttpServlet{	
	@Override
	public void doGet(  HttpServletRequest req, 
						HttpServletResponse res){
		try{
			PrintWriter pw = res.getWriter();
			pw.write("{nome:'Andre', telefone: '40028922'}");
			pw.close();
		} catch (Exception e){
			System.out.println("Erro em IO ou no Servlet");
		}
	}	
}