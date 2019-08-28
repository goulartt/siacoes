﻿package br.edu.utfpr.dv.siacoes.model;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ActivitySubmissionFooterReport implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int idActivityGroup;
	private String group;
	private double total;
	private int minimum;
	private int maximum;
	private String situation;
	private int sequence;
	

}
