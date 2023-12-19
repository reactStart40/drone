package telran.drone.entities;
import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "history_log")

public class HistoryLog {
	@Id	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name = "buttery_level", nullable = false)
	int butteryPercent;

	@ManyToOne
	@Column(name = "drone", nullable = false)
	Drone drone;

	@ManyToOne
	@Column(name = "medication")
	Medication medication;

}

	
