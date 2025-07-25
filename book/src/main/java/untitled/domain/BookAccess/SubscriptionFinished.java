package untitled.domain.BookAccess;

import java.util.*;
import lombok.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class SubscriptionFinished extends AbstractEvent {

    private Long id;
    private Long readerId;
    private Date subscribeStartDate;
    private Date subscribeEndDate;
}
