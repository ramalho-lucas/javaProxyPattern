package com.digitalhouse;

import java.util.Date;

public class ServicoVacinarProxy implements Vacinar{

    @Override
    public void vacinarPessoa(Pessoa pessoa) {
        if(pessoa.getDataVacina().before(new Date(2023,2,2))){
            new ServicoVacinar().vacinarPessoa(pessoa);
        } else {
            System.out.println("Usuario(a) "+ pessoa.getNome()+ " ainda não pode ser vacinado");
        }
    }
}
