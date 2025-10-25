package br.com.dio.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.io.File;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Retention(RUNTIME)
@Target(ElementType.TYPE)
public @interface SerializerType {
	FieldFormatEnum fieldFormat();

}
