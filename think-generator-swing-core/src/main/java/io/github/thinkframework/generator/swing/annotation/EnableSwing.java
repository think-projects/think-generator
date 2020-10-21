package io.github.thinkframework.generator.swing.annotation;

import io.github.thinkframework.generator.swing.configuration.SwingConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(value = {SwingConfiguration.class})
@Documented
public @interface EnableSwing {
}