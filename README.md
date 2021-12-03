# serveltJava
Meus primeiros passos usando Servlet

O que é um Servlet?
**Servlet é um objeto especial armazenado dentro do projeto, e sua particularidade consiste na possibilidade de o chamarmos via protocolo HTTP.**

Em outras palavras, uma servlet é um objeto Java que podemos chamar a partir de uma requisição HTTP.

Quando o Tomcat recebe a requisição do navegador com relação aos dados do projeto gerenciador, ao abrirmos a página não estamos mais lidando com um arquivo, mas com um Servlet. Isto é, um objeto especial executado para gerar uma resposta HTTP dinâmica.

O termo let de Servlet é um sufixo diminutivo no inglês, e uma tradução livre seria algo como "Servidorzinho". A ideia é que o Tomcat é um servidor principal, e o Servlet opera de forma semelhante e auxiliar, afinal ele pode receber requisições e gerar respostas dinâmicas por meio do protocolo HTTP.

![image](https://user-images.githubusercontent.com/49958155/144535241-389fe568-82e9-4755-a45b-02220adbd6a0.png)

Depois foi implantado um método que atende uma requisição HTTP, que chamaremos de service():
![image](https://user-images.githubusercontent.com/49958155/144535393-055bdbb7-642a-44bd-871b-ef5b9ff3e455.png)



--------

Esta anotação é o que determina como será chamada na URL
@WebServlet(urlPatterns ="/helloworld")

Além disso foi implantado um método que recebe a requisição (req) e devolve a resposta (resp)

protected void service(HttpServletRequest req, HttpServletResponse resp) {
}

**O protocolo HTTP funciona sempre na dinâmica de requisição e reposta.**

