import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=== EXEMPLO COMPLETO DA CLASSE CALENDAR ===\n");
        
        // 1. .getInstance() - Obtém um Calendar com configuração padrão
        System.out.println("1. .getInstance()");
        Calendar calendario = Calendar.getInstance();
        System.out.println("Calendar criado: " + calendario.getTime());
        // SAÍDA: Data e hora atuais do sistema
        
        // 2. .get(int field) - Retorna valor do campo especificado
        System.out.println("\n2. .get(int field)");
        int ano = calendario.get(Calendar.YEAR);
        int mes = calendario.get(Calendar.MONTH);
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        int minuto = calendario.get(Calendar.MINUTE);
        System.out.println("Data: " + dia + "/" + (mes + 1) + "/" + ano + " " + hora + ":" + minuto);
        // SAÍDA: Data atual no formato dia/mês/ano hora:minuto
        
        // 3. .set(int field, int value) - Define campo com valor especificado
        System.out.println("\n3. .set(int field, int value)");
        calendario.set(Calendar.DAY_OF_MONTH, 15);
        System.out.println("Dia alterado para 15: " + calendario.getTime());
        // SAÍDA: Data com dia 15 do mês atual
        
        // 4. .set(int year, int month, int date) - Define ano, mês e dia
        System.out.println("\n4. .set(int year, int month, int date)");
        calendario.set(2024, Calendar.MARCH, 20);
        System.out.println("Data definida: " + calendario.getTime());
        // SAÍDA: 20 de março de 2024
        
        // 5. .set(int year, int month, int date, int hourOfDay, int minute)
        System.out.println("\n5. .set(int year, int month, int date, int hourOfDay, int minute)");
        calendario.set(2024, Calendar.APRIL, 10, 14, 30);
        System.out.println("Data/hora definida: " + calendario.getTime());
        // SAÍDA: 10 de abril de 2024 14:30:00
        
        // 6. .set(int year, int month, int date, int hourOfDay, int minute, int second)
        System.out.println("\n6. .set(int year, int month, int date, int hourOfDay, int minute, int second)");
        calendario.set(2024, Calendar.MAY, 5, 18, 45, 30);
        System.out.println("Data/hora completa: " + calendario.getTime());
        // SAÍDA: 5 de maio de 2024 18:45:30
        
        // 7. .add(int field, int amount) - Adiciona ou subtrai tempo
        System.out.println("\n7. .add(int field, int amount)");
        calendario.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println("+5 dias: " + calendario.getTime());
        calendario.add(Calendar.MONTH, -2);
        System.out.println("-2 meses: " + calendario.getTime());
        calendario.add(Calendar.HOUR_OF_DAY, 3);
        System.out.println("+3 horas: " + calendario.getTime());
        // SAÍDA: Data alterada com os incrementos/decrementos
        
        // 8. .roll(int field, boolean up) - Incrementa/decrementa sem alterar campos maiores
        System.out.println("\n8. .roll(int field, boolean up)");
        calendario.set(2024, Calendar.DECEMBER, 31);
        calendario.roll(Calendar.DAY_OF_MONTH, true); // true = incrementa
        System.out.println("Roll DAY true (31/dez): " + calendario.getTime());
        calendario.roll(Calendar.DAY_OF_MONTH, false); // false = decrementa
        System.out.println("Roll DAY false: " + calendario.getTime());
        // SAÍDA: Dia alterado mas mês/ano mantidos
        
        // 9. .roll(int field, int amount) - Adiciona quantidade sem alterar campos maiores
        System.out.println("\n9. .roll(int field, int amount)");
        calendario.set(2024, Calendar.JANUARY, 15);
        calendario.roll(Calendar.DAY_OF_MONTH, 20);
        System.out.println("Roll DAY +20 (15/jan): " + calendario.getTime());
        // SAÍDA: Dia alterado dentro do mesmo mês
        
        // 10. .getTime() - Retorna objeto Date
        System.out.println("\n10. .getTime()");
        Date data = calendario.getTime();
        System.out.println("Objeto Date: " + data);
        // SAÍDA: Objeto Date correspondente ao Calendar
        
        // 11. .setTime(Date date) - Define tempo com base em Date
        System.out.println("\n11. .setTime(Date date)");
        Date novaData = new Date();
        calendario.setTime(novaData);
        System.out.println("Calendar com nova Date: " + calendario.getTime());
        // SAÍDA: Calendar atualizado com a nova Date
        
        // 12. .getTimeInMillis() - Retorna tempo em milissegundos
        System.out.println("\n12. .getTimeInMillis()");
        long millis = calendario.getTimeInMillis();
        System.out.println("Milissegundos desde epoch: " + millis);
        // SAÍDA: Número de milissegundos
        
        // 13. .setTimeInMillis(long millis) - Define tempo em milissegundos
        System.out.println("\n13. .setTimeInMillis(long millis)");
        calendario.setTimeInMillis(1609459200000L); // 1 de janeiro de 2021
        System.out.println("Data a partir de millis: " + calendario.getTime());
        // SAÍDA: Fri Jan 01 00:00:00 BRT 2021
        
        // 14. .getTimeZone() - Retorna fuso horário
        System.out.println("\n14. .getTimeZone()");
        TimeZone fuso = calendario.getTimeZone();
        System.out.println("Fuso horário: " + fuso.getID());
        // SAÍDA: America/Sao_Paulo ou similar
        
        // 15. .setTimeZone(TimeZone value) - Define fuso horário
        System.out.println("\n15. .setTimeZone(TimeZone value)");
        TimeZone fusoNY = TimeZone.getTimeZone("America/New_York");
        calendario.setTimeZone(fusoNY);
        System.out.println("Com fuso NY: " + calendario.getTime());
        // SAÍDA: Mesma data com fuso de Nova York
        
        // 16. .after(Object when) - Verifica se é depois
        System.out.println("\n16. .after(Object when)");
        Calendar outroCal = Calendar.getInstance();
        outroCal.set(2023, Calendar.JANUARY, 1);
        boolean isAfter = calendario.after(outroCal);
        System.out.println(calendario.getTime() + " é depois de " + outroCal.getTime() + "? " + isAfter);
        // SAÍDA: true ou false
        
        // 17. .before(Object when) - Verifica se é antes
        System.out.println("\n17. .before(Object when)");
        boolean isBefore = calendario.before(outroCal);
        System.out.println(calendario.getTime() + " é antes de " + outroCal.getTime() + "? " + isBefore);
        // SAÍDA: true ou false
        
        // 18. .compareTo(Calendar anotherCalendar) - Compara dois Calendar
        System.out.println("\n18. .compareTo(Calendar anotherCalendar)");
        int comparacao = calendario.compareTo(outroCal);
        System.out.println("Comparação: " + comparacao);
        // SAÍDA: 1 (maior), -1 (menor), 0 (igual)
        
        // 19. .equals(Object obj) - Compara igualdade
        System.out.println("\n19. .equals(Object obj)");
        Calendar copia = (Calendar) calendario.clone();
        boolean saoIguais = calendario.equals(copia);
        System.out.println("Calendários são iguais? " + saoIguais);
        // SAÍDA: true
        
        // 20. .clone() - Cria cópia do objeto
        System.out.println("\n20. .clone()");
        Calendar clone = (Calendar) calendario.clone();
        System.out.println("Original: " + calendario.getTime());
        System.out.println("Clone: " + clone.getTime());
        System.out.println("Mesma referência? " + (calendario == clone));
        System.out.println("Mesmo conteúdo? " + calendario.equals(clone));
        // SAÍDA: Objetos diferentes com mesmo conteúdo
        
        // 21. .clear() - Limpa todos os campos
        System.out.println("\n21. .clear()");
        Calendar calLimpo = Calendar.getInstance();
        calLimpo.clear();
        System.out.println("Calendar limpo: " + calLimpo.getTime());
        // SAÍDA: Thu Jan 01 00:00:00 BRT 1970 (epoch)
        
        // 22. .clear(int field) - Limpa campo específico
        System.out.println("\n22. .clear(int field)");
        calendario.clear(Calendar.HOUR_OF_DAY);
        calendario.clear(Calendar.MINUTE);
        calendario.clear(Calendar.SECOND);
        System.out.println("Campos de hora limpos: " + calendario.getTime());
        // SAÍDA: Data com hora 00:00:00
        
        // 23. .isSet(int field) - Verifica se campo foi definido
        System.out.println("\n23. .isSet(int field)");
        boolean horaDefinida = calendario.isSet(Calendar.HOUR_OF_DAY);
        boolean anoDefinido = calendario.isSet(Calendar.YEAR);
        System.out.println("Hora definida? " + horaDefinida);
        System.out.println("Ano definido? " + anoDefinido);
        // SAÍDA: false para hora, true para ano
        
        // 24. .getActualMaximum(int field) - Valor máximo possível para o campo
        System.out.println("\n24. .getActualMaximum(int field)");
        int maxDias = calendario.getActualMaximum(Calendar.DAY_OF_MONTH);
        int maxHoras = calendario.getActualMaximum(Calendar.HOUR_OF_DAY);
        System.out.println("Máximo dias no mês: " + maxDias);
        System.out.println("Máximo horas no dia: " + maxHoras);
        // SAÍDA: 31 e 23
        
        // 25. .getActualMinimum(int field) - Valor mínimo possível para o campo
        System.out.println("\n25. .getActualMinimum(int field)");
        int minDias = calendario.getActualMinimum(Calendar.DAY_OF_MONTH);
        int minHoras = calendario.getActualMinimum(Calendar.HOUR_OF_DAY);
        System.out.println("Mínimo dias no mês: " + minDias);
        System.out.println("Mínimo horas no dia: " + minHoras);
        // SAÍDA: 1 e 0
        
        // 26. .getMaximum(int field) - Valor máximo para o campo
        System.out.println("\n26. .getMaximum(int field)");
        int maxDiasGeral = calendario.getMaximum(Calendar.DAY_OF_MONTH);
        int maxMeses = calendario.getMaximum(Calendar.MONTH);
        System.out.println("Máximo geral de dias: " + maxDiasGeral);
        System.out.println("Máximo geral de meses: " + maxMeses);
        // SAÍDA: 31 e 11
        
        // 27. .getMinimum(int field) - Valor mínimo para o campo
        System.out.println("\n27. .getMinimum(int field)");
        int minDiasGeral = calendario.getMinimum(Calendar.DAY_OF_MONTH);
        int minMeses = calendario.getMinimum(Calendar.MONTH);
        System.out.println("Mínimo geral de dias: " + minDiasGeral);
        System.out.println("Mínimo geral de meses: " + minMeses);
        // SAÍDA: 1 e 0
        
        // 28. .getGreatestMinimum(int field) - Maior valor mínimo para o campo
        System.out.println("\n28. .getGreatestMinimum(int field)");
        int maiorMinDias = calendario.getGreatestMinimum(Calendar.DAY_OF_MONTH);
        int maiorMinMeses = calendario.getGreatestMinimum(Calendar.MONTH);
        System.out.println("Maior mínimo de dias: " + maiorMinDias);
        System.out.println("Maior mínimo de meses: " + maiorMinMeses);
        // SAÍDA: 1 e 0
        
        // 29. .getLeastMaximum(int field) - Menor valor máximo para o campo
        System.out.println("\n29. .getLeastMaximum(int field)");
        int menorMaxDias = calendario.getLeastMaximum(Calendar.DAY_OF_MONTH);
        int menorMaxMeses = calendario.getLeastMaximum(Calendar.MONTH);
        System.out.println("Menor máximo de dias: " + menorMaxDias);
        System.out.println("Menor máximo de meses: " + menorMaxMeses);
        // SAÍDA: 28 e 11
        
        // 30. .getFirstDayOfWeek() - Obtém primeiro dia da semana
        System.out.println("\n30. .getFirstDayOfWeek()");
        int primeiroDia = calendario.getFirstDayOfWeek();
        System.out.println("Primeiro dia da semana: " + primeiroDia + " (" + 
                          getNomeDiaSemana(primeiroDia) + ")");
        // SAÍDA: 1 (Domingo) para Brasil
        
        // 31. .setFirstDayOfWeek(int value) - Define primeiro dia da semana
        System.out.println("\n31. .setFirstDayOfWeek(int value)");
        calendario.setFirstDayOfWeek(Calendar.MONDAY);
        System.out.println("Primeiro dia alterado para: " + 
                          getNomeDiaSemana(calendario.getFirstDayOfWeek()));
        // SAÍDA: Segunda-feira
        
        // 32. .getMinimalDaysInFirstWeek() - Obtém dias mínimos na primeira semana
        System.out.println("\n32. .getMinimalDaysInFirstWeek()");
        int diasMinimos = calendario.getMinimalDaysInFirstWeek();
        System.out.println("Dias mínimos na primeira semana: " + diasMinimos);
        // SAÍDA: 4 (para Brasil)
        
        // 33. .setMinimalDaysInFirstWeek(int value) - Define dias mínimos
        System.out.println("\n33. .setMinimalDaysInFirstWeek(int value)");
        calendario.setMinimalDaysInFirstWeek(7);
        System.out.println("Dias mínimos alterados para: " + 
                          calendario.getMinimalDaysInFirstWeek());
        // SAÍDA: 7
        
        // 34. .isLenient() - Verifica se interpretação é leniente
        System.out.println("\n34. .isLenient()");
        boolean isLenient = calendario.isLenient();
        System.out.println("Interpretação leniente? " + isLenient);
        // SAÍDA: true (padrão)
        
        // 35. .setLenient(boolean lenient) - Define se interpretação é leniente
        System.out.println("\n35. .setLenient(boolean lenient)");
        calendario.setLenient(false);
        System.out.println("Leniente após alteração: " + calendario.isLenient());
        
        // Testando comportamento não-leniente
        try {
            calendario.set(Calendar.DAY_OF_MONTH, 32); // Dia inválido
            calendario.getTime(); // Força a validação
            System.out.println("Data válida");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: Data inválida - " + e.getMessage());
        }
        // SAÍDA: Erro de data inválida
        
        // Restaurando leniente
        calendario.setLenient(true);
        
        // DEMONSTRAÇÃO FINAL
        System.out.println("\n=== DEMONSTRAÇÃO FINAL ===");
        demonstrarTodosCampos(calendario);
    }
    
    private static String getNomeDiaSemana(int dia) {
        switch(dia) {
            case Calendar.SUNDAY: return "Domingo";
            case Calendar.MONDAY: return "Segunda-feira";
            case Calendar.TUESDAY: return "Terça-feira";
            case Calendar.WEDNESDAY: return "Quarta-feira";
            case Calendar.THURSDAY: return "Quinta-feira";
            case Calendar.FRIDAY: return "Sexta-feira";
            case Calendar.SATURDAY: return "Sábado";
            default: return "Desconhecido";
        }
    }
    
    private static void demonstrarTodosCampos(Calendar cal) {
        System.out.println("--- VALORES DE TODOS OS CAMPOS ---");
        
        // Campos de data
        System.out.println("ANO: " + cal.get(Calendar.YEAR));
        System.out.println("MÊS: " + (cal.get(Calendar.MONTH) + 1) + " (" + 
                          getNomeMes(cal.get(Calendar.MONTH)) + ")");
        System.out.println("DIA DO MÊS: " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("DIA DA SEMANA: " + cal.get(Calendar.DAY_OF_WEEK) + " (" + 
                          getNomeDiaSemana(cal.get(Calendar.DAY_OF_WEEK)) + ")");
        System.out.println("DIA DO ANO: " + cal.get(Calendar.DAY_OF_YEAR));
        System.out.println("SEMANA DO MÊS: " + cal.get(Calendar.WEEK_OF_MONTH));
        System.out.println("SEMANA DO ANO: " + cal.get(Calendar.WEEK_OF_YEAR));
        
        // Campos de hora
        System.out.println("HORA (0-23): " + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("HORA (1-12): " + cal.get(Calendar.HOUR));
        System.out.println("MINUTO: " + cal.get(Calendar.MINUTE));
        System.out.println("SEGUNDO: " + cal.get(Calendar.SECOND));
        System.out.println("MILLISEGUNDO: " + cal.get(Calendar.MILLISECOND));
        System.out.println("AM/PM: " + cal.get(Calendar.AM_PM) + " (" + 
                          (cal.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM") + ")");
        
        // Informações do calendário
        System.out.println("\n--- INFORMAÇÕES DO CALENDÁRIO ---");
        System.out.println("Fuso Horário: " + cal.getTimeZone().getID());
        System.out.println("Primeiro Dia da Semana: " + getNomeDiaSemana(cal.getFirstDayOfWeek()));
        System.out.println("Dias Mínimos 1ª Semana: " + cal.getMinimalDaysInFirstWeek());
        System.out.println("Leniente: " + cal.isLenient());
        
        // Limites
        System.out.println("\n--- LIMITES PARA O MÊS ATUAL ---");
        System.out.println("Mínimo Dias: " + cal.getActualMinimum(Calendar.DAY_OF_MONTH));
        System.out.println("Máximo Dias: " + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println("Mínimo Horas: " + cal.getActualMinimum(Calendar.HOUR_OF_DAY));
        System.out.println("Máximo Horas: " + cal.getActualMaximum(Calendar.HOUR_OF_DAY));
    }
    
    private static String getNomeMes(int mes) {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                         "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return meses[mes];
    }
}