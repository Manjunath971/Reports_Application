package in.ashokit.entity;
import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class CitizenPlan {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer citizenId;
	private String citizenName;
	private String gender;
	private String planName;
	private	String planStatus;
	private	LocalDate StartDate;
	private LocalDate endDate;
	private Integer benifittedAmount;
	private String denialReason;
	private String terminationReason;
	private String terminationDate;
	
		
}