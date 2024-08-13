package main.java.map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {

    Map<LocalDate, Evento> agendaEventosMap;

    public AgendaEventos() {
        this.agendaEventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        agendaEventosMap.put(data, new Evento(nome, atracao));
    }

    // exibir agenda de eventos em ordem crescente de data
    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        // Set<LocalDate> dateSet = agendaEventosMap.keySet();
        // Collection<Evento> eventoCollection = agendaEventosMap.values();

        // agendaEventosMap.get();

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventosMap);

        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " acontecerá em " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        System.out.println(LocalDate.now());

        System.out.println("Adicionando eventos na agenda...");
        agenda.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 10), "Evento 1", "Atracao 1");
        agenda.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 15), "Evento 2", "Atracao 2");
        agenda.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 20), "Evento 3", "Atracao 3");
        agenda.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 25), "Evento 4", "Atracao 4");
        agenda.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 30), "Evento 5", "Atracao 5");

        System.out.println("Exibindo agenda de eventos...");
        agenda.exibirAgenda();

        System.out.println("Obtendo próximo evento...");
        agenda.obterProximoEvento();
    }

}
