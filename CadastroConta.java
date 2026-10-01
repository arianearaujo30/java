import java.util.ArrayList;

public class CadastroConta {

    private ArrayList<Conta> contas;
    private static final int LIMITE_CONTAS = 100;

    public CadastroConta() {
        contas = new ArrayList<>();
    }

    public void inserir(Conta conta)
            throws ExcecaoElementoJaExistente, ExcecaoRepositorio {

        if (conta == null || conta.getNumeroConta() == null) {
            throw new ExcecaoRepositorio(
                    "Não foi possível cadastrar uma conta inválida."
            );
        }

        if (contas.size() >= LIMITE_CONTAS) {
            throw new ExcecaoRepositorio(
                    "Limite máximo de 100 contas atingido."
            );
        }

        for (Conta c : contas) {
            if (conta.getNumeroConta().equals(c.getNumeroConta())) {
                throw new ExcecaoElementoJaExistente(
                        "Já existe uma conta com o mesmo número."
                );
            }
        }

        contas.add(conta);
    }

    public Conta buscar(String numeroConta)
            throws ExcecaoElementoInexistente {

        if (numeroConta == null) {
            throw new ExcecaoElementoInexistente(
                    "Número de conta inválido para busca."
            );
        }

        for (Conta c : contas) {
            if (numeroConta.equals(c.getNumeroConta())) {
                return c;
            }
        }

        throw new ExcecaoElementoInexistente(
                "Não foi possível encontrar a conta."
        );
    }

    public void remover(String numeroConta)
            throws ExcecaoElementoInexistente {

        Conta conta = buscar(numeroConta);
        contas.remove(conta);
    }

    public int quantidadeContas() {
        return contas.size();
    }
}