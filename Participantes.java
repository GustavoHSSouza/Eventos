import java.util.ArrayList;
import java.util.List;

public class Participantes {
    private String nome;
    private String email;
    private List<Ingresso> ingressosComprados;


    public Participantes(String nome, String email){
        this.ingressosComprados = new ArrayList<>();
        this.nome = nome;
        this.email = email;
    }

    public void adicionarIngresso(Ingresso ingresso){
        this.ingressosComprados.add(ingresso);
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
    public void mostrarInfoParticipante(){
        System.out.println("Nome: " + this.nome);
        System.out.println("email: " + this.email);
    }

    public void mostrarMeusIngressos(){
       /*  for(Ingressos ingresso:this.ingressosComprados){
             System.out.println(x:"ingresso" + ingresso.getEvento().getNome);
        }*/
        System.out.println(this.ingressosComprados);
    }
}
