package com.indice.gezgin.message.mapper;

import com.indice.gezgin.message.dto.request.IcpMessageRequest;
import com.indice.gezgin.message.dto.response.IcpMessageResponse;
import com.indice.gezgin.message.model.Message;
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
public class MessageMapperImpl implements MessageMapper {

    @Override
    public Message getMessageEntity(IcpMessageRequest payload) {
        if ( payload == null ) {
            return null;
        }

        Message.MessageBuilder message = Message.builder();

        message.type( payload.getType() );
        message.fullNameOfSender( payload.getFullNameOfSender() );
        message.contactOfSender( payload.getContactOfSender() );
        message.message( payload.getMessage() );

        return message.build();
    }

    @Override
    public IcpMessageResponse getMessageResponse(Message message) {
        if ( message == null ) {
            return null;
        }

        IcpMessageResponse.IcpMessageResponseBuilder icpMessageResponse = IcpMessageResponse.builder();

        icpMessageResponse.id( message.getId() );
        if ( message.getCreatedAt() != null ) {
            icpMessageResponse.createdAt( LocalDateTime.ofInstant( message.getCreatedAt().toInstant(), ZoneOffset.UTC ).toLocalDate() );
        }
        icpMessageResponse.type( message.getType() );
        icpMessageResponse.fullNameOfSender( message.getFullNameOfSender() );
        icpMessageResponse.contactOfSender( message.getContactOfSender() );
        icpMessageResponse.message( message.getMessage() );

        return icpMessageResponse.build();
    }
}
