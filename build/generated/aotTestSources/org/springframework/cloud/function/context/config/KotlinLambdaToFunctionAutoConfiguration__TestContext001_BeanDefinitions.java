package org.springframework.cloud.function.context.config;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link KotlinLambdaToFunctionAutoConfiguration}
 */
public class KotlinLambdaToFunctionAutoConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'kotlinLambdaToFunctionAutoConfiguration'
   */
  public static BeanDefinition getKotlinLambdaToFunctionAutoConfigurationBeanDefinition() {
    Class<?> beanType = KotlinLambdaToFunctionAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    ConfigurationClassUtils.initializeConfigurationClass(KotlinLambdaToFunctionAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(KotlinLambdaToFunctionAutoConfiguration$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
