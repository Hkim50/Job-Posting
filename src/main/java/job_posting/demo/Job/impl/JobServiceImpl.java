package job_posting.demo.Job.impl;

import job_posting.demo.Job.JobService;
import job_posting.demo.Job.GetJob;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class JobServiceImpl implements JobService {
    @Autowired
    private WebClient webClient;

    @Value("${Job-info-key}")
    private String KEY;

    @Override
    public GetJob findBySchoolAndType(String school, String type) {
        int listTotalCount = this.webClient.get()
                .uri(KEY + "/json/GetJobInfo/1/1/" + school+"/"+type)
                .retrieve()
                .bodyToMono(GetJob.class).block().getJobinfo().getListTotalCount();


        return this.webClient.get()
                .uri(KEY + "/json/GetJobInfo/1/" + listTotalCount + "/" + school + "/" + type)
                .retrieve()
                .bodyToMono(GetJob.class).block();
    }

    @Override
    public Mono<GetJob> findByLocation(String school, String type, String location) {

        return this.webClient.get()
                .uri(KEY + "/json/GetJobInfo/1/1000/{school}/{type}/{location}", school , type, location)
                .retrieve()
                .bodyToMono(GetJob.class);
    }

    @Override
    public Mono<GetJob> findByExperience(String school, String type, String exp) {
        return this.webClient.get()
                .uri(KEY + "/json/GetJobInfo/1/1000/{school}/{type}/ /{exp}", school, type, exp)
                .retrieve()
                .bodyToMono(GetJob.class);
    }

    @Override
    public Mono<GetJob> findByLocationAndExperience(String school, String type, String location, String exp) {
        return this.webClient.get()
                .uri(KEY + "/json/GetJobInfo/1/1000/{school}/{type}/{location}/{exp}", school, type, location, exp)
                .retrieve()
                .bodyToMono(GetJob.class);
    }


}
