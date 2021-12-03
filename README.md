# serveltJava
Meus primeiros passos usando Servlet

Esta anotação é o que determina como será chamada na URL
@WebServlet(urlPatterns ="/helloworld")

Além disso foi implantado um método que recebe a requisição (req) e devolve a resposta (resp)

protected void service(HttpServletRequest req, HttpServletResponse resp) {
}
