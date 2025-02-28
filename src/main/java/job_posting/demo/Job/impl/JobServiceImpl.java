package job_posting.demo.Job.impl;

import job_posting.demo.Job.JobInfo;
import job_posting.demo.Job.JobService;
import job_posting.demo.Job.Laptop;
import job_posting.demo.Job.getJob;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatusCode;
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
    public getJob findBySchool(String school) {
        int listTotalCount = this.webClient.get()
                .uri(KEY + "/json/GetJobInfo/1/1/" + school)
                .retrieve()
                .bodyToMono(getJob.class).block().getJobinfo().getListTotalCount();


        return this.webClient.get()
                .uri(KEY + "/json/GetJobInfo/1/" + listTotalCount + "/" + school)
                .retrieve()
                .bodyToMono(getJob.class).block();
    }

}
