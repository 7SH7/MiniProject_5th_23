package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class SubscribeHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Subscribe>> {

    @Override
    public EntityModel<Subscribe> process(EntityModel<Subscribe> model) {
        return model;
    }
}
