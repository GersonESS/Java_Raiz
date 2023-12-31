public class Conta
{
	private String titular;
	private double saldo;
	private int numero;
	private int agencia;
public Conta(String titular. double saldo, int numero, int agencia ){
	this.titular=titular;
	this.saldo=saldo;
	this.numero=numero;
	this.agencia=agencia;
}
		
public void deposita(double quantidade){
saldo+=quantidade;
}
public void saca(double quantidade){
saldo+=quantidade;
}
public void saca( ){
system.out.printf('Seu saldo %f.'  ,saldo);
}
/* . . . Outros metodos . . . */
}