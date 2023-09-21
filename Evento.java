import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Evento {
    private String nomeEvento;
    private String localEvento;
    private LocalDateTime dataEvento;
    private int capacidadeEvento;
    private List<Ingresso> inscritosEvento;
    private static List<Evento> eventos = new ArrayList<>();

    public Evento(String nomeEvento, String localEvento, LocalDateTime dataEvento,int capacidadeEvento){
        this.nomeEvento = nomeEvento;
        this.localEvento = localEvento;
        this.dataEvento = dataEvento;
        this.capacidadeEvento = capacidadeEvento;
        this.inscritosEvento = new ArrayList<>();
        eventos.add(this);
    }

    public static List<Evento> getEventos() {
        return eventos;
    }

    public void mostraInfoEvento(){
        System.out.println("Evento:"+ this.nomeEvento);
        System.out.println("Local:"+ this.localEvento);
        System.out.println("Data:"+ this.dataEvento);
        System.out.println("Capacidade:"+ this.capacidadeEvento);
    }

    public String getLocalEvento(){
        return this.localEvento;
    }
    
    public void setLocalEvento(String localEvento){
        this.localEvento = localEvento; 
    }

    public String getNomeEvento(){
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento){
        this.nomeEvento = nomeEvento;
    }  

    public LocalDateTime getDataEvento(){
        return dataEvento;
    }

    public void setDataEvento(LocalDateTime dataEvento){
        this.dataEvento = dataEvento;
    }

    public int getCapacidadeEvento(){
        return capacidadeEvento;
    }
    public void setCapacidadeEvento(int capacidadeEvento){
        this.capacidadeEvento = capacidadeEvento;
        
    } 
    public void incluiInscritoEvento(Ingresso ingresso){
        this.inscritosEvento.add(ingresso);
    }

    public void cancelarEvento(Evento evento) {
        eventos.remove(evento);
    }

}
