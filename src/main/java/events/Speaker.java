package events;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Speaker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer speakerId;

    private String name;

    private int presentationDuration; // minutos

    @ManyToOne
    @JoinColumn(name = "conference_id")
    private Conference conference;
}
