package br.edu.ifsul.dao;

import br.edu.ifsul.modelo.Pessoa;
import java.io.Serializable;

/**
 *
 * @author 201613260113
 */
public class PessoaDAO<TIPO> extends DAOGenerico<Pessoa> implements Serializable {

    public PessoaDAO() {
        super();
        classePersistente = Pessoa.class;
        ordem = "nome";
    }

}
