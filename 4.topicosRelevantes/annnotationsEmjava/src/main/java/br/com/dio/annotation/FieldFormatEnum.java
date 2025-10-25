package br.com.dio.annotation;

import java.lang.reflect.Field;
import java.util.function.Function;

public enum FieldFormatEnum {
	CAMEL_CASE(field -> field),
	PASCAL_CASE(field -> LOWER_CAMEL.to(UPPER_CAMEL)),
	SNAKE_CASE(),
	KEBAB_CASE();

	private final Function <String, String> format;

	FieldFormatEnum(Function<String, String> format){
		this.format = format;
	}

	public Function<String, String> getFormat() {
		return format;
	}
}
