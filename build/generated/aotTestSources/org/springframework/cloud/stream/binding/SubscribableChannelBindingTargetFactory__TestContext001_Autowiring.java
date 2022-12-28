package org.springframework.cloud.stream.binding;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link SubscribableChannelBindingTargetFactory}.
 */
public class SubscribableChannelBindingTargetFactory__TestContext001_Autowiring {
  /**
   * Apply the autowiring.
   */
  public static SubscribableChannelBindingTargetFactory apply(RegisteredBean registeredBean,
      SubscribableChannelBindingTargetFactory instance) {
    AutowiredFieldValueResolver.forRequiredField("context").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
