package Apps;

import java.util.Scanner;

public class Funcionamento {
    public void tocar(){
        System.out.println("Tocando musica");
    }
    public void pausar(){
            System.out.println("Pausando musica");
    }
    public void selecionarMusica(String musica){
            System.out.println("Selecionando musica, " + musica);
    }
    public void ligar(){
        System.out.println("ligando");
    }
    public void atender() {
        System.out.println("O telefone está tocando. Atender, Sim ou Não?");
        
        Scanner scanner = new Scanner(System.in);
        String resposta = scanner.nextLine().trim().toLowerCase();
    
    
        if (resposta.equals("sim")) {
            System.out.println("Ligação atendida.");
        } 
        else if (resposta.equals("não") || resposta.equals("nao")) {
            System.out.println("Ligação não atendida.");
        } 
        else {
            System.out.println("Resposta inválida. Tente novamente.");
        }
        
        scanner.close();
        }
        public void iniciarCorreioVoz(){
            System.out.println("Ligando para o correio de voz");
        }
        public void exbirPagina(String url){
            System.out.println("Navengando");
        }
        public void adicionarNovaAba(){
            System.out.println("Adicionar nova aba?");
        }
        public void atualizarPagina(){
            System.out.println("Atualizar pagina");
        }
}
