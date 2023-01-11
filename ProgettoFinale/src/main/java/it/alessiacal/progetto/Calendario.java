package it.alessiacal.progetto;

import java.util.ArrayList;
import java.util.List;

public class Calendario {

	private String nomeC;
	private String descrizioneC;
	private	List<Evento> lista;

	public void addEvent(Evento ev1){
	    lista.add(ev1);
	    Evento evento= new Evento();
	    evento.Evento();
	}

	public String getNomeC() {
		return nomeC;
	}

	public void setNomeC(String nomeC) {
		this.nomeC = nomeC;
	}

	public String getDescrizioneC() {
		return descrizioneC;
	}

	public void setDescrizioneC(String descrizioneC) {
		this.descrizioneC = descrizioneC;
	}

	public List<Evento> getLista() {
		return lista;
	}

	public void setLista(List<Evento> lista) {
		this.lista = lista;
	}

	public Calendario(String nomeC, String descrizioneC, List<Evento> lista) {
		super();
		this.nomeC = nomeC;
		this.descrizioneC = descrizioneC;
		this.lista = lista;
	}

	public Calendario() {
		super();
	}

	
	
	
	
}
