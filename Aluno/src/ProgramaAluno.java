public class ProgramaAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Leandro");
        aluno.setDiciplina("Java");
        aluno.setNota(8.0);
        aluno.setMediaDaTurma(9.5);

        System.out.println(aluno.calcularMedia());

        if (aluno.isAprovado()) {
            System.out.println("Aluno aprovado");
        }else{
            System.out.println("Aluno reprovado");
        }
    }
}