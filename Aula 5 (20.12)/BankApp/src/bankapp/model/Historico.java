package bankapp.model;

public class Historico {
    private String data;
    private Double valor;
    private String tipoOperacao;
    
    public Historico(){
        
    }
    
    public Historico(String data, Double valor, String tipoOperacao){
        this.data = data;
        this.valor = valor;
        this.tipoOperacao = tipoOperacao;
    }
    
  
    public double getValor(){
        return valor;
    }

    public String getData(){
        return data;
    }

    public String getTipoOperacao(){
        return tipoOperacao;
    }
}
