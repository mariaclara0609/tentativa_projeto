package org.example.ui;

import org.example.model.FrequenciaCardiaca;
import org.example.model.Hospital;
import org.example.model.Paciente;
import org.example.utils.Data;
import org.example.utils.Utils;

public class MenuUI {
    private Hospital hospital;
    private String opcao;

    public MenuUI(Hospital hospital) {
        this.hospital = hospital;
    }

    public void run() {
        do {
            System.out.println("###### MENU #####");
            System.out.println("1. Leitura de dados a partir de um ficheiro de texto");
            System.out.println("2. Visualização de dados no ecrã");
            System.out.println("3. Adicionar frequência cardíaca");
            System.out.println("4. Adicionar temperatura");
            System.out.println("5. Adicionar saturação");
            System.out.println("6. Calcular medidas de sumário");
            System.out.println("7. Classificar pacientes");
            System.out.println("8. Listar pacientes ordenados por data de nascimento");
            System.out.println("9. Listar técnicos de saúde ordenados por nome");
            System.out.println("10. Registrar novo paciente");
            System.out.println("0. Terminar programa");
            opcao = Utils.readLineFromConsole("Escolha uma opção: ");

            switch (opcao) {
                case "1":
                    // Implementar leitura de dados
                    break;
                case "2":
                    hospital.visualizarPacientes();
                    break;
                case "3":
                    adicionarFrequenciaCardiaca();
                    break;
                case "4":
                    adicionarTemperatura();
                    break;
                case "5":
                    adicionarSaturacao();
                    break;
                case "6":
                    calcularMedidasSumario();
                    break;
                case "7":
                    classificarPacientes();
                    break;
                case "8":
                    listarPacientesOrdenados();
                    break;
                case "9":
                    listarTecnicosOrdenados();
                    break;
                case "10":
                    RegistarPacientes_UI registarPacientesUI = new RegistarPacientes_UI(hospital);
                    registarPacientesUI.run();
                    break;
                case "0":
                    System.out.println("Programa terminado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (!opcao.equals("0"));
    }

    private void adicionarFrequenciaCardiaca() {
        Data dataRegisto = Utils.readDateFromConsole("Introduza a data da medição (dd-MM-yyyy): ");
        double frequencia = Utils.readDoubleFromConsole("Introduza a frequência cardíaca: ");
        int idPaciente = Utils.readIntFromConsole("Introduza o ID do paciente: ");
        int idTecnico = Utils.readIntFromConsole("Introduza o ID do técnico: ");
        // Obter paciente e técnico com base nos IDs
        // hospital.adicionarFreqCardiaca(dataRegisto, frequencia, paciente, tecnico);
    }

    private void adicionarTemperatura() {
        Data dataRegisto = Utils.readDateFromConsole("Introduza a data da medição (dd-MM-yyyy): ");
        double temperatura = Utils.readDoubleFromConsole("Introduza a temperatura: ");
        int idPaciente = Utils.readIntFromConsole("Introduza o ID do paciente: ");
        int idTecnico = Utils.readIntFromConsole("Introduza o ID do técnico: ");
        // Obter paciente e técnico com base nos IDs
        // hospital.adicionarTemperatura(dataRegisto, temperatura, paciente, tecnico);
    }

    private void adicionarSaturacao() {
        Data dataRegisto = Utils.readDateFromConsole("Introduza a data da medição (dd-MM-yyyy): ");
        double saturacao = Utils.readDoubleFromConsole("Introduza a saturação: ");
        int idPaciente = Utils.readIntFromConsole("Introduza o ID do paciente: ");
        int idTecnico = Utils.readIntFromConsole("Introduza o ID do técnico: ");
        // Obter paciente e técnico com base nos IDs
        // hospital.adicionarSaturacao(dataRegisto, saturacao, paciente, tecnico);
    }

    private void calcularMedidasSumario() {
        System.out.println("Média da frequência cardíaca: " + hospital.calcularMediaFrequenciaCardiaca());
        System.out.println("Desvio padrão da frequência cardíaca: " + hospital.calcularDesvioPadraoFrequenciaCardiaca());
        System.out.println("Mínimo da frequência cardíaca: " + hospital.calcularMinimoFrequenciaCardiaca());
        System.out.println("Máximo da frequência cardíaca: " + hospital.calcularMaximoFrequenciaCardiaca());
    }

    private void classificarPacientes() {
        for (Paciente paciente : hospital.getLstPacientes()) {
            // Obter as medições mais recentes
            FrequenciaCardiaca freq = // Obter a frequência cardíaca mais recente
                    Temperatura temp = // Obter a temperatura mais recente
                    Saturacao sat = // Obter a saturação mais recente
                    System.out.println(paciente.getNome() + ": " + paciente.classificarPaciente(freq, temp, sat));
        }
    }

    private void listarPacientesOrdenados() {
        hospital.listarPacientesOrdenadosPorDataNascimento().forEach(System.out::println);
    }

    private void listarTecnicosOrdenados() {
        hospital.listarTecnicosOrdenadosPorNome().forEach(System.out::println);
    }
}
