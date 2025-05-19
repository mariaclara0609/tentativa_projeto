package org.example.model;

import org.example.utils.Data;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String nome;
    private final List<Paciente> lstPacientes;
    private final List<FrequenciaCardiaca> lstFreqCard;
    private final List<Temperatura> lstTemperaturas;
    private final List<Saturacao> lstSaturacoes;
    private final List<TecnicoSaude> lstTecnicos;

    public Hospital(String nome) {
        this.nome = nome;
        this.lstPacientes = new ArrayList<>();
        this.lstFreqCard = new ArrayList<>();
        this.lstTemperaturas = new ArrayList<>();
        this.lstSaturacoes = new ArrayList<>();
        this.lstTecnicos = new ArrayList<>();
    }

    public boolean adicionarPaciente(Paciente paciente) {
        if (!listaContemPaciente(paciente.getId())) {
            lstPacientes.add(paciente);
            return true;
        }
        return false;
    }

    public void visualizarPacientes() {
        if (lstPacientes.isEmpty()) {
            System.out.println("Não há pacientes registrados.");
        } else {
            System.out.println("Lista de Pacientes:");
            for (Paciente paciente : lstPacientes) {
                System.out.println(paciente);
            }
        }
    }
    public List<Paciente> getLstPacientes() {
        return lstPacientes;
    }

    public boolean adicionarFreqCardiaca(Data dataRegisto, double frequencia, Paciente paciente, TecnicoSaude tecnicoSaude) {
        FrequenciaCardiaca freqCard = new FrequenciaCardiaca(dataRegisto, frequencia, paciente, tecnicoSaude);
        lstFreqCard.add(freqCard);
        return true;
    }

    public boolean adicionarTemperatura(Data dataRegisto, double temperatura, Paciente paciente, TecnicoSaude tecnicoSaude) {
        Temperatura temp = new Temperatura(dataRegisto, temperatura, paciente, tecnicoSaude);
        lstTemperaturas.add(temp);
        return true;
    }

    public boolean adicionarSaturacao(Data dataRegisto, double saturacao, Paciente paciente, TecnicoSaude tecnicoSaude) {
        Saturacao sat = new Saturacao(dataRegisto, saturacao, paciente, tecnicoSaude);
        lstSaturacoes.add(sat);
        return true;
    }

    public boolean listaContemPaciente(int id) {
        for (Paciente paciente : lstPacientes) {
            if (paciente.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public double calcularMediaFrequenciaCardiaca() {
        double soma = 0;
        for (FrequenciaCardiaca freq : lstFreqCard) {
            soma += freq.getFrequencia();
        }
        return soma / lstFreqCard.size();
    }

    public double calcularDesvioPadraoFrequenciaCardiaca() {
        double media = calcularMediaFrequenciaCardiaca();
        double soma = 0;
        for (FrequenciaCardiaca freq : lstFreqCard) {
            soma += Math.pow(freq.getFrequencia() - media, 2);
        }
        return Math.sqrt(soma / lstFreqCard.size());
    }

    public double calcularMinimoFrequenciaCardiaca() {
        double min = Double.MAX_VALUE;
        for (FrequenciaCardiaca freq : lstFreqCard) {
            if (freq.getFrequencia() < min) {
                min = freq.getFrequencia();
            }
        }
        return min;
    }

    public double calcularMaximoFrequenciaCardiaca() {
        double max = Double.MIN_VALUE;
        for (FrequenciaCardiaca freq : lstFreqCard) {
            if (freq.getFrequencia() > max) {
                max = freq.getFrequencia();
            }
        }
        return max;
    }

    public List<Paciente> listarPacientesOrdenadosPorDataNascimento() {
        lstPacientes.sort((p1, p2) -> p1.getDataNascimento().compareTo(p2.getDataNascimento()));
        return lstPacientes;
    }

    public List<TecnicoSaude> listarTecnicosOrdenadosPorNome() {
        lstTecnicos.sort((t1, t2) -> t1.getNome().compareTo(t2.getNome()));
        return lstTecnicos;
    }

    @Override
    public String toString() {
        return "Hospital{" + "nome='" + nome + '\'' + ", lstPacientes=" + lstPacientes + '}';
    }
}

