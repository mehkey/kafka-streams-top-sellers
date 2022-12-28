package org.springframework.cloud.stream.binder.kafka;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link KafkaMessageChannelBinder}.
 */
public class KafkaMessageChannelBinder__KafkaBinderAutowiring {
  /**
   * Apply the autowiring.
   */
  public static KafkaMessageChannelBinder apply(RegisteredBean registeredBean,
      KafkaMessageChannelBinder instance) {
    AutowiredFieldValueResolver.forField("consumerBindingRetryTemplates").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
