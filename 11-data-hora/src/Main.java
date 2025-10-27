/*Crie um programa que:

Mostra a data e hora atual local e em UTC.
Exibe a data formatada no padrão brasileiro.
Calcula uma data de vencimento, somando 7 dias à data atual.
Calcula quantos dias faltam até o fim do mês atual.*/

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        LocalDateTime agora = LocalDateTime.now();
        Instant global = Instant.now();

        System.out.println("Data atual: " + hoje);
        System.out.println("Data e hora local: " + agora);
        System.out.println("Instante global (UTC): " + global);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Formatado (BR): " + fmt.format(agora));

        LocalDate vencimento = hoje.plusDays(7);
        System.out.println("Vencimento em: " + vencimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        LocalDate fimDoMes = hoje.withDayOfMonth(hoje.lengthOfMonth());
        long diasRestantes = ChronoUnit.DAYS.between(hoje, fimDoMes);
        System.out.println("Dias até o fim do mês: " + diasRestantes);
    }
}

