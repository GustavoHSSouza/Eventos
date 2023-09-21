import java.time.LocalDateTime;

public class Ingresso {
    private Participantes participante;
    private Evento evento;
    private LocalDateTime dataCompra;
    private boolean statusIngresso;

    public Ingresso (Participantes participantes, Evento evento){
        this.participante = participantes;
        this.evento = evento;
        this.dataCompra = LocalDateTime.now();
        this.statusIngresso = true;
        evento.incluiInscritoEvento(this);
        this.participante.adicionarIngresso(this);
    }  

    
    public void setStatusIngresso(boolean status){
        this.statusIngresso=status;
        
    }

    public Boolean getStatusIngresso() {
        return this.statusIngresso;
    }

    public Evento getEvento() {
        return this.evento;
    }

    public void setDataCompra(LocalDateTime dataCompra) {
        this.dataCompra = dataCompra;

    }
    public LocalDateTime getDataCompra() {
        return this.dataCompra;

    }
    public Participantes getParticipante() {
        return this.participante;

    }

    
}
