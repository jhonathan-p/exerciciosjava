public class Estudos {
    public static void main(String[] args) {

        String link = "https://www.youtube.com/watch?v=GUanHEGlje4&t";
        System.out.println("Estou estudando Java. Gostei muito do vídeo a seguir:");
        System.out.println(link);
        char meuChar = '♥';
        System.out.println(meuChar);
        System.out.println("Abaixo tenho algumas anotações interessantes:");

        System.out.println("""
        
        boolean (true ou false)
        byte (8 bits, -128 a 127)
        char (caracteres individuais, qualquer Unicode, precisa de aspas simples '')
        short (16 bits, -32.768 a 32.767)
        int (32 bits, -2.147.483.648 a 2.147.483.647)
        long (64 bits, -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807)
        float (32 bits, até 7 digitos de precisão)
        double (64 bits, até 15 digitos de precisão)
        
        
        
        Casting Implícito (conversão automática) vs Casting Explícito (conversão forçada, pode perder dados):
        Se o tipo de dado a ser convertido for menor do que quem recebe, geralmente é possível converter sem precisar declarar, exceto para o tipo char.
        Hierarquia: byte > short > char > int > long > float > double.
        Exemplo:
        byte converte para qualquer coisa de forma implícita, exceto char.
        double é sempre preciso explicitar ao converter para outro tipo.
            
            int x = 10;
            double y = x; // casting implícito
            
            double x = 10.5;
            int y = (int) x; // casting explícito
        



        + (adição)
        - (subtração)
        * (multiplicação)
        / (divisão)
        % (resto da divisão)
        

        
        == (igual a)
        != (diferente de)
        > (maior que)
        >= (maior ou igual a)
        < (menor que)
        <= (menor ou igual a)
        

        
        && (AND) (Duas ou mais condições precisam ser verdadeiras)
        || (OR) (Pelo menos uma condição precisa ser verdadeira)
        ! (NOT) (Nega a condição, se for verdadeiro o código não é executado)
        

        
        ++num
            int num = 5;
            int resultado = ++num; //num é incrementado para 6 e depois atribuído a resultado
            System.out.println(num); // imprime 6
            System.out.println(resultado); // imprime 6
        
        num++
            int num = 5;
            int resultado = num++; //num é atribuído primeiramente à variável resultado e depois incrementado para 6
            System.out.println(num); // imprime 6
            System.out.println(resultado); // imprime 5 
        
        
        
        Comparar Strings com == compara o mesmo objeto na memória e não o conteúdo das Strings.        
        Para comparar o conteúdo de duas Strings, é necessário utilizar o método equals().
        Existe também o equalsIgnoreCase() que ignora distinção de letras maiúsculas e minúsculas.
        Exemplo:
            String senha = "12345";
            if (senha.equals("12345")) {
                System.out.println("Acesso autorizado!");
            } else {
                System.out.println("Senha incorreta.");
            }
        Já nesse outro exemplo a saída será "Diferentes":
            Filme filme1 = new Filme("Avatar", 2009);
            Filme filme2 = new Filme("Avatar", 2009);
            
            if (filme1 == filme2) {
                System.out.println("Iguais");
            } else {
                System.out.println("Diferentes");
            }
            
            
            
            
        Método format(), da classe String serve para formatar Strings (String.format("%s %d %f")).
        Placeholders:
        %s (string)
        %d (dígito)
        %f (float) (%.2f mostra apenas duas casas decimais)
        Exemplo:
            String nome = "Maria";
            int idade = 30;
            double valor = 55.9999;
            System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));
            
        É possível também usar o método formatted() com Text Block.
        Exemplo:
            String nome = "João";
            int aulas = 4;                    
            String mensagem = \"""
                              Olá, %s!
                              Boas vindos ao curso de Java.
                              Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                              \""".formatted(nome, aulas);
            System.out.println(mensagem);
            
            
            
        if exemplo:    
            if (numeroSecreto == numeroDigitado) {
                System.out.println("Você acertou! Tentativas: " + i);
                break;
            } else if (numeroSecreto < numeroDigitado) {
                System.out.println("O número secreto é menor. Tentativas: " + i);
            } else {
                System.out.println("O número secreto é maior. Tentativas: " + i);
            }
            
            
            
        Switch case exemplo:
            int dia = 3;
            String nomeDia;
                    
            switch (dia) {
               case 1:
                  nomeDia = "domingo";
                  break;
               case 2:
                  nomeDia = "segunda-feira";
                  break;
               case 3:
                  nomeDia = "terça-feira";
                  break;
               case 4:
                  nomeDia = "quarta-feira";
                  break;
               case 5:
                  nomeDia = "quinta-feira";
                  break;
               case 6:
                  nomeDia = "sexta-feira";
                  break;
               case 7:
                  nomeDia = "sábado";
                  break;
               default:
                  nomeDia = "Dia inválido";
                  break;
            }
        
        
        
        Sintaxe do for loop:
            for (int i = 0; i < VALOR; i++) {                        
            }    
            
        Sintaxe do for-each:
            ArrayList<String> nomes = new ArrayList<>();
            nomes.add("Jacqueline");
            nomes.add("Paulo");
            nomes.add("Suellen");
            nomes.add("Emily");
            
            for (String nome : nomes) {
                System.out.println(nome);
            }
            
        Exemplo extra de instanceof usado para listas com objetos de classes diferentes: 
            for(Titulo item : lista) {                                                   //SuperClass
                System.out.println(“Nome: “ + item.getNome());                              
                if (item instanceof Filme filme && filme.getClassificacao() > 2) {       //SubClass
                    System.out.println(“Classificação: “ +filme.getClassificacao());
                }
            }
        
        A partir do Java 8 é possivel fazer assim (expressão lambda):
            nomes.forEach(nome -> System.out.println(nome));
            
        Method Reference (ainda mais simplificado, forma reduzida de uma expressão lambda):
            nomes.forEach(System.out::println);
        
        
        
        Sintaxe do while loop:
            while (condição) {
            }    
            
            
            
        Scanner (input):                
            import java.util.Scanner;
            
            Scanner variavel = new Scanner(System.in);
                                
            String nome = variavel.nextLine();
            int numero = variavel.nextInt();
            double flutuante = variavel.nextDouble();



        Modificadores de acesso: public, protected, private e default (package-private).
        
        Getters e Setters vão ser muito usados quando um atributo de uma classe for declarado como private.
        O atributo pode ser declarado como protected, permitindo que outras classes alterem diretamente o atributo sem a necessidade de passar por uma possível lógica dos getters e setters.
        protected = acesso no mesmo pacote ou sub classes.
        
        
        
        Packages servem para organizar melhor o código. Dependendo do uso é necessário importar a package assim como declara-la.            
            package pacote.subpacote;
            import pacote.subpacote.Classe(ou * para tudo);
        É praticamente uma pasta dentro de outra pasta.
        A convenção é usar o domínio ao contrário. Exemplo: br.com.exemplo
        
        
        
        Herança: Herda atributos e métodos de outra classe, é possível também fazer @Override de métodos. @Deprecated indica métodos ou classes obsoletas.
            public class SubClass extends SuperClass {
            
        Além de Classes existem Inferfaces. Diferente da Classe onde uma subclasse pode ou não utilizar todos os métodos herdados.
        As interfaces DEVEM implementar todos os métodos.
            public class SubClass extends SuperClass implements Interface {
        
        Classes que usam métodos de interface que não são objetos não precisam implementar a interface, pois quem vai implementar vai ser o objeto onde a classe foi usada.
        Exemplo: Usar no Main um método de uma SubSlasse que implementou a interface. Não é necessário implementar a interface no Main. 
        
        
        
        ArrayList e array são coisas diferentes.
        Arrays tem tamanho fixo, e não possuem métodos. Exemplo:
            int[] numeros = new int[5]; //Cria o array. Ele vai de 0 até 4.        
            for (int i = 0; i < numeros.length; i++) {     //Preenche o array
                numeros[i] = i + 1;
            }
                    
        Ele pode ser também de objetos:
            Filme[] filmes = new Filme[2];                    
            Filme filme1 = new Filme("Avatar", 2009);
            Filme filme2 = new Filme("Dogville", 2003);            
            filmes[0] = filme1;
            filmes[1] = filme2;
            
        Pelo visto é comum sobrescrever o método toString() para melhorar a visualização do ArrayList. Exemplo:        
            @Override
            public String toString() {
                return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
            }
        
        Métodos muito utilizados: add(), size(), get(), toString().
        
        
        
        
        Construtor (método especial): usado para inicializar objetos quando são criados. Exemplo:
            public class Carro extends SuperClass {              //Imaginemos que algo foi herdado de uma SuperClass.
                private String marca;                                   
                private String modelo;                                          
                                                                    
                // Construtor                                           
                public Carro(int superVar1, int superVar2, String marca, String modelo) {
                    super(var1, var2);                           //Isso aqui será usado se algo foi herdado da SuperClass. 
                    this.marca = marca;                          //NÃO ESQUECER DO this.var = var
                    this.modelo = modelo;                        //NÃO ESQUECER DO this.var = var
                }
            }
        
        
        Collections.sort(lista)    
            
        Interface Comparable e Comparator.
        compareTo() sintaxe:        
        
            public class Titulo implements Comparable<Titulo> {                 //<Class>
        
            public int compareTo(Titulo outroTitulo) {
                    return this.getNome().compareTo(outroTitulo.getNome());     //Comparando as Strings
                }
                
        Comparator:
            lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));       //Novo Comparator
                
                
                
            public int compareTo(Conta outraConta) {        //Isso é antigo, pesquisar melhor
                if (this.numero < outraConta.numero) {
                    return -1;                              //Vem antes
            }                                               
                if (this.numero > outraConta.numero) {      
                    return 1;                               //Vem depois
                }                                           
                return 0;                                   //Igual
            }
            
            public class TitularComparator implements Comparator {     //Comparator antigo também
                public int compare(Conta conta, Conta outraConta) {
                    return conta.getTitular().
                            compareTo(outraConta.getTitular());
                }
            }
            
            TitularComparator comparator = new TitularComparator();
                    Collections.sort(lista, comparator);
    
    
        
        
        
        A partir do Java 10 é possível declarar variáveis com "var". O compilador infire automaticamente o tipo da variável com base no valor atribuído a ela.
        Exemplo: var numero = 10; //O compilardor vai atribuir int.
        
        Limitações: 
        Não é possível utilizar var em variáveis cujo tipo não possa ser inferido automaticamente.                           
        Não é possível usar var em variáveis sem valor inicial. É necessário atribuir um valor à variável na mesma linha em que ela é declarada.
        
        
        

        Nomes de classes devem começar com letra maiúscula e usar a convenção PascalCase (também conhecida como Upper CamelCase).
        Exemplo: MinhaClasse.

        Nomes de métodos devem começar com letra minúscula e usar a convenção camelCase.
        Exemplo: meuMetodo().

        Nomes de constantes devem ser totalmente em letras maiúsculas, separadas por underline.
        Exemplo: MINHA_CONSTANTE.

        Nomes de variáveis devem começar com letra minúscula e usar a convenção camelCase.
        Exemplo: minhaVariavel.

        Todas as linhas de código devem ter no máximo 80 caracteres de largura para facilitar a leitura.

        Recomenda-se usar espaços em branco para separar operadores, palavras-chave e elementos de controle de fluxo.
        Exemplo: if (condicao) {.

        Use comentários para documentar seu código, explicando o que ele faz e por que ele faz isso. Comentários devem ser claros e concisos.
        """);

    }
}
