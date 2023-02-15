package com.gyan.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.gyan.bean.Rating;
import com.gyan.persistence.RatingDao;

@SpringBootApplication(scanBasePackages = "com.gyan")
@EnableJpaRepositories(basePackages = "com.gyan.persistence")
@EntityScan("com.gyan.bean")
public class RatingServiceApplication implements CommandLineRunner {
	@Autowired
	private RatingDao ratingDao;

	public static void main(String[] args) {
		SpringApplication.run(RatingServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		ratingDao.save(new Rating(1,"U001","M002",4));
//		ratingDao.save(new Rating(2,"U001","M004",3));
//		ratingDao.save(new Rating(3,"U001","M005",5));
//		ratingDao.save(new Rating(4,"U002","M002",4));
//		ratingDao.save(new Rating(5,"U002","M001",4));
//		ratingDao.save(new Rating(6,"U003","M001",4));
//		ratingDao.save(new Rating(7,"U004","M003",4));
//		ratingDao.save(new Rating(8,"U004","M005",4));
//		ratingDao.save(new Rating(9,"U004","M001",4));
//		ratingDao.save(new Rating(10,"U005","M002",4));
		
	}

}
