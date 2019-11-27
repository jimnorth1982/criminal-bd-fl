package com.example.demo

data class CriminalData(
        val nameType: String,
        val blank: String,
        val name: String,
        val pid: String,
        val partyCode: String,
        val defendantCaseNumber: String,
        val division: String,
        val sex: String,
        val race: String,
        val dateOfBirth: String,
        val dateOfFiling: String,
        val numberOfCount: Int,
        val levelOfCount: String,
        val chargeDescription: String,
        val dispositionCode: String,
        val dispositionDate: String
)