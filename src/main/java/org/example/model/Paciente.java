package org.example.model;

import org.example.utils.Data;

public class Paciente extends Pessoa {
    private Data dataInternamento;

    public Paciente(int id, String nome, char sexo, Data dataNascimento, Data dataInternamento) {
        super(id, nome, sexo, dataNascimento);
        this.dataInternamento = dataInternamento;
    }

    public Data getDataInternamento() {
        return dataInternamento;
    }

    public void setDataInternamento(Data dataInternamento) {
        this.dataInternamento = dataInternamento;
    }

    public String classificarPaciente(FrequenciaCardiaca freq, Temperatura temp, Saturacao sat) {
        if (freq.getFrequencia() >= 60 && freq.getFrequencia() <= 100 &&
                temp.getTemperatura() >= 36 && temp.getTemperatura() <= 37.5 &&
                sat.getSaturacao() >= 95) {
            return "Normal";
        } else if ((freq.getFrequencia() > 100 && freq.getFrequencia() <= 120) ||
                (temp.getTemperatura() > 37.5 && temp.getTemperatura() <= 38.5) ||
                (sat.getSaturacao() < 95 && sat.getSaturacao() >= 90)) {
            return "Atenção";
        } else {
            return "Crítico";
        }
    }

    @Override
    public String toString() {
        return "Paciente{" + super.toString() + "dataInternamento=" + dataInternamento + '}';
    }
}

