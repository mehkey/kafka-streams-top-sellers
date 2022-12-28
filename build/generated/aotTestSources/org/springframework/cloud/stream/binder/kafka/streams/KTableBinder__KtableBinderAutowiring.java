package org.springframework.cloud.stream.binder.kafka.streams;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link KTableBinder}.
 */
public class KTableBinder__KtableBinderAutowiring {
  /**
   * Apply the autowiring.
   */
  public static KTableBinder apply(RegisteredBean registeredBean, KTableBinder instance) {
    AutowiredFieldValueResolver.forField("consumerBindingRetryTemplates").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
