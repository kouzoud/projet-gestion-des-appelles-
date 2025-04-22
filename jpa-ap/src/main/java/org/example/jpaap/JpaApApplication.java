package org.example.jpaap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.jpaap.entity.Patiant;
import org.example.jpaap.repository.PatiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SpringBootApplication
public class JpaApApplication  implements CommandLineRunner {
    @Autowired
    private PatiantRepository patiantRepository;
    public static void main(String[] args) {
        SpringApplication.run(JpaApApplication.class, args);
        System.out.println("das");

    }

    @Override
    public void run(String... args) throws Exception {
      for (int i = 0; i < 100; i++) {
          patiantRepository.save(new Patiant("simo",(int)(Math.random()*100),Math.random()>0.5?true:false,new Date()));
      }
        Page<Patiant> page =patiantRepository.findAll(PageRequest.of(0,5));
      page.forEach(patiant -> patiantRepository.findByScore(false,PageRequest.of(0,1)).forEach(p->System.out.println(p.getName())));
        System.out.println("=========================");
      page.forEach(patiant -> patiantRepository.chercher(18,20).forEach(p->System.out.println(p.getAge())));
    }
}
