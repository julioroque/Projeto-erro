package obra;

public class comprarMaterial {
   
    public String anotacao;

    public comprarMaterial(String anotacao) {
        this.anotacao = anotacao;
    }

    public String getAnotacao() {
        return anotacao;
    }

    public void setAnotacao(String anotacao) {
        this.anotacao = anotacao;
    }

    @Override
    public String toString() {
        return "comprarMaterial{" + "anotacao=" + anotacao + '}';
    }
    
    
    
}
