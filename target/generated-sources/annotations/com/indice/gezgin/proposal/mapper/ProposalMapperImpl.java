package com.indice.gezgin.proposal.mapper;

import com.indice.gezgin.proposal.dto.request.IcpProposalRequest;
import com.indice.gezgin.proposal.dto.response.IcpProposalResponse;
import com.indice.gezgin.proposal.model.Proposal;
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
public class ProposalMapperImpl implements ProposalMapper {

    @Override
    public Proposal getProposalModel(IcpProposalRequest request) {
        if ( request == null ) {
            return null;
        }

        Proposal.ProposalBuilder proposal = Proposal.builder();

        proposal.placeName( request.getPlaceName() );
        proposal.placeAddress( request.getPlaceAddress() );
        proposal.placeContact( request.getPlaceContact() );
        proposal.placeReason( request.getPlaceReason() );

        return proposal.build();
    }

    @Override
    public IcpProposalResponse getProposalResponse(Proposal proposal) {
        if ( proposal == null ) {
            return null;
        }

        IcpProposalResponse.IcpProposalResponseBuilder icpProposalResponse = IcpProposalResponse.builder();

        icpProposalResponse.id( proposal.getId() );
        if ( proposal.getCreatedAt() != null ) {
            icpProposalResponse.createdAt( LocalDateTime.ofInstant( proposal.getCreatedAt().toInstant(), ZoneOffset.UTC ).toLocalDate() );
        }
        icpProposalResponse.placeName( proposal.getPlaceName() );
        icpProposalResponse.placeAddress( proposal.getPlaceAddress() );
        icpProposalResponse.placeContact( proposal.getPlaceContact() );
        icpProposalResponse.placeReason( proposal.getPlaceReason() );

        return icpProposalResponse.build();
    }
}
