package br.com.k19.managedbeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.com.k19.sessionbeans.LancadorDeDadoBean;

@ManagedBean
public class DadoMB {

	@EJB
	private LancadorDeDadoBean lancadorDeDadoBean;
	
	private int resultado;
	
	public void lancaDado(){
		
		this.resultado = this.lancadorDeDadoBean.lanca();
		System.out.println("Commit");
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
}
