package com.indice.gezgin.ads.mapper;

import com.indice.gezgin.ads.dto.request.IcpAdsJsonRequest;
import com.indice.gezgin.ads.dto.request.IcpAdsRequest;
import com.indice.gezgin.ads.dto.response.IcpAdsResponseAdmin;
import com.indice.gezgin.ads.dto.response.IcpAdsResponseUser;
import com.indice.gezgin.ads.model.Ads;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-02T17:36:53+0400",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class AdsMapperImpl implements AdsMapper {

    @Override
    public Ads getAdsFromRequest(IcpAdsRequest request) {
        if ( request == null ) {
            return null;
        }

        Ads.AdsBuilder ads = Ads.builder();

        ads.companyName( request.getCompanyName() );
        ads.linkedUrl( request.getLinkedUrl() );
        ads.deadLine( request.getDeadLine() );

        return ads.build();
    }

    @Override
    public Ads getAdsFromJsonRequest(IcpAdsJsonRequest request) {
        if ( request == null ) {
            return null;
        }

        Ads.AdsBuilder ads = Ads.builder();

        ads.companyName( request.getCompanyName() );
        ads.linkedUrl( request.getLinkedUrl() );
        ads.pictureUrl( request.getPictureUrl() );
        ads.deadLine( request.getDeadLine() );

        return ads.build();
    }

    @Override
    public IcpAdsResponseAdmin getResponseFromEntity(Ads ads) {
        if ( ads == null ) {
            return null;
        }

        IcpAdsResponseAdmin.IcpAdsResponseAdminBuilder icpAdsResponseAdmin = IcpAdsResponseAdmin.builder();

        icpAdsResponseAdmin.id( ads.getId() );
        icpAdsResponseAdmin.companyName( ads.getCompanyName() );
        icpAdsResponseAdmin.linkedUrl( ads.getLinkedUrl() );
        icpAdsResponseAdmin.pictureUrl( ads.getPictureUrl() );
        icpAdsResponseAdmin.deadLine( ads.getDeadLine() );
        if ( ads.getCreatedAt() != null ) {
            icpAdsResponseAdmin.createdAt( LocalDateTime.ofInstant( ads.getCreatedAt().toInstant(), ZoneOffset.UTC ).toLocalDate() );
        }

        return icpAdsResponseAdmin.build();
    }

    @Override
    public IcpAdsResponseUser getResponseFromEntityForUser(Ads ads) {
        if ( ads == null ) {
            return null;
        }

        IcpAdsResponseUser.IcpAdsResponseUserBuilder icpAdsResponseUser = IcpAdsResponseUser.builder();

        icpAdsResponseUser.id( ads.getId() );
        icpAdsResponseUser.linkedUrl( ads.getLinkedUrl() );
        icpAdsResponseUser.pictureUrl( ads.getPictureUrl() );

        return icpAdsResponseUser.build();
    }
}
