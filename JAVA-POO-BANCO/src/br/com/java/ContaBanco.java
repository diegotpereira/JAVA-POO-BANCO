package br.com.java;

public class ContaBanco {
	
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	// Construtores
	public ContaBanco() {

		this.setSaldo(0);
		this.setStatus(false);
	}

	public ContaBanco(int numConta, String tipo, String dono, double saldo, boolean status) {
		this.numConta = numConta;
		this.tipo = tipo;
		this.dono = dono;
		this.saldo = saldo;
		this.status = status;
	}
	
	// Getters e Setters
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	// Metodos Personalizados
	public void statusAtual() {
		
		System.out.println("---------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo de Conta: " + this.getTipo());
		System.out.println("Titular: " + this.getDono() );
		System.out.println("Saldo da Conta: R$" + this.getSaldo());
		System.out.println("Status: " + this.isStatus());
	}
	
	//Metodos
	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		
		if (tipo.equals("CP")) {
			this.setSaldo(150);
			
		} else if (tipo.equals("CC")) {
			this.setSaldo(50);
		}
		
		System.out.println("Conta aberta com sucesso!");
	}
	
	public void depositar(double valor) {
		if(this.isStatus()) {
			this.setSaldo(this.getSaldo() + valor);
			
		} else {
			System.out.println("O cliente ainda não tem conta!");
			System.out.println("Abra uma conta!");
		}
	}
	
	public void sacar(double valor) {
		if (this.isStatus()) {
			if (this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saque realizado com sucesso");
				
			} else {
				System.out.println("Saldo insuficiente para o saque: -R$" + (valor - this.getSaldo()));
			}
			
		} else {
			System.out.println("Conta inexistente");
		}
	}
	
	public void pagarMensalidade() {
		
		int taxa = 0;
		
		if (this.getTipo().equals("CC")) {
			taxa = 12;
			
		} else if (this.getTipo().equals("CP")) {
			taxa = 20;
		}
		
		if (isStatus()) {
			this.setSaldo(this.getSaldo() - taxa);
			System.out.println("Mensalidade pafa com sucesso por " + this.getDono());
			
		} else {
			
			System.out.println("Impossível pagar uma conta fechada!");
		}
	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta com saldo: R$" + this.getSaldo() + ". Então, não pode ser encerrada!");
			
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta com débito: -R$" + this.getSaldo());
			
		} else {
			this.setStatus(false);
			System.out.println("Conta encerrada!");
		}
	}
}
