
package model;


public class Token {
    
    private String classe;
    private String token;
    private int linha;
    private int coluna;

    public Token(String classe, String token, int linha, int coluna) {
        this.classe = classe;
        this.token = token;
        this.linha = linha;
        this.coluna = coluna;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    @Override
    public String toString() {
        return "Token{" + "classe=" + classe + ", token=" + token + ", linha=" + linha + ", coluna=" + coluna + '}';
    }
    

}
