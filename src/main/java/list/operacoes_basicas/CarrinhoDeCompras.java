package main.java.list.operacoes_basicas;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> itens = new ArrayList<>();

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        itens.add(item);
    }

    public void removerItem(String nome){
        for (Item item : itens){
            if (item.getNome().equals(nome)){
                itens.remove(item);
                break;
            }
        }
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    public void exibirItens(){
        for (Item item : itens){
            System.out.println(item.toString());
        }
    }

}
