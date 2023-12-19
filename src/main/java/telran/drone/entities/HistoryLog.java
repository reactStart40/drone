package telran.drone.entities;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "history_log")

public class HistoryLog {
	@Id	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name = "battery_level", nullable = false)
	int butteryPercent;

	@ManyToOne
	@Column(name = "drones", nullable = false)
	Drone drone;

	@ManyToOne
	@Column(name = "medication")
	Medication medication;

}

	
