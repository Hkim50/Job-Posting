package job_posting.demo.Job;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobInfo {

    @JsonProperty("list_total_count")
    private int listTotalCount;

    @JsonProperty("RESULT")
    private Result result;

    @JsonProperty("row")
    private List<JobRow> row;

    @Getter
    @Setter
    public static class Result {
        @JsonProperty("CODE")
        private String code;

        @JsonProperty("MESSAGE")
        private String message;
    }

    @Getter
    @Setter
    public static class JobRow {
        @JsonProperty("JO_REQST_NO")
        private String joReqstNo;

        @JsonProperty("JO_REGIST_NO")
        private String joRegistNo;

        @JsonProperty("CMPNY_NM")
        private String cmpnyNm;

        @JsonProperty("BSN_SUMMARY_CN")
        private String bsnSummaryCn;

        @JsonProperty("RCRIT_JSSFC_CMMN_CODE_SE")
        private String rcritJssfcCmmnCodeSe;

        @JsonProperty("JOBCODE_NM")
        private String jobcodeNm;

        @JsonProperty("RCRIT_NMPR_CO")
        private Double rcritNmprCo;

        @JsonProperty("ACDMCR_CMMN_CODE_SE")
        private String acdmcrCmmnCodeSe;

        @JsonProperty("ACDMCR_NM")
        private String acdmcrNm;

        @JsonProperty("EMPLYM_STLE_CMMN_CODE_SE")
        private String emplymStleCmmnCodeSe;

        @JsonProperty("EMPLYM_STLE_CMMN_MM")
        private String emplymStleCmmnMm;

        @JsonProperty("WORK_PARAR_BASS_ADRES_CN")
        private String workPararBassAdresCn;

        @JsonProperty("SUBWAY_NM")
        private String subwayNm;

        @JsonProperty("DTY_CN")
        private String dtyCn;

        @JsonProperty("CAREER_CND_CMMN_CODE_SE")
        private String careerCndCmmnCodeSe;

        @JsonProperty("CAREER_CND_NM")
        private String careerCndNm;

        @JsonProperty("HOPE_WAGE")
        private String hopeWage;

        @JsonProperty("RET_GRANTS_NM")
        private String retGrantsNm;

        @JsonProperty("WORK_TIME_NM")
        private String workTimeNm;

        @JsonProperty("WORK_TM_NM")
        private String workTmNm;

        @JsonProperty("HOLIDAY_NM")
        private String holidayNm;

        @JsonProperty("WEEK_WORK_HR")
        private String weekWorkHr;

        @JsonProperty("JO_FEINSR_SBSCRB_NM")
        private String joFeinsrSbscrbNm;

        @JsonProperty("RCEPT_CLOS_NM")
        private String rceptClosNm;

        @JsonProperty("MODEL_MTH_NM")
        private String modelMthNm;

        @JsonProperty("RCEPT_MTH_NM")
        private String rceptMthNm;

        @JsonProperty("PRESENTN_PAPERS_NM")
        private String presentnPapersNm;

        @JsonProperty("MNGR_NM")
        private String mngrNm;

        @JsonProperty("MNGR_PHON_NO")
        private String mngrPhonNo;

        @JsonProperty("MNGR_INSTT_NM")
        private String mngrInsttNm;

        @JsonProperty("BASS_ADRES_CN")
        private String bassAdresCn;

        @JsonProperty("JO_SJ")
        private String joSj;

        @JsonProperty("JO_REG_DT")
        private String joRegDt;

        @JsonProperty("GUI_LN")
        private String guiLn;
    }
}
