package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/IMCServlet") // Define a URL para o servlet
public class IMCServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();    // PrintWriter para escrever a resposta

        try {
            // pega 'altura' e 'peso' convertendo para double
            Double altura = Double.parseDouble(request.getParameter("altura"));
            Double peso = Double.parseDouble(request.getParameter("peso"));

            IMC imc = new IMC();
            imc.setAltura(altura);
            imc.setPeso(peso);
            imc.calcularIMC();

            out.println("<!DOCTYPE html>");
            out.println("<html lang=\"pt-BR\">");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"); 
            out.println("<title>Resultado do IMC</title>");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">"); 
            out.println("</head>");
            out.println("<body>");
            out.println("<header>");
            out.println("<h1>Resultado do IMC</h1>"); 
            out.println("</header>");
            out.println("<main>");
            out.println("<ul class=\"result-list\">"); // listagem
            out.println("<li>Altura: " +  imc.getAltura() + " metros</li>"); 
            out.println("<li>Peso: " + imc.getPeso() + " kg</li>"); 
            out.println("<li>IMC: " + imc.getValor() + "</li>"); 
            out.println("<li>Resultado: " + imc.getResultado() + "</li>");
            out.println("</ul>");
            out.println("</main>");
            out.println("<footer>");
            out.println("<a href=\"index.html\" class=\"back-link\">Voltar para a pagina inicial</a>"); 
            out.println("</footer>");
            out.println("</body>");
            out.println("</html>");
        } catch (NumberFormatException e) {
          
            out.println("<!DOCTYPE html>");
            out.println("<html lang=\"pt-BR\">");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"); 
            out.println("<title>Erro</title>"); 
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<header>");
            out.println("<h1>Erro na Entrada</h1>");
            out.println("</header>");
            out.println("<main>");
            out.println("<p class=\"error-message\">Dados inválidos. Verifique os valores informados.</p>"); 
            out.println("</main>");
            out.println("<footer>");
            out.println("<a href=\"index.html\" class=\"back-link\">Voltar para a p�gina inicial</a>"); 
            out.println("</footer>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
