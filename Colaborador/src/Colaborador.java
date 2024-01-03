public class Colaborador {
    private String nome;
    private double salario;
    private String cpf;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 400 ) {
            this.salario = salario;
            System.out.println("Salario incluido com sucesso!");
        }else {
            System.out.println("Salario invalido!");
        }
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void seApresentar(){
        System.out.println("Nome: "+nome);
        System.out.println("Salario: "+salario);
        System.out.println("CPF: "+cpf);
    }
}
