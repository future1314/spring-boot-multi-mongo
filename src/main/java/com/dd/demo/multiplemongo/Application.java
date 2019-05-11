package com.dd.demo.multiplemongo;

import com.dd.demo.multiplemongo.repository.primary.PrimaryRepository;
import com.dd.demo.multiplemongo.repository.primary.PrimaryModel;
import com.dd.demo.multiplemongo.repository.secondary.SecondaryModel;
import com.dd.demo.multiplemongo.repository.secondary.SecondaryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private PrimaryRepository primaryRepository;

    @Autowired
    private SecondaryRepository secondaryRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        log.info("----------main---------");//后执行
    }

    @Override
    public void run(String... args) throws Exception {//run是执行入口
        log.info("************************************************************");
        log.info("Start printing mongo objects");
        log.info("************************************************************");
        this.primaryRepository.save(new PrimaryModel("12", "Primary database plain object"));//如果不指定ID，id 是自动生成的。

        this.secondaryRepository.save(new SecondaryModel("34", "Secondary database plain object"));

        List<PrimaryModel> primaries = this.primaryRepository.findAll();
        for (PrimaryModel primary : primaries) {
            log.info(primary.toString());
        }

        List<SecondaryModel> secondaries = this.secondaryRepository.findAll();

        for (SecondaryModel secondary : secondaries) {
            log.info(secondary.toString());
        }

        log.info("************************************************************");
        log.info("Ended printing mongo objects");
        log.info("************************************************************");

    }
}

