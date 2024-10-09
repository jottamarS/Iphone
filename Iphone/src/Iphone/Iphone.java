package Iphone;

import java.util.Scanner;

import Apps.AparelhoTelefonico;
import Apps.Funcionamento;
import Apps.NavegadorInternet;
import Apps.ReprodutorMusical;

public class Iphone {

    public static void main(String[] args) {
        Funcionamento app = null;
        Scanner Scanner = new Scanner(System.in);
        
        System.out.println("Escolha um aplicativo:");
        System.out.println("musica, telefone, navegador");

        String appEscolhido = Scanner.nextLine();

        if(appEscolhido.equals("musica")){
            app = new ReprodutorMusical();
            app.tocar();
            app.pausar();
            app.selecionarMusica("Meu amor me pegou");
        }
        else if(appEscolhido.equals("telefone")){
            app = new AparelhoTelefonico();
            app.ligar();
            app.atender();
            app.iniciarCorreioVoz();
        }
        else if(appEscolhido.equals("navegador")){
            app = new NavegadorInternet();
            app.exbirPagina(null);
            app.adicionarNovaAba();
            app.atualizarPagina();
        }
    }
}
