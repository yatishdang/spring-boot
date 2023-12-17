import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void saveEntities(List<EmployeeEntity> entities) {
        //**** 1st Solution
        employeeRepository.saveAll(entities);

        //**** 2nd Solution
        for (EmployeeEntity entity : entities) {
            employeeRepository.save(entity);
        }
    }
}
