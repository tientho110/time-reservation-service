package com.nguyentientho;

import com.nguyentientho.model.AmenityType;
import com.nguyentientho.model.Capacity;
import com.nguyentientho.model.User;
import com.nguyentientho.repos.CapacityRepository;
import com.nguyentientho.repos.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class TimeReservationApplication {

  private Map<AmenityType, Integer> initialCapacities =
      new HashMap<>() {
        {
          put(AmenityType.GYM, 30);
          put(AmenityType.POOL, 10);
          put(AmenityType.SAUNA, 3);
          put(AmenityType.YOGA, 10);
          put(AmenityType.BOXING, 1);
          put(AmenityType.PILATES, 5);
          put(AmenityType.LESMILLS, 2);
          put(AmenityType.AROBIC, 10);
          put(AmenityType.HIIT, 5);
          put(AmenityType.CALISTHENICS, 10);
        }
      };

  public static void main(String[] args) {
    SpringApplication.run(TimeReservationApplication.class, args);
  }

  @Bean
  public CommandLineRunner loadData(
      UserRepository userRepository,
      CapacityRepository capacityRepository) {
    return (args) -> {
      userRepository.save(
              new User("Nguyen Tien tho", "tientho110", bCryptPasswordEncoder().encode("123456")));
      userRepository.save(
              new User("Nguyen Huong Giang", "giang123", bCryptPasswordEncoder().encode("123456")));

      for (AmenityType amenityType : initialCapacities.keySet()) {
        capacityRepository.save(new Capacity(amenityType, initialCapacities.get(amenityType)));
      }
    };
  }

  @Bean
  public BCryptPasswordEncoder bCryptPasswordEncoder() {
    return new BCryptPasswordEncoder();
  }
}
