package ca.sheridancollege.bhindeak.passwordstorebhindeak.beans;

import jakarta.persistence.*;
import lombok.*;

/* Name: Aksheen Bhinder
student id : 991762812
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "passwords")
public class PasswordRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-generates ID
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = true)  // Allow NULL for URLs
    private String url;

    @Column(nullable = false)
    private String email;

    @Column(columnDefinition = "TEXT")
    private String notes;
}
