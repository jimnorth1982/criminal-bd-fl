package com.example.demo

import com.mongodb.MongoClient
import com.mongodb.MongoClientSettings
import com.mongodb.client.MongoCollection
import org.bson.codecs.configuration.CodecRegistries
import org.bson.codecs.pojo.PojoCodecProvider
import org.springframework.batch.item.ItemWriter
import org.springframework.batch.item.file.FlatFileItemReader
import org.springframework.batch.item.file.LineMapper
import org.springframework.core.io.Resource


val mongoClient: MongoClient = MongoClient("127.0.0.1", 27017)

fun reader(resource: Resource, mapper: LineMapper<CriminalData>): FlatFileItemReader<CriminalData> {
    val reader = FlatFileItemReader<CriminalData>()
    reader.setResource(resource)
    reader.setLinesToSkip(7)
    reader.setLineMapper(mapper)
    reader.setResource(resource)
    return reader
}

fun writer(): ItemWriter<CriminalData> {
    return ItemWriter { criminalDataList ->
        val codecRegistry = CodecRegistries.fromRegistries(
                MongoClientSettings.getDefaultCodecRegistry(),
                CodecRegistries.fromProviders(PojoCodecProvider.builder().automatic(true).build())
        )
        val db = mongoClient.getDatabase("fl-hillsborough").withCodecRegistry(codecRegistry)
        val criminalDataCollection: MongoCollection<CriminalData> = db.getCollection("criminalData",
                CriminalData::class.java)
        criminalDataCollection.insertMany(criminalDataList)
    }
}

