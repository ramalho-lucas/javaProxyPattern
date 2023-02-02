package com.digitalhouse;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    @Test
    void vacinarAntesDaData(){
        Date data = new Date(2023,1,19);
        Pessoa pessoa = new Pessoa("Lucas", "Ramalho", "2542545-5",data,"Pfizer");

        new ServicoVacinarProxy().vacinarPessoa(pessoa);
    }

    @Test
    void vacinarDepoisDaData(){
        Date data = new Date(2023,5,25);
        Pessoa pessoa = new Pessoa("Jose", "Silva", "8471855-4",data,"Coronavac");

        new ServicoVacinarProxy().vacinarPessoa(pessoa);
    }
}