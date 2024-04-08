
public class ClassePrincipal {

	public static void main(String[] args) {
		
		ClasseConta objeto_conta_um; // Criou a vari�vel
		objeto_conta_um = new ClasseConta(); // Instanciou o objeto.
		
		ClasseConta objeto_conta_dois = new ClasseConta(); // Criou a vari�vel & Instanciou o objeto (inline).
		
		System.out.println(objeto_conta_um.atributoNumeroConta);
		System.out.println(objeto_conta_um.atributoSaldoConta);
		System.out.println(objeto_conta_um.atributoTipoConta);
		System.out.println(objeto_conta_um.atributoNomeCliente);
		System.out.println(objeto_conta_um.atributoDocumentoCliente);
		
		System.out.println(objeto_conta_dois.atributoNumeroConta);
		System.out.println(objeto_conta_dois.atributoSaldoConta);
		System.out.println(objeto_conta_dois.atributoTipoConta);
		System.out.println(objeto_conta_dois.atributoNomeCliente);
		System.out.println(objeto_conta_dois.atributoDocumentoCliente);
		
		objeto_conta_um.atributoNumeroConta = 123;
		objeto_conta_um.atributoSaldoConta = 2_600.00F;
		objeto_conta_um.atributoTipoConta = "Conta Poupan�a";
		
		objeto_conta_dois.atributoNumeroConta = 789;
		objeto_conta_dois.atributoSaldoConta = 4_000.00F;
		objeto_conta_dois.atributoTipoConta = "Conta corrente";
	}

}
