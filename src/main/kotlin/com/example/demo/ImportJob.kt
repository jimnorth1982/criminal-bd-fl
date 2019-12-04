package com.example.demo

import org.springframework.batch.core.Job
import org.springframework.batch.core.Step
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory
import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.io.FileSystemResource

@Configuration
class ImportJob(val jobBuilderFactory: JobBuilderFactory,
                val stepBuilderFactory: StepBuilderFactory) : ApplicationContextAware {

    private lateinit var applicationContext: ApplicationContext

    companion object {
        val log = loggerFor<ImportJob>()
    }

    @Bean
    fun step1(): Step {
        return stepBuilderFactory.get("step1")
                .chunk<CriminalData, CriminalData>(500)
                .reader(reader(FileSystemResource("/data/intake/FF1020CF.WP"), getFixedWidthLineMapper()))
                .writer(writer())
                .build()
    }

    @Bean
    fun job(): Job {
        return jobBuilderFactory.get("job")
                .start(step1())
                .build()
    }

    override fun setApplicationContext(applicationContext: ApplicationContext) {
        this.applicationContext = applicationContext
    }
}
