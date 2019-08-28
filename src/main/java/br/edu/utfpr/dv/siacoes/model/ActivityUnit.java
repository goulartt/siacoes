package br.edu.utfpr.dv.siacoes.model;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ActivityUnit implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int idActivityUnit;
	private String description;
	private boolean fillAmount;
	private String amountDescription;
	

}
