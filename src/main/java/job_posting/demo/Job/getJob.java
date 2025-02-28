package job_posting.demo.Job;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class getJob {

    @JsonProperty("GetJobInfo")
    private JobInfo jobinfo;

}
