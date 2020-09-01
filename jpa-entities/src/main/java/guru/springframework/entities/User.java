package guru.springframework.entities;

import lombok.*;

import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class User {

    private String firstName;
    private String lastName;
    private String email;
}
