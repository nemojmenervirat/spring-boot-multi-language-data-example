package com.nemojmenervirat.sbmlde.configuration;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

@Configuration
public class LocaleConfiguration implements WebMvcConfigurer {

	private static final List<Locale> SUPPORTED_LOCALES = Arrays.asList(new Locale("sr"), new Locale("es"), new Locale("en"));

	@Bean
	public LocaleResolver localeResolver() {
		AcceptHeaderLocaleResolver resolver = new AcceptHeaderLocaleResolver();
		resolver.setSupportedLocales(SUPPORTED_LOCALES);
		return resolver;
	}

}
