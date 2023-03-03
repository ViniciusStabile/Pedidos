package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

	private static final SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
	
	
	private String nome;
	private String imail;
	private Date dataNascimento;
	
	


	public Cliente(String nome, String imail, Date dataNascimento) {
		this.nome = nome;
		this.imail = imail;
		this.dataNascimento = dataNascimento;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getImail() {
		return imail;
	}



	public void setImail(String imail) {
		this.imail = imail;
	}



	public Date getDataNascimento() {
		return dataNascimento;
	}



	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	public String toString() {
		return nome + " (" + data.format(dataNascimento) + ") - " + imail;
 	}
	
	
}
