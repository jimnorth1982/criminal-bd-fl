package com.example.demo

import org.springframework.batch.item.ItemWriter
import org.springframework.batch.item.file.FlatFileItemReader
import org.springframework.batch.item.file.LineMapper
import org.springframework.core.io.Resource
import org.springframework.data.mongodb.repository.MongoRepository

fun reader(resource: Resource, mapper: LineMapper<CriminalData>): FlatFileItemReader<CriminalData> {
    val reader = FlatFileItemReader<CriminalData>();
    reader.setResource(resource);
    reader.setLinesToSkip(1);
    reader.setLineMapper(mapper);
    reader.setResource(resource);
    reader.setLinesToSkip(1);
    reader.setLineMapper(mapper);
    return reader
}

fun writer(repository: MongoRepository<CriminalData, Long>): ItemWriter<CriminalData> {
    return ItemWriter {
        repository.insert(it)
    }
}