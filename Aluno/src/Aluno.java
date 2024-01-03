/*Crie uma classe "Aluno" que tenha como atributos
o nome, a nota do
aluno em uma prova, a média da turma e a
disciplina, e como
método a verificação se o aluno foi
aprovado ou não, considerando
uma nota de corte.*/
public class Aluno {
    private String nome;
    private String diciplina;
    private double nota;
    private double mediaDaTurma;
    private boolean aprovado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiciplina() {
        return diciplina;
    }

    public void setDiciplina(String diciplina) {
        this.diciplina = diciplina;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getMediaDaTurma() {
        return mediaDaTurma;
    }

    public void setMediaDaTurma(double mediaDaTurma) {
        this.mediaDaTurma = mediaDaTurma;
    }

    public boolean isAprovado() {
        if (calcularMedia() >= 7){
            return true;
        }else{
            return false;
        }

    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public double calcularMedia(){
        return (getNota() + getMediaDaTurma()) / 2;
    }
}