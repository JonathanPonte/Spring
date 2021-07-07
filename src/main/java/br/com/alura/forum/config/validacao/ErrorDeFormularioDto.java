package br.com.alura.forum.config.validacao;

public class ErrorDeFormularioDto {
	
	private String campo;
	private String error;
	
	public ErrorDeFormularioDto(String campo, String error) {
		super();
		this.campo = campo;
		this.error = error;
	}
	
	public String getCampo() {
		return campo;
	}
	public void setCampo(String campo) {
		this.campo = campo;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}

	
	
}
