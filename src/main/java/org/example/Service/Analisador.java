package org.example.Service;

import org.example.Model.PontoDeColeta;

public class Analisador {
    public boolean analisar(String linha, String tipoBusca, PontoDeColetaService service){
        PontoDeColeta ponto = service.divirLinha(linha); //Cria um objeto ponto, chamanndo dividirLinha.

        //se ponto existir e o material de ponto for igual ao tipoBusca, retorne true.
        //uso de equalsIgnoreCase para ignorar maiusc e minusc.
        if (ponto != null && ponto.getMaterial().equalsIgnoreCase(tipoBusca)){
            return true;
        }
        return false;
    }
}
