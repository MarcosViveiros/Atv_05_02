public class GerenciadorTarefas {
    private Tarefa[] tarefas;
    private int contador;


    public GerenciadorTarefas() {
        tarefas = new Tarefa[50];
        contador = 0;
    }

    public void adicionarTarefa(Tarefa novaTarefa) {
        if (contador < 50) {
            tarefas[contador] = novaTarefa;
            contador++;
            System.out.println("Tarefa adicionada com sucesso.");
        } else {
            System.out.println("Lista de tarefas cheia, não é possível adicionar mais.");
        }
    }

    public void removerTarefa(int posicao) {
        if (posicao >= 0 && posicao < contador) {
            tarefas[contador] = null;
            contador--;
            System.out.println("Tarefa removida com sucesso.");
        } else {
            System.out.println("Posição inválida.");
        }
    }

    public void marcarConcluida(int posicao) {
        if (posicao >= 0 && posicao < contador) {
            tarefas[posicao].setStatus("concluída");
            System.out.println("Tarefa marcada como concluída.");
        } else {
            System.out.println("Posição inválida.");
        }
    }

    public void listarTarefas() {
        System.out.println("Tarefas Pendentes:");
        for (int i = 0; i < contador; i++) {
            if (tarefas[i].getStatus().equals("pendente")) {
                tarefas[i].exibirInfo();
            }
        }
        System.out.println("\nTarefas Concluídas:");
        for (int i = 0; i < contador; i++) {
            if (tarefas[i].getStatus().equals("concluída")) {
                tarefas[i].exibirInfo();
            }
        }
    }

    public void listarTarefasPrioridade(String prioridade) {
        System.out.println("Tarefas com prioridade " + prioridade + ":");
        boolean encontrou = false;
        for (int i = 0; i < contador; i++) {
            if (tarefas[i].getPrioridade().equalsIgnoreCase(prioridade)) {
                tarefas[i].exibirInfo();
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhuma tarefa encontrada com essa prioridade.");
        }
    }
}
