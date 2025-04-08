package org.example;

import org.example.Model.PontoDeColeta;
import org.example.Reader.LeitorDeArquivo;
import org.example.Repository.PontoDeColetaRepository;
import org.example.Service.Analisador;
import org.example.Service.PontoDeColetaService;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       //Passo nome do caminho ralativo do arquivo.
        LeitorDeArquivo leitor = new LeitorDeArquivo("data/pontos_de_descartes.txt");

        PontoDeColetaService service = new PontoDeColetaService();
        Analisador analisador = new Analisador();
        PontoDeColetaRepository coletaRepository = new PontoDeColetaRepository();
        Scanner scanf = new Scanner(System.in);

        System.out.println("Digite o material: ");
        String tipoBusca = scanf.nextLine();

        coletaRepository.alimentarLista(leitor, tipoBusca, service, analisador);

        for(PontoDeColeta ponto : coletaRepository.listar()){
            System.out.println(ponto.getEndereco());
        }

        coletaRepository.limpar();

    }
}