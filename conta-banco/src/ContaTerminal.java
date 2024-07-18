public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO:Conhecer e importar a classe Scanner

        // Exibir as mensagens para o nosso usuário

        // Obter pela classe scanner os valores digitados no terminal

        // Exibir a mensagem conta criada

        int numero = 0006;
        String agencia - "056-2";
        String nomeCliente - "LETICIA DIAS"
        DOUBLE SALDO = 123,45;

        //Entrada de dados via terminal
        Scanner Scanner =

    New Scanner (System.in);
        
        System.out.printin("Digite o numero da agencia:");
        agencia = scanner.nextLine();

        System.out.printin("Digite o nome do cliente");
        nomeCliente = scanner.nextLine();

        System.out.printin("Digite o saldo");
        saldo = scanner.nextDouble();

        //Mensagem final com dadoos do cliente
        exibirMensagemFinal(nomeCliente, agencia, numero, SALDO);

        private static void

    exibirMensagemFinal(string nomeCliente, string agencia, double saldo){
            System.out.printin("Olá" + nomeCliente + "Agradecemos por criar uma conta em nosso banco!");
            System.out.printin("Sua agencia é" + agencia + "conta" + numero + "e seu saldo é de R$" + saldo +".");
            }
}

}}
