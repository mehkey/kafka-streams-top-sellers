package org.springframework.cloud.stream.binder.test;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link TestChannelBinderProvisioner}.
 */
public class TestChannelBinderProvisioner__IntegrationBinderAutowiring {
  /**
   * Apply the autowiring.
   */
  public static TestChannelBinderProvisioner apply(RegisteredBean registeredBean,
      TestChannelBinderProvisioner instance) {
    AutowiredFieldValueResolver.forRequiredField("source").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("target").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
