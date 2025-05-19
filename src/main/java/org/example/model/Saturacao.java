package org.example.model;

import org.example.utils.Data;

public class Saturacao extends Medida {
    private double saturacao;

    public Saturacao(Data dataRegisto, double saturacao, Paciente paciente, TecnicoSaude tecnicoSaude) {
        super(dataRegisto, paciente, tecnicoSaude);
        this.saturacao = saturacao;
    }

    public double getSaturacao() {
        return saturacao;
    }

    public void setSaturacao(double saturacao) {
        this.saturacao = saturacao;
    }

    @Override
    public String toString() {
        return "Saturacao{" + super.toString() + "saturacao=" + saturacao + '}';
    }
}
