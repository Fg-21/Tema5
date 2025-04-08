package boletinComparable.ej5;

import java.util.Arrays;
import java.util.Comparator;

public class CuantaBancariaMain {
	public static void main(String[] args) {

		CuentaBancaria[] cuentas = new CuentaBancaria[2];
		
		Titular[] titu = new Titular[3];

		Titular tit1 = new Titular("12345678A", "A", "Z", 123456789);
		Titular tit2 = new Titular("23456789B", "B", "Z", 234567891);
		Titular tit3 = new Titular("23456789C", "B", "A", 234567891);

		CuentaBancaria cb1 = new CuentaBancaria(1234, tit1);
		CuentaBancaria cb2 = new CuentaBancaria(9876, tit2);
		
		Comparator<Titular> ApellidoLuegoNombre = (a, b) ->{
			int res = 0;
			
			if(!a.getApellidos().equals(b.getApellidos())) {
				res = a.getApellidos().compareTo(b.getApellidos());
			} else {
				res = a.getNombre().compareTo(b.getNombre());
			}
			return res;
		};
		
		cb1.ingresar(56);
		cb2.ingresar(3);

		cuentas[0] = cb2;
		cuentas[1] = cb1;

		titu[0] = tit2;
		titu[1] = tit1;
		titu[2] = tit3;
		
		Arrays.sort(cuentas);
		
		System.out.println(Arrays.toString(cuentas));

		
		Arrays.sort(cuentas, (a, b) ->{return (int) (a.saldo - b.saldo);});
		
		System.out.println(Arrays.toString(titu));
		
		Arrays.sort(titu);
		
		System.out.println(Arrays.toString(titu));
		
		Arrays.sort(titu, ApellidoLuegoNombre);
		
		System.out.println(Arrays.toString(titu));


	}

}
