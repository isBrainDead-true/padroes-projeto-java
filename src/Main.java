

import Strategy.Comportamento;
import Strategy.ComportamentoDefensivo;
import Strategy.ComportamentoNormal;
import Strategy.ComportamentoOfensivo;
import Strategy.Robo;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonLazy lazy = SingletonLazy.getInstance();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstance();
		System.out.println(eager);
		
		SingletonLazyHolder lHolder = SingletonLazyHolder.getInstance();
		System.out.println(lHolder);
		
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoOfensivo();
		
		Robo robs = new Robo();
		robs.setStrategy(normal);
		
		robs.mover();
		
		robs.setStrategy(agressivo);
		robs.mover();
		
	}
	

}
