package entregaveldh.com.entregaveldh;

public class Receita {

    private String titulo;
    private String receita;
    private String preparo;
    private int miniatura;

    public Receita() {
    }

    public Receita(String titulo, String receita, String preparo, int miniatura) {
        this.titulo = titulo;
        this.receita = receita;
        this.preparo = preparo;
        this.miniatura = miniatura;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getReceita() {
        return receita;
    }

    public void setReceita(String receita) {
        this.receita = receita;
    }

    public String getPreparo() {
        return preparo;
    }

    public void setPreparo(String preparo) {
        this.preparo = preparo;
    }

    public int getMiniatura() {
        return miniatura;
    }

    public void setMiniatura(int miniatura) {
        this.miniatura = miniatura;
    }
}
