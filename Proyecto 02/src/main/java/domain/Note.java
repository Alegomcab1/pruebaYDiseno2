
package domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Note extends DomainEntity {

	private Date			moment;
	private String			mandatoryComment;
	private List<String>	optionalComments;


	@Past
	@NotNull
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	@NotBlank
	public String getMandatoryComment() {
		return this.mandatoryComment;
	}

	public void setMandatoryComment(final String mandatoryComment) {
		this.mandatoryComment = mandatoryComment;
	}

	@Valid
	public List<String> getOptionalComments() {
		return this.optionalComments;
	}

	public void setOptionalComments(final List<String> optionalComments) {
		this.optionalComments = optionalComments;
	}

}
