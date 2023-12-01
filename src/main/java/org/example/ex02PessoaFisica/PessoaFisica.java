package org.example.ex02PessoaFisica;

public class PessoaFisica {

        private String nome;
        private String cpf;

    public PessoaFisica(String nome, String cpf) {
            this.nome = nome;
            setCPF(cpf);
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCPF() {
            return cpf;
        }

        public void setCPF(String cpf) {
            if (validarCPF(cpf)) {
                this.cpf = cpf;
            } else {
                throw new IllegalArgumentException("CPF inválido");
            }
        }

    private boolean validarCPF(String cpf) {
    return true;
    }

}
