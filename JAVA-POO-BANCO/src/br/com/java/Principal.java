package br.com.java;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBanco cliente1 = new ContaBanco();
		cliente1.abrirConta("CC");
		cliente1.setNumConta(11);
		cliente1.setDono("Romeu");
		cliente1.depositar(100);
		cliente1.sacar(50);
		cliente1.pagarMensalidade();
		cliente1.fecharConta();
		cliente1.sacar(88);
		cliente1.fecharConta();
		
		cliente1.statusAtual();
		
		ContaBanco cliente2 = new ContaBanco();
		cliente2.abrirConta("CP");
		cliente2.setNumConta(22);
		cliente2.setDono("Julieta");
		cliente2.sacar(25);
		cliente2.pagarMensalidade();
		cliente2.fecharConta();
		cliente2.sacar(105);
		cliente2.fecharConta();
		cliente2.depositar(50);
		cliente2.setStatus(true);
		cliente2.depositar(50);
		cliente2.sacar(50);
		cliente2.fecharConta();
		
		cliente2.statusAtual();
		

	}

}
