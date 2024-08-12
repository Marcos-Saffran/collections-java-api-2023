package main.java.list.operacoes_basicas;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> itens = new ArrayList<>();

    public void adicionarItem(String nome, double preco, int quantidade) {
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){

        List<Item> itensParaRemover = new ArrayList<>();
        for (Item item : itens){
            if (item.getNome().equals(nome)){
                itensParaRemover.add(item);
                break;
            }
        }

        itens.removeAll(itensParaRemover);
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

    public static void main(String[] args){
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Arroz", 10.0, 2);
        carrinho.adicionarItem("Feijão", 5.0, 1);
        carrinho.adicionarItem("Macarrão", 7.0, 3);
        carrinho.adicionarItem("Carne", 30.0, 2);

        System.out.println("total de itens: " + carrinho.itens.size());
        System.out.println("Valor total: " + carrinho.calcularValorTotal());

        carrinho.exibirItens();
        System.out.println("Valor total: " + carrinho.calcularValorTotal());

        carrinho.removerItem("Macarrão");
        System.out.println("total de itens: " + carrinho.itens.size());

        carrinho.exibirItens();
        System.out.println("Valor total: " + carrinho.calcularValorTotal());
        

    }

}
