public class App {
    public static void main(String[] args) throws Exception {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

        Tarefa tarefa1 = new Tarefa("Corrigir", "alta");
        Tarefa tarefa2 = new Tarefa("Atualizar notas", "média");
        Tarefa tarefa3 = new Tarefa("Visita técnica", "baixa");

        gerenciador.adicionarTarefa(tarefa1);
        gerenciador.adicionarTarefa(tarefa2);
        gerenciador.adicionarTarefa(tarefa3);

        // Listar todas as tarefas
        System.out.println("\nTodas as tarefas:");
        gerenciador.listarTarefas();

        // Marcar uma tarefa como concluída
        gerenciador.marcarConcluida(1);  // Marca a tarefa na posição 1 como concluída

        // Listar todas as tarefas após a conclusão de uma
        System.out.println("\nApós marcar uma tarefa como concluída:");
        gerenciador.listarTarefas();

        // Listar tarefas de uma determinada prioridade
        System.out.println("\nTarefas de prioridade 'alta':");
        gerenciador.listarTarefasPrioridade("alta");

        // Remover uma tarefa
        gerenciador.removerTarefa(2);  // Remove a tarefa na posição 2

        // Listar todas as tarefas após a remoção
        System.out.println("\nApós remover uma tarefa:");
        gerenciador.listarTarefas();
    }
    }
