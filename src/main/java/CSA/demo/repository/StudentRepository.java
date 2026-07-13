package CSA.demo.repository;

import CSA.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // Just by extending JpaRepository, Spring gives us built-in methods 
    // like save(), findAll(), findById(), and deleteById() for free!
}
