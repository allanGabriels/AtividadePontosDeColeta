package org.example.Model;

import java.util.UUID;

public class PontoDeColeta {
    private final int id;
    private final String material;
    private final String endereco;

    public PontoDeColeta(int id, String material, String endereco) {
        this.id = id;
        this.endereco = endereco;
        this.material = material;
    }

    public int getId() {
        return id;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getMaterial() {
        return material;
    }
}
