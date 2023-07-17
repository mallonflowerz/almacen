package com.mallonflowerz.almacen.configuration.profiles;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("personal.properties")
@Profile("personal")
public class PersonalProfile {
    
}
