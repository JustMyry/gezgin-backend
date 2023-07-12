package com.indice.gezgin.place.mapper;

import com.indice.gezgin.place.dto.request.IcpPlaceRequest;
import com.indice.gezgin.place.dto.request.IcpPlacerRequestWithImage;
import com.indice.gezgin.place.dto.response.IcpPlaceResponse;
import com.indice.gezgin.place.model.Place;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-08T20:44:46+0400",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class PlaceMapperImpl implements PlaceMapper {

    @Override
    public Place getPlaceEntity(IcpPlaceRequest payload) {
        if ( payload == null ) {
            return null;
        }

        Place place = new Place();

        place.setName( payload.getName() );
        place.setAddress( payload.getAddress() );
        place.setDescription( payload.getDescription() );
        place.setType( payload.getType() );
        place.setAura( payload.getAura() );
        place.setTheme( payload.getTheme() );
        place.setArchitecture( payload.getArchitecture() );
        place.setRegion( payload.getRegion() );
        place.setOpenAir( payload.getOpenAir() );
        place.setOpens( payload.getOpens() );
        place.setCloses( payload.getCloses() );
        place.setContact( payload.getContact() );
        place.setFamily( payload.getFamily() );

        return place;
    }

    @Override
    public Place getPlaceFromWithJsonRequest(IcpPlacerRequestWithImage request) {
        if ( request == null ) {
            return null;
        }

        Place place = new Place();

        place.setContact( request.getContact() );
        place.setName( request.getName() );
        place.setAddress( request.getAddress() );
        place.setDescription( request.getDescription() );
        place.setType( request.getType() );
        place.setAura( request.getAura() );
        place.setTheme( request.getTheme() );
        place.setArchitecture( request.getArchitecture() );
        place.setRegion( request.getRegion() );
        place.setOpenAir( request.getOpenAir() );
        place.setOpens( request.getOpens() );
        place.setCloses( request.getCloses() );
        place.setMainPictureUrl( request.getMainPictureUrl() );
        place.setCoordinates( request.getCoordinates() );

        place.setActive( true );

        return place;
    }

    @Override
    public IcpPlaceResponse getPlaceResponse(Place place) {
        if ( place == null ) {
            return null;
        }

        IcpPlaceResponse.IcpPlaceResponseBuilder icpPlaceResponse = IcpPlaceResponse.builder();

        icpPlaceResponse.id( place.getId() );
        icpPlaceResponse.coordinates( place.getCoordinates() );
        icpPlaceResponse.contact( place.getContact() );
        icpPlaceResponse.name( place.getName() );
        icpPlaceResponse.mainPictureUrl( place.getMainPictureUrl() );
        icpPlaceResponse.address( place.getAddress() );
        icpPlaceResponse.description( place.getDescription() );
        icpPlaceResponse.type( place.getType() );
        icpPlaceResponse.aura( place.getAura() );
        icpPlaceResponse.theme( place.getTheme() );
        icpPlaceResponse.architecture( place.getArchitecture() );
        icpPlaceResponse.region( place.getRegion() );
        icpPlaceResponse.openAir( place.getOpenAir() );
        icpPlaceResponse.opens( place.getOpens() );
        icpPlaceResponse.closes( place.getCloses() );
        icpPlaceResponse.family( place.getFamily() );

        return icpPlaceResponse.build();
    }

    @Override
    public void TransferRequestToPlace(IcpPlaceRequest payload, Place place) {
        if ( payload == null ) {
            return;
        }

        place.setName( payload.getName() );
        place.setAddress( payload.getAddress() );
        place.setDescription( payload.getDescription() );
        place.setType( payload.getType() );
        place.setAura( payload.getAura() );
        place.setTheme( payload.getTheme() );
        place.setArchitecture( payload.getArchitecture() );
        place.setRegion( payload.getRegion() );
        place.setOpenAir( payload.getOpenAir() );
        place.setOpens( payload.getOpens() );
        place.setCloses( payload.getCloses() );
        place.setContact( payload.getContact() );
        place.setFamily( payload.getFamily() );
    }
}
