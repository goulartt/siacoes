package br.edu.utfpr.dv.siacoes.model;

import java.io.Serializable;

import br.edu.utfpr.dv.siacoes.model.ActivitySubmission.ActivityFeedback;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ActivitySubmissionItem implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int idActivitySubmissionItem;
	private Activity activity;
	private ActivitySubmission submission;
	private ActivityFeedback feedback;
	
	
}
