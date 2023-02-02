# javaProxyPattern

* É um padrão do tipo estrutural. Cumpre a função de ser um intermediário que adiciona a funcionalidade a uma classe sem modificá-la.

* PROPOSITO:
  * Seu ibjetivo é desenvolver a funcao de ser um intermediario que agrega funcionalidade a uma classe sem tocar nela.

* SOLUÇÃO:
  * Definir uma classe proxy com a mesma interface do objeto de servico original. Posteriormente nosso aplicativo deve ser atualizado para que os clientes se comuniquem com o proxy e não com o serviço de destino. Ao receber um pedido de um cliente, o proxy ira encaminha-lo para o servico, mais como intermediário poderemos realizar operacoes antes ou depois de direcionar a solicitação.

* VANTAGENS:
  * O proxy funciona mesmo se o objeto de servico não estiver pronto ou disponível
Prinicipio de aberto/fechado: podemos introduzir novos proxies sem alterar o serviço ou clientes.

* DESVANTAGENS:
  * Ao adicionar mais de uma camanda entre o cliente e o servico real, a resposta pode ser atrasada.
