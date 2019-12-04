package com.example.demo

import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper
import org.springframework.batch.item.file.mapping.DefaultLineMapper
import org.springframework.batch.item.file.transform.FixedLengthTokenizer
import org.springframework.batch.item.file.transform.Range
import java.io.UnsupportedEncodingException
import java.util.*


fun getFixedWidthLineMapper(): DefaultLineMapper<CriminalData> {
    return buildCustom(DefaultLineMapper())
}

private fun buildCustom(lineMapper: DefaultLineMapper<CriminalData>): DefaultLineMapper<CriminalData> {
    lineMapper.setLineTokenizer(fixedWidthTokenizer())
    lineMapper.setFieldSetMapper(beanWrapperFieldSetMapper())
    return lineMapper
}

private fun beanWrapperFieldSetMapper(): BeanWrapperFieldSetMapper<CriminalData> {
    val mapper = BeanWrapperFieldSetMapper<CriminalData>()
    mapper.setTargetType(CriminalData::class.java)
    return mapper
}

private fun fixedWidthTokenizer(): FixedLengthTokenizer {
    val tokenizer = CustomFixedLengthTokenizer()
    tokenizer.setNames("nameType",
            "blank",
            "name",
            "blank1",
            "pid",
            "blank2",
            "partyCode",
            "blank3",
            "defendantCaseNumber",
            "blank4",
            "division",
            "blank5",
            "sex",
            "blank6",
            "race",
            "blank7",
            "dateOfBirth",
            "blank8",
            "dateOfFiling",
            "blank9",
            "numberOfCount",
            "blank10",
            "levelOfCount",
            "blank11",
            "chargeDescription",
            "blank12",
            "dispositionCode",
            "blank13",
            "dispositionDate")
    tokenizer.setColumns(
            arrayOf(
                    Range(1, 1),
                    Range(2, 2),
                    Range(3, 37),
                    Range(38, 38),
                    Range(39, 48),
                    Range(49, 49),
                    Range(50, 53),
                    Range(54, 54),
                    Range(55, 69),
                    Range(70, 70),
                    Range(71, 73),
                    Range(74, 76),
                    Range(77, 77),
                    Range(78, 78),
                    Range(79, 79),
                    Range(80, 81),
                    Range(82, 89),
                    Range(90, 93),
                    Range(94, 101),
                    Range(102, 103),
                    Range(104, 106),
                    Range(107, 107),
                    Range(108, 110),
                    Range(111, 112),
                    Range(113, 158),
                    Range(159, 160),
                    Range(161, 170),
                    Range(171, 171),
                    Range(172, 179)
            )
    )
    return tokenizer
}

class CustomFixedLengthTokenizer : FixedLengthTokenizer() {
    private lateinit var ranges: Array<Range>
    override fun setColumns(columns: Array<Range>) {
        this.ranges = columns
    }

    public override fun doTokenize(line: String): List<String> {
        val tokens: MutableList<String> = ArrayList(ranges.size)
        var token: String
        try {
            val b = line.toByteArray()
            val lineLength = b.size
            for (i in ranges.indices) {
                val startPos = ranges[i].min - 1
                val endPos = ranges[i].max
                token = if (lineLength >= endPos) {
                    getString(b, startPos, endPos)
                } else if (lineLength >= startPos) {
                    getString(b, startPos, lineLength)
                } else {
                    ""
                }
                tokens.add(token)
            }
        } catch (e: UnsupportedEncodingException) {
            loggerFor<CustomFixedLengthTokenizer>().error(e.message, e)
        }
        return tokens
    }

    @Throws(UnsupportedEncodingException::class)
    private fun getString(b: ByteArray, startPos: Int, endPos: Int): String {
        val token: String
        val subB: ByteArray = Arrays.copyOfRange(b, startPos, endPos)
        token = String(subB)
        return token
    }
}