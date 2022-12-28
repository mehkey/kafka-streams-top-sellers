package org.springframework.cloud.stream.config;

import java.lang.Class;
import java.lang.String;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.core.convert.converter.Converter;
import org.springframework.expression.Expression;
import org.springframework.integration.expression.SpelPropertyAccessorRegistrar;

/**
 * Bean definitions for {@link SpelExpressionConverterConfiguration}
 */
public class SpelExpressionConverterConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'spelExpressionConverterConfiguration'
   */
  public static BeanDefinition getSpelExpressionConverterConfigurationBeanDefinition() {
    Class<?> beanType = SpelExpressionConverterConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setInstanceSupplier(SpelExpressionConverterConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean definition for 'spelPropertyAccessorRegistrar'
   */
  public static BeanDefinition getSpelPropertyAccessorRegistrarBeanDefinition() {
    Class<?> beanType = SpelPropertyAccessorRegistrar.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(BeanInstanceSupplier.<SpelPropertyAccessorRegistrar>forFactoryMethod(SpelExpressionConverterConfiguration.class, "spelPropertyAccessorRegistrar").withGenerator(SpelExpressionConverterConfiguration::spelPropertyAccessorRegistrar));
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'spelConverter'.
   */
  private static BeanInstanceSupplier<Converter> getSpelConverterInstanceSupplier() {
    return BeanInstanceSupplier.<Converter>forFactoryMethod(SpelExpressionConverterConfiguration.class, "spelConverter", ConfigurableApplicationContext.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(SpelExpressionConverterConfiguration.class).spelConverter(args.get(0)));
  }

  /**
   * Get the bean definition for 'spelConverter'
   */
  public static BeanDefinition getSpelConverterBeanDefinition() {
    ResolvableType beanType = ResolvableType.forClassWithGenerics(Converter.class, String.class, Expression.class);
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getSpelConverterInstanceSupplier());
    return beanDefinition;
  }
}
