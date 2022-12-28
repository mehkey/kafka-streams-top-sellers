package org.springframework.cloud.stream.binder.kafka.streams;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link KStreamBinder}.
 */
public class KStreamBinder__KstreamBinderAutowiring {
  /**
   * Apply the autowiring.
   */
  public static KStreamBinder apply(RegisteredBean registeredBean, KStreamBinder instance) {
    AutowiredFieldValueResolver.forField("consumerBindingRetryTemplates").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
