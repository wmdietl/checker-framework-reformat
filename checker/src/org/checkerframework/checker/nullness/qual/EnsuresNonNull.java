package org.checkerframework.checker.nullness.qual;

import org.checkerframework.framework.qual.InheritedAnnotation;
import org.checkerframework.framework.qual.PostconditionAnnotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that the value expressions are non-null, if the method
 * terminates successfully.
 * <p>
 *
 * This postcondition annotation is useful for methods that initialize a
 * field.  It can also be used for a method that fails if a given
 * expression is null.
 *
 * @see NonNull
 * @see org.checkerframework.checker.nullness.NullnessChecker
 * @checker_framework.manual #nullness-checker Nullness Checker
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@PostconditionAnnotation(qualifier = NonNull.class)
@InheritedAnnotation
public @interface EnsuresNonNull {
    /**
     * The Java expressions that are ensured to be {@link NonNull} on successful
     * method termination.
     *
     * @checker_framework.manual #java-expressions-as-arguments Syntax of Java expressions
     */
    String[] value();
}
