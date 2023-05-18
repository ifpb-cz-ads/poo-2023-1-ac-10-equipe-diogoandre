class RegistraAluno {
    private String nome;
    private int idade;
    private String matricula;

    
    void setIdade(int idade) {
        this.idade = idade;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void setMatricula (String matricula) {
        this.matricula = matricula;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matrícula: " + matricula);
    }


    public void imprimir(double nota1, double nota2) {
        System.out.println("Nome: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
    }

    
}



