package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		Cuenta cuenta1=new Cuenta("03476");
		cuenta1.setSaldo(675);
		
		Cuenta cuenta2=new Cuenta("03476","C",98);
		
		Cuenta cuenta3=new Cuenta("03476");
		cuenta3.setTipo("C");
		
		Cuenta cuenta4=new Cuenta("0987","A",10);
		
		Cuenta cuenta5=new Cuenta("0557","C",10);
		
		Cuenta cuenta6=new Cuenta("0666");
		
		
		
		System.out.println("---------Valores Iniciales---------");
		cuenta1.imprimirConMiEstilo();
		cuenta2.imprimirConMiEstilo();
		cuenta3.imprimirConMiEstilo();
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();
		System.out.println("---------Valores Modificados---------");
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");
		cuenta1.imprimirConMiEstilo();
		cuenta2.imprimirConMiEstilo();
		cuenta3.imprimirConMiEstilo();
		
	}

}
