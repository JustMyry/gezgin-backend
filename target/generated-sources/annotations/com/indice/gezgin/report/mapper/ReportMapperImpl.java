package com.indice.gezgin.report.mapper;

import com.indice.gezgin.report.dto.request.IcpReportRequest;
import com.indice.gezgin.report.dto.response.IcpReportResponse;
import com.indice.gezgin.report.model.Report;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-13T03:07:20+0400",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class ReportMapperImpl implements ReportMapper {

    @Override
    public Report getReportEntity(IcpReportRequest request) {
        if ( request == null ) {
            return null;
        }

        Report.ReportBuilder report = Report.builder();

        report.reason( request.getReason() );
        report.details( request.getDetails() );

        return report.build();
    }

    @Override
    public IcpReportResponse getReportResponse(Report report) {
        if ( report == null ) {
            return null;
        }

        IcpReportResponse.IcpReportResponseBuilder icpReportResponse = IcpReportResponse.builder();

        icpReportResponse.id( report.getId() );
        if ( report.getCreatedAt() != null ) {
            icpReportResponse.createdAt( LocalDateTime.ofInstant( report.getCreatedAt().toInstant(), ZoneOffset.UTC ).toLocalDate() );
        }
        icpReportResponse.reportedPlace( report.getReportedPlace() );
        icpReportResponse.reason( report.getReason() );
        icpReportResponse.details( report.getDetails() );

        return icpReportResponse.build();
    }
}
