package dockered_app;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<Book, Long> {
}
