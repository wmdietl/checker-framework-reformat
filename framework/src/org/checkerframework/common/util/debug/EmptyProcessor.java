package org.checkerframework.common.util.debug;

import java.util.Set;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;

/**
 * Empty simple processor.
 *
 * It is useful in debugging compiler behavior with an annotation processor
 * present.
 *
 */
@SupportedAnnotationTypes("*")
public class EmptyProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        System.out.println("Empty Processor run!");
        return false;
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }
}
