package it.unical.mat.embasp.specializations.idlv;

import it.unical.mat.embasp.languages.Id;
import it.unical.mat.embasp.languages.Param;

@Id("edge")
public class Edge {

	@Param(0)
	private int from;

	@Param(1)
	private int to;

	public Edge() {
		this.from = 0;
		this.to = 0;

	}

	public Edge(int from, int to) {
		this.from = from;
		this.to = to;

	}

	public int getFrom() {
		return from;
	}

	public void setFrom(int from) {
		this.from = from;
	}

	public int getTo() {
		return to;
	}

	public void setTo(int to) {
		this.to = to;
	}

	@Override
	public String toString() {
		return "edge(" + from + "," + to + ").";
	}

}