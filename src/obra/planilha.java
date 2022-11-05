package obra;

public class planilha {
    
    public String material;
    public int quantidade;
    public int valorUnidade;
    public int total;

    public planilha(String material, int quantidade, int valorUnidade, int total) {
        this.material = material;
        this.quantidade = quantidade;
        this.valorUnidade = valorUnidade;
        this.total = total;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getValorUnidade() {
        return valorUnidade;
    }

    public void setValorUnidade(int valorUnidade) {
        this.valorUnidade = valorUnidade;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "planilha{" + "material=" + material + ", quantidade=" + quantidade + ", valorUnidade=" + valorUnidade + ", total=" + total + '}';
    }
    
    
    
}
