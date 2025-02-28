package job_posting.demo.Job;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class JobController {
    private final JobService jobService;

    @Autowired
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/job/{school}")
    public ResponseEntity<getJob> findBySchool(@PathVariable("school") String school) {

        getJob bySchool = jobService.findBySchool(school);

        return new ResponseEntity<>(bySchool, HttpStatus.OK);
    }



}
