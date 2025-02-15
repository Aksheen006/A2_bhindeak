package ca.sheridancollege.bhindeak.passwordstorebhindeak.beans;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "passwords")
public class PasswordRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private Long id;
    private String title;
    private String username;
    private String password;
    private String url;
    private String email;
    private String notes;
}