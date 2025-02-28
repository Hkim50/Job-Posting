package job_posting.demo.Job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/job")
public class JobController {
    private final JobService jobService;

    @Autowired
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/{school}/{typeOfEm}")
    public ResponseEntity<GetJob> findBySchoolAndType(@PathVariable("school") String school, @PathVariable("typeOfEm") String type) {

        GetJob bySchoolAndType = jobService.findBySchoolAndType(school, type);

        if (bySchoolAndType == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok(bySchoolAndType);
    }

    @GetMapping("/{school}/{typeOfEm}/location/{location}")
    public Mono<ResponseEntity<GetJob>> findByLocation(@PathVariable("school") String school,
                                                       @PathVariable("typeOfEm") String type,
                                                       @PathVariable("location") String location) {

        Mono<GetJob> byLocation = jobService.findByLocation(school, type, location);

        return byLocation
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @GetMapping("/{school}/{typeOfEm}/experience/{exp}")
    public Mono<ResponseEntity<GetJob>> findByExperience(@PathVariable("school") String school,
                                                         @PathVariable("typeOfEm") String type,
                                                         @PathVariable("exp") String exp) {
        Mono<GetJob> byExperience = jobService.findByExperience(school, type, exp);

        return byExperience
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @GetMapping("/{school}/{typeOfEm}/{location}/{exp}")
    public Mono<ResponseEntity<GetJob>> findByLocationAndExperience(@PathVariable("school") String school,
                                                                    @PathVariable("typeOfEm") String type,
                                                                    @PathVariable("location") String location,
                                                                    @PathVariable("exp") String exp) {
        Mono<GetJob> byLocationAndExperience = jobService.findByLocationAndExperience(school, type, location, exp);

        return byLocationAndExperience
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }
}
