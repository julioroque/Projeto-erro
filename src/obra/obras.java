
package obra;


public class obras {
 
    public String NomeDaObra;
    public int DataInicio;
    public int DataFim;

    public obras(String NomeDaObra, int DataInicio, int DataFim) {
        this.NomeDaObra = NomeDaObra;
        this.DataInicio = DataInicio;
        this.DataFim = DataFim;
    }

    public String getNomeDaObra() {
        return NomeDaObra;
    }

    public void setNomeDaObra(String NomeDaObra) {
        this.NomeDaObra = NomeDaObra;
    }

    public int getDataInicio() {
        return DataInicio;
    }

    public void setDataInicio(int DataInicio) {
        this.DataInicio = DataInicio;
    }

    public int getDataFim() {
        return DataFim;
    }

    public void setDataFim(int DataFim) {
        this.DataFim = DataFim;
    }
    
    
    
    
}
