package br.com.medicamento.ultility;

public class NegocioException extends Exception {

	public static final long serialVersionUID = 1L;
	
	public NegocioException(String message) {
		super(message);
	}
}
