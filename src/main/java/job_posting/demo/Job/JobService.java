package job_posting.demo.Job;

import reactor.core.publisher.Mono;

public interface JobService {
    GetJob findBySchoolAndType(String school, String type);

    Mono<GetJob> findByLocation(String school, String type, String location);
    Mono<GetJob> findByExperience(String school, String type, String exp);
    Mono<GetJob> findByLocationAndExperience(String school, String type, String location, String exp);
}
