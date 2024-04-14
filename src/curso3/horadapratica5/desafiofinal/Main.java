package curso3.horadapratica5.desafiofinal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Compra> compras = new ArrayList<>();

        Cartao cartao = new Cartao();
        cartao.inicia();

        while (true) {
            Compra compra = new Compra(cartao.getLimiteCartao());
            compra.comprar();
            cartao.setLimiteCartao(compra.getLimiteCartao());        //Que horror, pesquisar como fazer isso melhor
            compras.add(compra);
            compra.mensagem();
            if (compra.continuarComprando == 0){
                break;
            }
        }

        Collections.sort(compras);
        System.out.println("Valores em ordem crescente:");


        for (Compra o: compras) {
            System.out.println(o.getDescricaoCompra() + " | " + o.getValorCompra());
        }
    }
}
