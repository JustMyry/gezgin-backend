package com.indice.gezgin.user.mapper;

import com.indice.gezgin.auth.dto.IcpSignUpAsAdmin;
import com.indice.gezgin.user.dto.request.IcpEditUser;
import com.indice.gezgin.user.dto.request.IcpEditUserPass;
import com.indice.gezgin.user.dto.response.IcpUserResponse;
import com.indice.gezgin.user.model.AppUser;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-13T03:07:20+0400",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public IcpUserResponse getSelfAccountFromUser(AppUser appUser) {
        if ( appUser == null ) {
            return null;
        }

        IcpUserResponse.IcpUserResponseBuilder icpUserResponse = IcpUserResponse.builder();

        icpUserResponse.userId( appUser.getUserId() );
        icpUserResponse.username( appUser.getUsername() );
        icpUserResponse.email( appUser.getEmail() );
        icpUserResponse.privacy( appUser.getPrivacy() );
        icpUserResponse.profilePictureUrl( appUser.getProfilePictureUrl() );
        icpUserResponse.bio( appUser.getBio() );
        icpUserResponse.phone( appUser.getPhone() );
        icpUserResponse.address( appUser.getAddress() );
        icpUserResponse.gender( appUser.getGender() );
        icpUserResponse.star( appUser.getStar() );
        icpUserResponse.howManyUserStared( appUser.getHowManyUserStared() );

        return icpUserResponse.build();
    }

    @Override
    public IcpUserResponse getEpAccountWithEmailFromUser(AppUser appUser) {
        if ( appUser == null ) {
            return null;
        }

        IcpUserResponse.IcpUserResponseBuilder icpUserResponse = IcpUserResponse.builder();

        icpUserResponse.bio( appUser.getBio() );
        icpUserResponse.profilePictureUrl( appUser.getProfilePictureUrl() );
        icpUserResponse.howManyUserStared( appUser.getHowManyUserStared() );
        icpUserResponse.userId( appUser.getUserId() );
        icpUserResponse.username( appUser.getUsername() );
        icpUserResponse.email( appUser.getEmail() );
        icpUserResponse.privacy( appUser.getPrivacy() );
        icpUserResponse.phone( appUser.getPhone() );
        icpUserResponse.address( appUser.getAddress() );
        icpUserResponse.gender( appUser.getGender() );
        icpUserResponse.star( appUser.getStar() );

        icpUserResponse.relation( "self" );

        return icpUserResponse.build();
    }

    @Override
    public IcpUserResponse getEpAccountWithoutEmailFromUser(AppUser appUser) {
        if ( appUser == null ) {
            return null;
        }

        IcpUserResponse.IcpUserResponseBuilder icpUserResponse = IcpUserResponse.builder();

        icpUserResponse.bio( appUser.getBio() );
        icpUserResponse.profilePictureUrl( appUser.getProfilePictureUrl() );
        icpUserResponse.howManyUserStared( appUser.getHowManyUserStared() );
        icpUserResponse.userId( appUser.getUserId() );
        icpUserResponse.username( appUser.getUsername() );
        icpUserResponse.privacy( appUser.getPrivacy() );
        icpUserResponse.gender( appUser.getGender() );
        icpUserResponse.star( appUser.getStar() );

        icpUserResponse.email( null );
        icpUserResponse.address( null );
        icpUserResponse.phone( null );

        return icpUserResponse.build();
    }

    @Override
    public void transferEditRequestToUser(IcpEditUser icpEditUser, AppUser appUser) {
        if ( icpEditUser == null ) {
            return;
        }

        appUser.setUsername( icpEditUser.getUsername() );
        appUser.setEmail( icpEditUser.getEmail() );
        appUser.setProfilePictureUrl( icpEditUser.getProfilePictureUrl() );
        appUser.setPrivacy( icpEditUser.getPrivacy() );
        appUser.setPhone( icpEditUser.getPhone() );
        appUser.setBio( icpEditUser.getBio() );
        appUser.setAddress( icpEditUser.getAddress() );
        appUser.setGender( icpEditUser.getGender() );
    }

    @Override
    public void transferPasswordRequestToUser(IcpEditUserPass userPassword, AppUser appUser) {
        if ( userPassword == null ) {
            return;
        }

        appUser.setPassword( userPassword.getNewPassword() );
    }

    @Override
    public AppUser getUserFromSignAsAdmin(IcpSignUpAsAdmin icpSignUpAsAdmin) {
        if ( icpSignUpAsAdmin == null ) {
            return null;
        }

        AppUser appUser = new AppUser();

        appUser.setUsername( icpSignUpAsAdmin.getUsername() );
        appUser.setPassword( icpSignUpAsAdmin.getPassword() );
        appUser.setPhone( icpSignUpAsAdmin.getPhone() );

        return appUser;
    }
}
