package org.example.model;

import org.example.utils.Data;

public class Medida {
    private Data dataRegisto;
    private Paciente paciente;
    private TecnicoSaude tecnico;

    public Medida(Data dataRegisto, Paciente paciente, TecnicoSaude tecnico) {
        this.dataRegisto = dataRegisto;
        this.paciente = paciente;
        this.tecnico = tecnico;
    }

    public Data getDataRegisto() {
        return dataRegisto;
    }

    public void setDataRegisto(Data dataRegisto) {
        this.dataRegisto = dataRegisto;
    }

    @Override
    public String toString() {
        return "Medida{" + "dataRegisto=" + dataRegisto + ", paciente=" + paciente + ", tecnico=" + tecnico + '}';
    }
}

