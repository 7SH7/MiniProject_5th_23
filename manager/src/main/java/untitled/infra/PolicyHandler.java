package untitled.infra;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import untitled.config.kafka.KafkaProcessor;
import untitled.domain.*;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    ManageAuthorRepository manageAuthorRepository;

    @Autowired
    ManageReaderInfoRepository manageReaderInfoRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='RegisterRequested'"
    )
    public void wheneverRegisterRequested_RegisterNewAuthor(
        @Payload RegisterRequested registerRequested
    ) {
        RegisterRequested event = registerRequested;
        System.out.println(
            "\n\n##### listener RegisterNewAuthor : " +
            registerRequested +
            "\n\n"
        );

        ManageAuthor.registerNewAuthor(event);
    }
}
