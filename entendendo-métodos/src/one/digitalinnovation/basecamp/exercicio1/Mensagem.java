package one.digitalinnovation.basecamp.exercicio1;

import java.time.LocalDateTime;

public class Mensagem {
    private final String BOM_DIA = "Bom dia";
    private final String BOA_TARDE = "Boa tarde";
    private final String BOA_NOITE = "Boa noite";
    private LocalDateTime horaDoDia = LocalDateTime.now();

    public Mensagem() {
    }

    public Mensagem(LocalDateTime horaDoDia) {
        this.horaDoDia = horaDoDia;
    }

    public void exibirMensagem() {
        int hora = this.horaDoDia.getHour();

        System.out.println("Hora: " + this.horaDoDia.toLocalTime());
        if (hora >= 6 && hora < 12) System.out.println(BOM_DIA);
        else if (hora >= 12 && hora < 18) System.out.println(BOA_TARDE);
        else System.out.println(BOA_NOITE);
    }
}
