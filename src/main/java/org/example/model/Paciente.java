package org.example.model;

import org.example.utils.Data;

public class Paciente extends Pessoa {
    private Data dataInternamento;

    public Paciente(int id, String nome, char sexo, Data dataNascimento, Data dataInternamento) {
        super(id, nome, sexo, dataNascimento);
        this.dataInternamento = dataNascimento;
    }
    public Paciente(Paciente p) {
        super(p);
        this.dataInternamento = p.dataNascimento;
    }

    public Data getDataInternamento() {
        return dataInternamento;
    }

    public void setDataInternamento(Data dataInternamento) {
        this.dataInternamento = dataInternamento;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Paciente{");
        sb.append(super.toString());
        sb.append("dataInternamento=").append(dataInternamento);
        sb.append('}');
        return sb.toString();
    }
}
