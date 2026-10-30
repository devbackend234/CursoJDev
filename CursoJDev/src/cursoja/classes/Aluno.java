package cursoja.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Aluno {
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGreal;
	private String numeroCPF;
	private String nomePai;
	private String nomeMae;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private  List<Disciplina> disciplina = new ArrayList<Disciplina>();
	
	
	/*Metodos*/
	
	public double mediaNota() {
		return (disciplina.getNota1() +disciplina.getNota2()+disciplina.getNota3()+disciplina.getNota4())/4;
	}
	public void alunoAprovado() {
		double media= this.mediaNota();
		if(media>=70) {
			System.out.println("Aprovado por média igual ou superior a 70");
		}else if(media>50 && media<70 ) {
			System.out.println("Recuperação por media superior a 50 e inferior a 70");
		}else {
			System.out.println("Reprovador por media inferior a 50 ");
		}
	}
	
	
	/*Getters e Setter*/

	public void setDisciplina(List<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}
	public List<Disciplina> getDisciplina() {
		return disciplina;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRegistroGreal() {
		return registroGreal;
	}
	public void setRegistroGreal(String registroGreal) {
		this.registroGreal = registroGreal;
	}
	public String getNumeroCPF() {
		return numeroCPF;
	}
	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	public String getSerieMatriculado() {
		return serieMatriculado;
	}
	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGreal="
				+ registroGreal + ", numeroCPF=" + numeroCPF + ", nomePai=" + nomePai + ", nomeMae=" + nomeMae
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(dataMatricula, dataNascimento, Integer.valueOf(idade), nome, nomeEscola, nomeMae, nomePai,
				numeroCPF, registroGreal, serieMatriculado);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(dataMatricula, other.dataMatricula)
				&& Objects.equals(dataNascimento, other.dataNascimento) && idade == other.idade
				&& Objects.equals(nome, other.nome) && Objects.equals(nomeEscola, other.nomeEscola)
				&& Objects.equals(nomeMae, other.nomeMae) && Objects.equals(nomePai, other.nomePai)
				&& Objects.equals(numeroCPF, other.numeroCPF) && Objects.equals(registroGreal, other.registroGreal)
				&& Objects.equals(serieMatriculado, other.serieMatriculado);
	}
	
	
	

}
