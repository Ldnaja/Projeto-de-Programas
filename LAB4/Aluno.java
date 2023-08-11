class Aluno{

    String nome;
    int matricula;
    int anoNascimento;

    Aluno(){
        nome = "Emmett L. Brown";
        matricula = 7714;
        anoNascimento = 22;
    }

    Aluno(String nome, int matricula, int anoNascimento){
        this.nome = nome;
        this.matricula = matricula;
        this.anoNascimento = anoNascimento;
    }

    int getIdade(){
        return 2023-anoNascimento;
    }

    String getDescricao(){
        return nome+"(mat="+matricula+", idade="+getIdade()+")";
    }
}