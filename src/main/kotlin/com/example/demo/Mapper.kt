package com.example.demo

import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper
import org.springframework.batch.item.file.mapping.DefaultLineMapper
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer

fun getPipeDelimitedLineMapper(): DefaultLineMapper<CriminalData> {
    return buildCustom(DefaultLineMapper())
}

private fun buildCustom(lineMapper: DefaultLineMapper<CriminalData>): DefaultLineMapper<CriminalData> {
    lineMapper.setLineTokenizer(delimitedLineTokenizer())
    lineMapper.setFieldSetMapper(beanWrapperFieldSetMapper())
    return lineMapper
}

private fun beanWrapperFieldSetMapper(): BeanWrapperFieldSetMapper<CriminalData> {
    val mapper = BeanWrapperFieldSetMapper<CriminalData>()
    mapper.setTargetType(CriminalData::class.java)
    return mapper
}

private fun delimitedLineTokenizer(): DelimitedLineTokenizer {
    val tokenizer = DelimitedLineTokenizer()
    tokenizer.setDelimiter("|");
    tokenizer.setStrict(false);
    return tokenizer
}