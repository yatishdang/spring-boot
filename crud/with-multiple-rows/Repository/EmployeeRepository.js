import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
    // Additional custom queries can be added here if needed
}
