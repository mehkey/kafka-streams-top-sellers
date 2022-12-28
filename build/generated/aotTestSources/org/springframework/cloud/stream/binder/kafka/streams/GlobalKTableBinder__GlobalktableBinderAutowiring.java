package org.springframework.cloud.stream.binder.kafka.streams;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link GlobalKTableBinder}.
 */
public class GlobalKTableBinder__GlobalktableBinderAutowiring {
  /**
   * Apply the autowiring.
   */
  public static GlobalKTableBinder apply(RegisteredBean registeredBean,
      GlobalKTableBinder instance) {
    AutowiredFieldValueResolver.forField("consumerBindingRetryTemplates").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
