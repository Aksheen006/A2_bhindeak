package ca.sheridancollege.bhindeak.passwordstorebhindeak.databases;

import ca.sheridancollege.bhindeak.passwordstorebhindeak.beans.PasswordRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DatabaseAccess extends JpaRepository<PasswordRecord, Long> {
    List<PasswordRecord> findByTitle(String title);
}
