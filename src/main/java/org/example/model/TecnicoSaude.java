package org.example.model;

import org.example.utils.Data;

public class TecnicoSaude extends Pessoa {
    private String especialidade;

    public TecnicoSaude(int id, String nome, char sexo, Data dataNascimento, String especialidade) {
        super(id, nome, sexo, dataNascimento);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "TecnicoSaude{" + super.toString() + ", especialidade='" + especialidade + '\'' + '}';
    }
}

