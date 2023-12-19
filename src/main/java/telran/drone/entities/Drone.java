package telran.drone.entities;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import telran.drone.dto.*;


@Entity
@Table(name="drones")
@NoArgsConstructor
public class Drone {
	@Id
	int id;
	@Column(nullable = false)
	Drone model;
	@Column(nullable = false)
	int weight;
	@Column(nullable = false)
	int batteryCapacity;
	@Column(nullable = false)
	StateDrone state;

}
		


