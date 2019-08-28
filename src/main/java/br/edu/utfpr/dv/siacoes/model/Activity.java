package br.edu.utfpr.dv.siacoes.model;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
public class Activity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private int idActivity;
	private ActivityGroup group;
	private ActivityUnit unit;
	private Department department;
	private String description;
	private double score;
	private double maximumInSemester;
	private boolean active;
	private int sequence;
	
	
	
}
