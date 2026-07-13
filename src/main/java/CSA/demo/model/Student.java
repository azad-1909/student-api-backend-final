package CSA.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "students") // This will be the table name in MySQL
@Data // Lombok: Auto-generates getters and setters
@NoArgsConstructor // Lombok: Auto-generates an empty constructor
@AllArgsConstructor // Lombok: Auto-generates a full constructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Auto-incrementing primary key

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    private String course;
}


    

