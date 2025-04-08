package org.example.Repository;

import org.example.Model.PontoDeColeta;
import org.example.Reader.LeitorDeArquivo;
import org.example.Service.Analisador;
import org.example.Service.PontoDeColetaService;

import java.util.LinkedList;
import java.util.List;

public class PontoDeColetaRepository {
    private final LinkedList<PontoDeColeta> pontos = new LinkedList<>(); //cria uma lista ligada

    //adiciona um PontoDeColeta
    public void adicionar(PontoDeColeta p) {
        pontos.add(p);
    }

    //Metodo responsável por chamar o analisador, criar um ponto de coleta com base na String coletada e
    //adicinar na linkedList
    public void alimentarLista(LeitorDeArquivo leitor, String tipoBusca,
                               PontoDeColetaService service, Analisador analisador) {
        String linha;
        while ((linha = leitor.lerProximaLinha()) != null) { //enquanto houver uma próxima linha
            if (analisador.analisar(linha, tipoBusca, service)){ //se o analisador retornar true
                PontoDeColeta ponto = service.divirLinha(linha); //chama dividirLinha e atribui o objeto retornado á ponto
                adicionar(ponto); //adiciona o ponto á linkedList
            }
        }

    }

    public List<PontoDeColeta> listar() {
        return pontos;
    }

    public void limpar() {
        pontos.clear();
    }
}
