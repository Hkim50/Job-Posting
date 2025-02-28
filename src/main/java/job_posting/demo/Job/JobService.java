package job_posting.demo.Job;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

public interface JobService {
    getJob findBySchool(String school);
}
