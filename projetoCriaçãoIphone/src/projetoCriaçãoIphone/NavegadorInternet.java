package projetoCriaçãoIphone;

public class NavegadorInternet extends Iphone{
    private boolean Requisicao = false;
    private boolean Atualizarpag = false;
    private boolean NewPage = false;

    public String exibirPagina(String url) {
        Requisicao = true;
        String response = "Este é o site que você solicitou: " + url;
        
        if (Atualizarpag == true) {
            return url;
        } else if (NewPage == true) {
            Requisicao = false;
            return "Este é o seu novo site";
        }
        
        return response;
    }

    public String adicionarNovaAba(String newURL) {
        NewPage = true;
        return newURL;
    }

    public String atualizarPagina(String url) {
        Atualizarpag = true;
        return "Este é o site que você solicitou: " + url;
    
	}
}
