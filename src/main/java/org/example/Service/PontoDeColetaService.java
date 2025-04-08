package org.example.Service;

import org.example.Model.PontoDeColeta;

public class PontoDeColetaService {

    public PontoDeColeta divirLinha(String linha){
        String[] linhas = linha.split(";"); //divide a linha em um array usando ; como delimitador
        if (linhas.length == 3){ //vefica se foram divididas em 3
            try{ //uso do try para tentar converter a String[0] em int para corresponder com o id
                int id = Integer.parseInt(linhas[0]);
                String material = linhas[1];
                String endereco = linhas[2];

                return new PontoDeColeta(id, material, endereco); //retorna o novo ponto e sai do laço
            }catch (NumberFormatException e){ //tratamento do erro da conversão
                System.out.println("Erro na conversão do número " + linhas[0]);
                e.printStackTrace();
            }
        }
        return null;
    }

}
