package model;

public class ModeloCereal {
    
    private int votosCorn;
    private int votosChoco;
    private int votosZuca;
    
    public ModeloCereal() {
        
        this.votosCorn = 0;
        this.votosChoco = 0;
        this.votosZuca = 0;
        
    }
    
    public void votoCorn() {
        this.votosCorn++;
    }
    
    public void votoChoco() {
        this.votosChoco++;
    }
    
    public void votoZuca() {
        this.votosZuca++;
    }

    public int getVotosCorn() {
        return votosCorn;
    }

    public int getVotosChoco() {
        return votosChoco;
    }

    public int getVotosZuca() {
        return votosZuca;
    }
    
}
